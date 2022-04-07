package hanu.example.springcore.member;

public interface MemberService {
    void join(Member membmer);
    Member findMember(Long MemberId);
}
