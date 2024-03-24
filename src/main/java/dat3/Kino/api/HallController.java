package dat3.Kino.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import dat3.Kino.dto.HallDTO;
import dat3.Kino.service.HallService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/halls")
public class HallController {

    @Autowired
    private HallService hallService;

    @GetMapping
    public ResponseEntity<List<HallDTO>> getAllHalls() {
        List<HallDTO> halls = hallService.getAllHalls();
        return new ResponseEntity<>(halls, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HallDTO> getHallById(@PathVariable int id) {
        Optional<HallDTO> hall = hallService.getHallById(id);
        return hall.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<HallDTO> createHall(@RequestBody HallDTO hallDTO) {
        HallDTO createdHall = hallService.createHall(hallDTO);
        return new ResponseEntity<>(createdHall, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HallDTO> updateHall(@PathVariable int id, @RequestBody HallDTO updatedHall) {
        HallDTO updated = hallService.updateHall(id, updatedHall);
        return updated != null ?
                new ResponseEntity<>(updated, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHall(@PathVariable int id) {
        hallService.deleteHall(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
