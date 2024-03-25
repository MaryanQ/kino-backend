package dat3.Kino.api;

import dat3.Kino.dto.CinemaDTO;
import dat3.Kino.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemas")
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;

    @GetMapping
    public List<CinemaDTO> getAllCinemas() {
        return cinemaService.getAllCinemas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CinemaDTO> getCinemaById(@PathVariable int id) {
        CinemaDTO cinema = cinemaService.getCinemaById(id);
        return cinema != null ? ResponseEntity.ok(cinema) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<CinemaDTO> createCinema(@RequestBody CinemaDTO cinema) {
        return new ResponseEntity<>(cinemaService.createCinema(cinema), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CinemaDTO> updateCinema(@PathVariable int id, @RequestBody CinemaDTO cinema) {
        CinemaDTO updatedCinema = cinemaService.updateCinema(id, cinema);
        return updatedCinema != null ? ResponseEntity.ok(updatedCinema) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCinema(@PathVariable int id) {
        cinemaService.deleteCinema(id);
        return ResponseEntity.noContent().build();
    }
}
