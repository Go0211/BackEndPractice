package com.backend.backEnd_1.repository;

import com.backend.backEnd_1.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemoryMemberInterface {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    //저장
    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    //아이디 찾기
    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    //이름 찾기
    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    //다 찾기
    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    //데이터 지워주기
    public void clearStore() {
        store.clear();
    }
}
