package com.gamezone.controller;

import com.gamezone.entity.Member;
import com.gamezone.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberControllerImpl implements MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Iterable<Member> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public Member save(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member findById(long id) {
        return memberRepository.findByPrimaryKey(id);
    }

    @Override
    public void update(Member member) {
        memberRepository.save(member);
    }

    @Override
    public void delete(long id) {
        memberRepository.deleteById(id);
    }
}
