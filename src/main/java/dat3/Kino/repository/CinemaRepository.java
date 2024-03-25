package dat3.Kino.repository;

import dat3.Kino.dto.CinemaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends JpaRepository<CinemaDTO, Integer> {
}
