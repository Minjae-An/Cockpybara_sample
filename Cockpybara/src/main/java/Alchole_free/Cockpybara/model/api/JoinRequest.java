package Alchole_free.Cockpybara.model.api;

import Alchole_free.Cockpybara.model.Gender;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class JoinRequest {
    private String email;
    private String password;
    private Integer age;
    private Gender gender;
}
