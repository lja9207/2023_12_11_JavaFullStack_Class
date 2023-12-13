package com.ohgiraffers.section04.overflow;

public class Application1 {
    public static void main(String[] args) {
        /* 1. 오버플로우 */
        byte num1 = 127;
        System.out.println("num1 : " + num1);

//        num1 = num1 + 1;
        num1++;     //위 방법으로 하면 컴파일에러가 나기때문에 결과를 보이기위해 편법을 사용.
        //증감 연산자는 연산 중 "산술변환이 발생하지 않는다". 연산 후에도 타입이 유지된다.

        System.out.println("num (overflow) : " + num1);

        /* 2. 언더플로우 */
        byte num2 = -128;
        System.out.println("num2 : " + num2);

//        num2= num2-1;
        num2--;

        System.out.println("num2 (underflow) : " + num2);

        /* 문제 상황 */
        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum * secondNum;

        System.out.println("firstNum * secondNum = " + multi);

        /* 해결 방법 */
        long longMulti = firstNum * secondNum;
        System.out.println("longMulti : " + longMulti);
        //int 와 int의 연산이기때문에 이미 결과값이 int로 나온 상태.

        long longMultiResult = (long)firstNum * secondNum;
        System.out.println("longMultiResult : " + longMultiResult);

    }

}
