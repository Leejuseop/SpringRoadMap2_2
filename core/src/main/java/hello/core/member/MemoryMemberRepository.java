package hello.core.member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member){
        store.put(member.getId(), member);
    }

    public Member findById(Long memberId){
        return store.get(memberId);
    }
}