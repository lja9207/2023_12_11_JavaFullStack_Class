package com.ohgiraffers.section05.typecasting;

public class Application3 {
    public static void main(String[] args) {

        /* 다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산 처리된다. */
        int inum = 10;
        long lnum = 100;

        /* 1. 두 수의 연산 결과를 int형으로 변환 후, int 자료형 변수에 담기 */
//        int isum = inum + lnum;       // (int) = (long) + (long)
        int isum = (int)(inum + lnum);  // (int) = (int)
        System.out.println("isum : " + isum);

        /* 2. long형 값을 int형으로 강제 형변환하여 연산하기 */
//        int isum2 = inum + lnum;  // (int) = (long) + (long)
        int isum2 = inum + (int)lnum;
        System.out.println("isum2 : " + isum2);

        /* 3. 결과 값을 long형으로 받기 (자동 형변환 이용) */
        long lsum = inum + lnum;     // (long) = (long) + (long)
        System.out.println("lnum : " + lnum);


        /* 주의! int 미만의 자료형 간의 연산 처리 결과는 int형이다. */
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 3;
        short shortNum2 = 4;

//        byte result1 = byteNum1 + byteNum2;   // Required Type : byte, Provided : int로 나옴.
        int result1 = byteNum1 + byteNum2;

//        short result2 = byteNum1 + shortNum1;   // Required Type : short, Provided : int로 나옴.
        int result2 = byteNum1 + shortNum1;

//        short result3 = shortNum1 + shortNum2;      //short = short + short 임에도 불구하고 int로 처리되어 에러가 남.
        int result3 = shortNum1 + shortNum2;

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}
