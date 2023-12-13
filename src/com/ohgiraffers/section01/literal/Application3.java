package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args) {

        System.out.println("========== 두 개의 문자열 합치기 ==========");
        System.out.println(9 + 9);          //18
        System.out.println("9" + 9);        //99
        System.out.println(9 + "9");        //99
        System.out.println("9" + "9");      //99

        System.out.println(9 + 9 + "9");    //999 (* 틀림) -> 189
        System.out.println(9 + "9" + 9);    //999
        System.out.println("9" + 9 + 9);    //999 (* 틀림 : 왼쪽부터 순서대로 연산) -> 999

        /* 만약 위 상황에서 918을 만들고 싶다면? */
        System.out.println("9" + (9 + 9));  //918 (괄호 먼저 계산)

        System.out.println("========== 100과 200의 사칙연산 결과 ==========");
        System.out.println("100 + 200 = " + (100 + 200));      //300
        System.out.println("100 - 200 = " + (100 - 200));      //-100
        System.out.println("100 * 200 = " + (100 * 200));      //20000
        System.out.println("100 / 200 = " + (100 / 200));      //0
        System.out.println("100 % 200 = " + (100 % 200));      //100
        /* -->문자열과 연산 결과를 같이 나오게 하고 싶으면 ()를 이용하라 */

        int a = 5;
        System.out.printf("a = " + a + "\n");

    }
}
