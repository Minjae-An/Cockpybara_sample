package Alchole_free.Cockpybara.service;

import Alchole_free.Cockpybara.model.Member;
import Alchole_free.Cockpybara.dto.MemberDto;
import Alchole_free.Cockpybara.model.Gender;
import Alchole_free.Cockpybara.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member join(MemberDto memberDto){
        String email = memberDto.getEmail();
        String password = memberDto.getPassword();
        Integer age = memberDto.getAge();
        Gender gender = memberDto.getGender();

        Member member = new Member(email, password, gender, age);
        return memberRepository.save(member);
    }

    public Member login(MemberDto memberDto){
        String email = memberDto.getEmail();
        String password = memberDto.getPassword();
        Optional<Member> findResult = Optional.of(memberRepository.findMemberByEmailAndPassword(email, password));

        if(findResult.isPresent()){
            return findResult.get();
        }else{
            throw new IllegalStateException("회원이 존재하지 않습니다");
        }
    }

}
