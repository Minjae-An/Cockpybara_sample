package Alchole_free.Cockpybara.repository;

import Alchole_free.Cockpybara.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findMemberByEmailAndPassword(String email, String password);
}
