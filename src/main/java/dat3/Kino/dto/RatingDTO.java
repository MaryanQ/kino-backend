package dat3.Kino.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class RatingDTO {
    @JsonProperty("Source")
    private String source;

    @JsonProperty("Value")
    private String value;
}
