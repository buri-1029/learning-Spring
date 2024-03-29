package buri.spring.basic.repository;

import buri.spring.basic.domain.Member;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {

	Member save(Member member);

	Optional<Member> findById(Long id);

	Optional<Member> findByNickname(String nickname);

	List<Member> findAll();
}
