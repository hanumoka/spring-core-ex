package hanu.example.springcore;

import hanu.example.springcore.discount.FixDiscountPolicy;
import hanu.example.springcore.member.MemberService;
import hanu.example.springcore.member.MemberServiceImpl;
import hanu.example.springcore.member.MemoryMemberRepository;
import hanu.example.springcore.order.OrderService;
import hanu.example.springcore.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
