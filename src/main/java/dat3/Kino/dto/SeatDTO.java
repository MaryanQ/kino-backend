package dat3.Kino.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SeatDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private int capacity;
    private double price;
    @ManyToOne
    @JoinColumn(name = "movie_screeningdto_id")
    private MovieScreeningDTO movieScreening;

}
