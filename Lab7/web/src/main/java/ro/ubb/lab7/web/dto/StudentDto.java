package ro.ubb.lab7.web.dto;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class StudentDto extends BaseDto {
    private String name;
    private int grade;
    private Long id;
}
