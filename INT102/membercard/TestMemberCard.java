/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membercard;

/**
 *
 * @author Student
 */
public class TestMemberCard {

    public static void main(String[] args) {
        System.out.println("TEST");
        MemberCard mc1 = new MemberCard(3100012345671L);
        System.out.println("START \n" + mc1.toString()+"\n");
        mc1.buy(100000);
        System.out.println("BUY 100000 BATH \n" + mc1.toString()+"\n");
        mc1.redeem();
        System.out.println("REDEEM 1 \n" + mc1.toString());
        mc1.redeem();
        System.out.println("REDEEM 2 \n" + mc1.toString());
        mc1.buy(100000);
        System.out.println("BUY 100000 BATH \n" + mc1.toString()+"\n");
    }
}
