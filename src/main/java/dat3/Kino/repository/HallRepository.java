package dat3.Kino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dat3.Kino.dto.HallDTO;

public interface HallRepository extends JpaRepository<HallDTO, Integer> {
}
