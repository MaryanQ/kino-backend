package dat3.Kino.repository;

import dat3.Kino.dto.BookingDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingDTO, Integer> {
}
