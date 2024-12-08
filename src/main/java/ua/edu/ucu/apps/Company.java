package ua.edu.ucu.apps;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@JsonIgnoreProperties()
@Getter
@Setter
public class Company {
    private String name;
    private String description;
    private String website;
}
