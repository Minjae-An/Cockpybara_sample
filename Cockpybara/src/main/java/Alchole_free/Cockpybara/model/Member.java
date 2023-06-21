package Alchole_free.Cockpybara.model;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Member {
    @Id
    @GeneratedValue
    @Column(name="member_id")
    private Long id;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @NotNull
    private Integer age;

    public Member(String email, String password, Gender gender, Integer age) {
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.age = age;
    }
}
