package hello.core.member;

public interface MemberService {
    public void join(Member member);
    public Member find(Long memberId);
}
