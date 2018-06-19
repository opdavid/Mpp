package ro.ubb.lab7.web.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class PersonDto {
    private String ssn;
    private String name;
    private Long id;
}
