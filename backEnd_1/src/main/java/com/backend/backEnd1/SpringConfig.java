package com.backend.backEnd1;

import com.backend.backEnd1.repository.JdbcTemplateMemberRepository;
import com.backend.backEnd1.repository.JpaMemberRepository;
import com.backend.backEnd1.repository.MemoryMember;
import com.backend.backEnd1.repository.MemoryMemberRepository;
import com.backend.backEnd1.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final MemoryMember memoryMember;

    public SpringConfig(MemoryMember memoryMember) {
        this.memoryMember = memoryMember;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memoryMember);
    }

//    @Bean
//    public MemoryMember MemberRepository() {
//        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//
//    }

}
