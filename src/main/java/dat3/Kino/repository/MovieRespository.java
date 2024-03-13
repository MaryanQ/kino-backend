package dat3.Kino.repository;

import dat3.Kino.dto.MovieDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRespository extends JpaRepository<MovieDTO, String> {

    
    Optional<MovieDTO> findByTitle(String title);

}