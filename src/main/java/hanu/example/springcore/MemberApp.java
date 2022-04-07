package hanu.example.springcore;

import hanu.example.springcore.member.Grade;
import hanu.example.springcore.member.Member;
import hanu.example.springcore.member.MemberService;
import hanu.example.springcore.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1l, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = "+ member.getName());
        System.out.println("find Member = "+ findMember.getName());
    }
}
