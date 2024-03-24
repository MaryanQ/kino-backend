package dat3.Kino.repository;
import dat3.Kino.dto.SeatDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<SeatDTO, Integer> {
}
