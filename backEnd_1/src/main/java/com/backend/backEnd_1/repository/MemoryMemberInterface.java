package com.backend.backEnd_1.repository;

import com.backend.backEnd_1.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemoryMemberInterface {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
