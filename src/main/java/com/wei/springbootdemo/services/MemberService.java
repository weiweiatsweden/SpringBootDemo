package com.wei.springbootdemo.services;

import com.wei.springbootdemo.Entities.Members;
import com.wei.springbootdemo.Exceptions.ResourceNotFoundException;
import com.wei.springbootdemo.Repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService implements MemberServiceInterface{

    @Autowired
    private MemberRepository memberRepository;


    @Override
    public Members saveMember(Members member) {
        return memberRepository.save(member);
    }

    @Override
    public List<Members> getAllMember() {

        return memberRepository.findAll();
        //studentRepository.findAll().forEach(student -> students.add(student));

    }

    @Override
    public Members updateMember(Members member, int memberId) {
        Members m = memberRepository.findById(memberId).orElseThrow(()-> new ResourceNotFoundException("Members", "memberId", memberId));
        m.setFirstName(member.getFirstName());
        m.setLastName(member.getLastName());
        m.setAddress(member.getAddress());
        m.setEmail(member.getEmail());
        m.setPhone(member.getPhone());
        m.setDateOfBirth(member.getDateOfBirth());
        memberRepository.save(m);
        return m;
    }


    @Override
    public void deleteMember(int memberId) {
        memberRepository.findById(memberId).orElseThrow(()-> new ResourceNotFoundException("Member", "MemberId", memberId));
        memberRepository.deleteById(memberId);

    }
}
