package dat3.Kino.service;
import dat3.Kino.dto.CinemaDTO;
import dat3.Kino.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaService {

    private final CinemaRepository cinemaRepository;

    @Autowired
    public CinemaService(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    public List<CinemaDTO> getAllCinemas() {
        return cinemaRepository.findAll();
    }

    public CinemaDTO getCinemaById(int id) {
        return cinemaRepository.findById(id).orElse(null);
    }

    public CinemaDTO createCinema(CinemaDTO cinema) {
        return cinemaRepository.save(cinema);
    }

    public CinemaDTO updateCinema(int id, CinemaDTO cinema) {
        if (cinemaRepository.existsById(id)) {
            cinema.setId(id);
            return cinemaRepository.save(cinema);
        }
        return null;
    }

    public void deleteCinema(int id) {
        cinemaRepository.deleteById(id);
    }
}
