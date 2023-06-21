package Alchole_free.Cockpybara.model.api;

import Alchole_free.Cockpybara.model.Member;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class LoginResponse {
    private final Member member;

    public static LoginResponse from(Member member){
        return new LoginResponse(member);
    }


}
