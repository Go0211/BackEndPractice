package com.backend.backEnd1.repository;

import com.backend.backEnd1.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemoryMember{

    @Override
    Optional<Member> findByName(String name);
}
