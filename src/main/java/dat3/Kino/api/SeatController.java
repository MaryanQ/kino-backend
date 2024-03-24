package dat3.Kino.api;
import dat3.Kino.dto.SeatDTO;
import dat3.Kino.repository.SeatRepository;
import dat3.Kino.service.SeatNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seats")
public class SeatController {

    private final SeatRepository seatRepository;

    @Autowired
    public SeatController(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    @GetMapping("/{id}")
    public SeatDTO getSeatById(@PathVariable int id) {
        return seatRepository.findById(id)
                .orElseThrow(() -> new SeatNotFoundException("Seat not found with id: " + id));
    }

    @GetMapping
    public List<SeatDTO> getAllSeats() {
        return seatRepository.findAll();
    }

    @PostMapping
    public SeatDTO createSeat(@RequestBody SeatDTO seatDTO) {
        return seatRepository.save(seatDTO);
    }

    @PutMapping("/{id}")
    public SeatDTO updateSeat(@PathVariable int id, @RequestBody SeatDTO updatedSeatDTO) {
        SeatDTO existingSeat = seatRepository.findById(id)
                .orElseThrow(() -> new SeatNotFoundException("Seat not found with id: " + id));

        existingSeat.setType(updatedSeatDTO.getType());
        existingSeat.setCapacity(updatedSeatDTO.getCapacity());
        existingSeat.setPrice(updatedSeatDTO.getPrice());

        return seatRepository.save(existingSeat);
    }

    @DeleteMapping("/{id}")
    public void deleteSeat(@PathVariable int id) {
        if (!seatRepository.existsById(id)) {
            throw new SeatNotFoundException("Seat not found with id: " + id);
        }
        seatRepository.deleteById(id);
    }
}
