package dat3.Kino.service;

import dat3.Kino.dto.FilmDTO;
import dat3.Kino.repository.FilmRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    private final FilmRespository filmRepository;

    @Autowired
    public FilmService(FilmRespository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<FilmDTO> getAllFilms() {
        return filmRepository.findAll();
    }

}
