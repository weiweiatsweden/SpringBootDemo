package com.wei.springbootdemo.Repositories;

import com.wei.springbootdemo.Entities.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Members,Integer> {
//TODO
   List<Members> getMembersByMemberId (String name);
   //

}
