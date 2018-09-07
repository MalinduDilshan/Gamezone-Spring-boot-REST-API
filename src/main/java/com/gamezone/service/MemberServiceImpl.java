package com.gamezone.service;

import com.gamezone.controller.MemberController;
import com.gamezone.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberController memberController;

    private static MemberService INSTANCE = null;

    public static MemberService getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new MemberServiceImpl();
        }
        return INSTANCE;
    }

    public static void setINSTANCE(MemberService INSTANCE) {
        MemberServiceImpl.INSTANCE = INSTANCE;
    }

    private MemberServiceImpl() {
    }

    @Override
    public Iterable<Member> findAll() {
        return memberController.findAll();
    }

    @Override
    public Member save(Member member) {
        return memberController.save(member);
    }

    @Override
    public Member findById(long id) {
        return memberController.findById(id);
    }

    @Override
    public void update(Member member) {
        memberController.update(member);
    }

    @Override
    public void delete(long id) {
        memberController.delete(id);
    }
}
