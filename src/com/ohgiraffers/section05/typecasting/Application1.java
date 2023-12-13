package com.ohgiraffers.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {
        /* [ 데이터 형변환이 필요한 이유 ]
        *  자바에서는 같은 데이터 타입끼리만 연산을 수행할 수 있기 때문이다.
        *  */

        /* 1. 자동형변환(묵시적 형변환) */
        /* 1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환된다. */
        /* 데이터의 손실 가능성이 없는 경우 자동으로 타입을 맞춰준다. */
        /* 1-1-1. 정수끼리의 자동 형변환*/
        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        int num1 = 10;
        long num2 = 100;

//        int result = num1 + num2;     // 우항부터 계산. 작은 타입은 자동으로 큰 타입에 맞춰지기 때문에 (int) = (long) + (long) 이 됨. (long)타입의 데이터를 (int)에 담으려하니 에러가 뜸.
        long result = num1 + num2;
        System.out.println("result : " + result);


        /* 1-1-2. 실수끼리의 자동 형변환*/
        float fnum = 4.0f;
        double dnum = fnum;

        double result2 = fnum + dnum;
        System.out.println("result2 : " + result2);

//        float reulst3 = fnum + dnum;      // (float) = (double) + (double)


        /* 1-2. 정수는 실수로 자동 형변환된다. */
        long eight = 8;         // long은 8byte
        float four = eight;     // float는 4byte 라서 long 타입이 더 크지만 long은 정수형이기때문에 실수형인 float로 자동 형변환됨.

        System.out.println("float four : " + four);

//        long result3 = eight + four;  //(long) = (float) + (float)
        float result3 = eight + four;
        System.out.println("result3 : " + result3);
        System.out.println("eight : " + eight);
        System.out.println("eight + four : " + (eight + four));


        /* 1-3. 문자형은 int형으로 자동 형변환된다. */
        char ch1 = 'a';
        int charNumber = ch1;
        System.out.println("ch1 : " + ch1);                 // a
        System.out.println("int ch1 : " + charNumber);      // 97

        char ch2 = 100;
        System.out.println("ch2 : " + ch2);                 // d


        /* 1-4. 논리형은 형변환 규칙에서 제외된다. */
        boolean isTrue = true;
//        byte byteTrue = isTrue;
//        short shortTrue = isTrue;
//        int intTrue = isTrue;
//        long longTrue = isTrue;
//        float floatTrue = isTrue;
//        double doubleTrue = isTrue;
//        char charTrue = isTrue;

    }
}
