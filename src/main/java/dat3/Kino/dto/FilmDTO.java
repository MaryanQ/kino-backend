package dat3.Kino.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "films")
public class FilmDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String description;
    private int durationMinutes;
    private boolean is3D;




public FilmDTO( String title, String description,int durationMinutes, boolean is3D) {
    this.title = title;
    this.description = description;
    this.durationMinutes = durationMinutes;
    this.is3D = is3D;

}
}


