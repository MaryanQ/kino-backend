package dat3.Kino.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;

import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
public class MovieDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String year;
    private String genre;
    private String director;
    private String plot;
    private String poster_url;
}