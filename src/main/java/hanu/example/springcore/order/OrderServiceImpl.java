package hanu.example.springcore.order;

import hanu.example.springcore.discount.DiscountPolicy;
import hanu.example.springcore.discount.FixDiscountPolicy;
import hanu.example.springcore.member.Member;
import hanu.example.springcore.member.MemberRepository;
import hanu.example.springcore.member.MemoryMemberRepository;

public class OrderServiceImpl implements  OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
