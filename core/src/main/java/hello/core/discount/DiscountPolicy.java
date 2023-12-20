package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    /*
     * @return 할인 대상금액
     */

    public int discount(Member member, int price);
}
