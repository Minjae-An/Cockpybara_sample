package Alchole_free.Cockpybara.dto;

import Alchole_free.Cockpybara.model.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto {
    private String email;
    private String password;
    private Gender gender;
    private Integer age;

    public MemberDto(String email, String password, Gender gender, Integer age) {
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.age = age;
    }
}
