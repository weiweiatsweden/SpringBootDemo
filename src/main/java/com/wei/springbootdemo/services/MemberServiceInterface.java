package com.wei.springbootdemo.services;

import com.wei.springbootdemo.Entities.Members;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberServiceInterface {
    Members saveMember(Members member);
    List<Members> getAllMember();
    Members updateMember(Members member, int memberId);
    void deleteMember(int memberId);
}
