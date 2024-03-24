package dat3.Kino.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dat3.Kino.dto.MovieScreeningDTO;
@Repository
public interface MovieScreeningRepository extends JpaRepository<MovieScreeningDTO, Integer> {

}
