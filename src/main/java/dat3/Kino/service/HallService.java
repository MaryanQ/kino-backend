package dat3.Kino.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dat3.Kino.dto.HallDTO;
import dat3.Kino.repository.HallRepository;

import java.util.List;
import java.util.Optional;

@Service
public class HallService {

    @Autowired
    private HallRepository hallRepository;

    public List<HallDTO> getAllHalls() {
        return hallRepository.findAll();
    }

    public Optional<HallDTO> getHallById(int id) {
        return hallRepository.findById(id);
    }

    public HallDTO createHall(HallDTO hallDTO) {
        return hallRepository.save(hallDTO);
    }

    public HallDTO updateHall(int id, HallDTO updatedHall) {
        if (hallRepository.existsById(id)) {
            updatedHall.setId(id);
            return hallRepository.save(updatedHall);
        } else {
            return null; // or throw exception
        }
    }

    public void deleteHall(int id) {
        hallRepository.deleteById(id);
    }
}
