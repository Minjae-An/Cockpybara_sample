package Alchole_free.Cockpybara.model.api;

import Alchole_free.Cockpybara.model.Member;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
public class JoinResponse {
    private final Member member;

    public static JoinResponse from(Member member){
        return new JoinResponse(member);
    }

}
