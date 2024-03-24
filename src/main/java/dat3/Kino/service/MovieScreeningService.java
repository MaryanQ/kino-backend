package dat3.Kino.service;
import dat3.Kino.dto.MovieScreeningDTO;
import dat3.Kino.repository.MovieScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieScreeningService {

    @Autowired
    private MovieScreeningRepository movieScreeningRepository;

    // Create
    public MovieScreeningDTO createMovieScreening(MovieScreeningDTO movieScreeningDTO) {
        return movieScreeningRepository.save(movieScreeningDTO);
    }

    // Read
    public List<MovieScreeningDTO> getAllMovieScreenings() {
        return movieScreeningRepository.findAll();
    }

    public Optional<MovieScreeningDTO> getMovieScreeningById(int id) {
        return movieScreeningRepository.findById(id);
    }

    // Update
    public MovieScreeningDTO updateMovieScreening(int id, MovieScreeningDTO movieScreeningDTO) {
        if (movieScreeningRepository.existsById(id)) {
            movieScreeningDTO.setId(id);
            return movieScreeningRepository.save(movieScreeningDTO);
        }
        return null;
    }

    // Delete
    public void deleteMovieScreening(int id) {
        movieScreeningRepository.deleteById(id);
    }
}
