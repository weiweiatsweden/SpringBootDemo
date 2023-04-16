package com.wei.springbootdemo.Controller;

import com.wei.springbootdemo.Entities.Members;
import com.wei.springbootdemo.Repositories.MemberRepository;
import com.wei.springbootdemo.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberRepository memberRepository;


    //@RequestMapping(value = "/admin/members ", method = RequestMethod.GET)
    //@ResponseBody
    @GetMapping ("/admin/members")
    public List<Members> getMembers(){
        List<Members> members = new ArrayList<>();
        return memberService.getAllMember();
       }

    @PutMapping("/admin/member/{member-id}")
    public ResponseEntity<Members> updateMember(@PathVariable("member-id") int memberId, @RequestBody Members member) {
        return ResponseEntity.ok(memberService.updateMember(member, memberId));
    }
    @PostMapping("/admin/addmember")
    public ResponseEntity<Members> saveMember(@RequestBody Members member) {
        return new ResponseEntity<Members>(memberService.saveMember(member), HttpStatus.CREATED);
    }

    @DeleteMapping("/admin/delete/{member-id}")
    public ResponseEntity<String> deleteMember(@PathVariable("member-id") int memberId) {
        memberService.deleteMember(memberId);
        return new ResponseEntity<String>("Member Deleted.", HttpStatus.OK);
    }


    }



