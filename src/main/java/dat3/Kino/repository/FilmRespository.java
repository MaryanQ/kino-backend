package dat3.Kino.repository;

import dat3.Kino.dto.FilmDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FilmRespository extends JpaRepository<FilmDTO, String> {
    public Optional<FilmDTO> findByTitle(String title);
}