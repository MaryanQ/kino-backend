package dat3.Kino.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class MovieScreeningDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String MovieTitle;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private double ticketPrice;
    private int availableSeats;
    private int bookedSeats;
    private String language;
    @OneToMany(mappedBy = "movieScreening", cascade = CascadeType.ALL)
    private List<SeatDTO> seats;
}