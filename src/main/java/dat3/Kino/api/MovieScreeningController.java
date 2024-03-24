package dat3.Kino.api;
import dat3.Kino.dto.MovieScreeningDTO;
import dat3.Kino.service.MovieScreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movie_screenings")
public class MovieScreeningController {

    @Autowired
    private MovieScreeningService movieScreeningService;

    @PostMapping
    public ResponseEntity<MovieScreeningDTO> createMovieScreening(@RequestBody MovieScreeningDTO movieScreeningDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(movieScreeningService.createMovieScreening(movieScreeningDTO));
    }

    @GetMapping
    public ResponseEntity<List<MovieScreeningDTO>> getAllMovieScreenings() {
        return ResponseEntity.ok(movieScreeningService.getAllMovieScreenings());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieScreeningDTO> getMovieScreeningById(@PathVariable int id) {
        Optional<MovieScreeningDTO> movieScreeningDTO = movieScreeningService.getMovieScreeningById(id);
        return movieScreeningDTO.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<MovieScreeningDTO> updateMovieScreening(@PathVariable int id, @RequestBody MovieScreeningDTO movieScreeningDTO) {
        MovieScreeningDTO updatedMovieScreening = movieScreeningService.updateMovieScreening(id, movieScreeningDTO);
        return updatedMovieScreening != null ?
                ResponseEntity.ok(updatedMovieScreening) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovieScreening(@PathVariable int id) {
        movieScreeningService.deleteMovieScreening(id);
        return ResponseEntity.noContent().build();
    }
}

