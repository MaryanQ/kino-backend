package dat3.Kino.service;

import dat3.Kino.dto.SeatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import dat3.Kino.repository.SeatRepository;
import java.util.Optional;

@Service
public class SeatService {

    private final SeatRepository seatRepository;

    @Autowired
    public SeatService(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    public SeatDTO getSeatById(int id) {
        return seatRepository.findById(id)
                .orElseThrow(() -> new SeatNotFoundException("Seat not found with id: " + id));
    }

    public List<SeatDTO> getAllSeats() {
        return seatRepository.findAll();
    }

    public SeatDTO createSeat(SeatDTO seatDTO) {
        return seatRepository.save(seatDTO);
    }

    public SeatDTO updateSeat(int id, SeatDTO updatedSeatDTO) {
        SeatDTO existingSeat = seatRepository.findById(id)
                .orElseThrow(() -> new SeatNotFoundException("Seat not found with id: " + id));

        existingSeat.setType(updatedSeatDTO.getType());
        existingSeat.setCapacity(updatedSeatDTO.getCapacity());
        existingSeat.setPrice(updatedSeatDTO.getPrice());

        return seatRepository.save(existingSeat);
    }

    public void deleteSeat(int id) {
        if (!seatRepository.existsById(id)) {
            throw new SeatNotFoundException("Seat not found with id: " + id);
        }
        seatRepository.deleteById(id);
    }
}
