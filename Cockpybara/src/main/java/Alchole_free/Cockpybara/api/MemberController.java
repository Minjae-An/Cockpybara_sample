package Alchole_free.Cockpybara.api;

import Alchole_free.Cockpybara.dto.MemberDto;
import Alchole_free.Cockpybara.model.Member;
import Alchole_free.Cockpybara.model.api.JoinRequest;
import Alchole_free.Cockpybara.model.api.JoinResponse;
import Alchole_free.Cockpybara.model.api.LoginRequest;
import Alchole_free.Cockpybara.model.api.LoginResponse;
import Alchole_free.Cockpybara.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/join")
    public JoinResponse join(@RequestBody JoinRequest joinRequest){
        Member member = memberService.join(new MemberDto(joinRequest.getEmail(), joinRequest.getPassword(),
                joinRequest.getGender(), joinRequest.getAge()));

        return JoinResponse.from(member);
    }

    @GetMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        MemberDto memberDto = new MemberDto();
        memberDto.setEmail(loginRequest.getEmail());
        memberDto.setPassword(loginRequest.getPassword());
        Member loginMember = memberService.login(memberDto);

        return LoginResponse.from(loginMember);
    }
}
