package hanu.example.springcore;

import hanu.example.springcore.member.Grade;
import hanu.example.springcore.member.Member;
import hanu.example.springcore.member.MemberService;
import hanu.example.springcore.member.MemberServiceImpl;
import hanu.example.springcore.order.Order;
import hanu.example.springcore.order.OrderService;
import hanu.example.springcore.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1l;
        Member member = new Member(memberId, "mameberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order = " + order.calculatePrice());
    }
}
