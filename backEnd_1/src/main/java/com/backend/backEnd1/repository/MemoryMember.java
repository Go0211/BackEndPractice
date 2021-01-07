package com.backend.backEnd1.repository;

import com.backend.backEnd1.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemoryMember {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
