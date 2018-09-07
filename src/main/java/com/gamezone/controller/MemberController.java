package com.gamezone.controller;

import com.gamezone.entity.Member;
import org.springframework.stereotype.Component;

@Component
public interface MemberController {
    Iterable<Member> findAll();
    Member save(Member member);
    Member findById(long id);
    void update(Member member);
    void delete(long id);
}
