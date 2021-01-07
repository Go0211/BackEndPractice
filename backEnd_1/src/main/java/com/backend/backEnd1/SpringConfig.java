package com.backend.backEnd1;

import com.backend.backEnd1.repository.MemoryMember;
import com.backend.backEnd1.repository.MemoryMemberRepository;
import com.backend.backEnd1.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(MemberRepository());
    }

    @Bean
    public MemoryMember MemberRepository() {
        return new MemoryMemberRepository();
    }
}
