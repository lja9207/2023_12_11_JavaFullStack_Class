package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {

        /*  [ 변수를 사용하는 방법 ]
            1. 변수를 준비한다. (선언)
            2. 변수에 값을 대입한다. (값 대입 및 초기화)
            3. 변수를 사용한다.
         */

        /*  1. 변수를 준비한다 (선언)
            자료형 변수명;
         */

        byte bnum;      // 1byte
        short snum;     // 2byte
        int inum;       // 4byte
        long lnum;      // 8byte

        float fnum;     // 4byte
        double dnum;    // 8byte

        char ch;        // 2byte
        char ch2;

        boolean isTrue; // 1byte

        //String은 8가지 기본 자료형이 아니고 클래스
        String str;     // 4byte

        /*  2. 변수에 값을 대입한다. (값 대입 및 초기화)        */
        bnum = 1;
        snum = 2;
        inum = 4;
        // lnum = 8;
        lnum = 8L; //long타입임을 명시하기 위해 L을 붙여줌. 소문자 l을 써도 되지만 대문자 L을 쓰는 것을 권장함

//        fnum = 4.0;
        fnum = 4.0f;    //반드시 뒤에 f를 붙여줘야 함. 대문자 F를 써도 되지만 통상적으로 보통 소문자 f를 씀.
        dnum = 8.0;

        ch = 'a';
        ch2 = 97;   //a

        isTrue = true;
        isTrue = false;

        str = "다람쥐는 짱 쎄.";

        /* 선언과 동시에 초기화 */
        int point = 100;
        int bonus = 10;

        /*  3. 변수를 사용한다.         */
        System.out.println("bnum : " + bnum);
        System.out.println("snum : " + snum);
        System.out.println("inum : " + inum);
        System.out.println("lnum : " + lnum);
        System.out.println("fnum : " + fnum);
        System.out.println("dnum : " + dnum);
        System.out.println("ch : " + ch);
        System.out.println("ch2 : " + ch2);
        System.out.println("isTrue : " + isTrue);
        System.out.println("str : " + str);

        /* 3-2. 변수를 이요한 연산 */
        System.out.println("포인트와 보너스의 합? " + (point+ bonus));

        /* 3-3. 대입연산자(=)의 좌항과 우항에 사용 */
        point = point + 300;
        System.out.println("point = point + 300 = " + point);





    }
}
