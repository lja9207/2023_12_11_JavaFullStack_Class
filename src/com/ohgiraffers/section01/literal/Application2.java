package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {

        System.out.println("========================= 정수와 정수의 연산 =========================");

        /* 수학적으로 사용하는 사칙연산에 추가로 나머지를 구하는 연산(mod)를 사용할 수 있다. */
        System.out.println(123 + 456);
        System.out.println(100 - 50);
//        System.out.println("100 - 50 = " + 100 + (-50));
        System.out.println(10 * 20);
        System.out.println(35 / 10);    // 결과 : 3 -> 정수의 나눗셈의 결과는 몫만 나옴.
        System.out.println(35 % 10);    // 결과 : 5 -> 정수의 나눗셈의 나머지가 나옴 (% : mod)

        System.out.println("========================= 실수와 실수의 연산 =========================");

        System.out.println(1.23 + 4.56);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);     // 실수와 실수의 mod는 약간의 오차가 발생

        /* 정수와 실수의 연산결과는 항상 실수가 나온다. */
        System.out.println("========================= 정수와 실수의 연산 =========================");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        /* 문자와 문자의 연산결과는 숫자형으로 나온다 */
        System.out.println("========================= 문자와 문자의 연산 =========================");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');
//        System.out.println("a" - "b");    //컴파일 에러 발생

        System.out.println("========================= 문자와 정수의 연산 =========================");
        System.out.println('a' + 1);
//        System.out.println("a" - 1);      //컴파일 에러 발생
        System.out.println('b' - 1);
        System.out.println('a' * 1);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println("========================= 문자와 실수의 연산 =========================");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 1.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        /* 문자열은 사칙연산 중 더하기만 가능하며 문자열끼리는 문자열끼리 붙이게 된다.*/
        System.out.println("========================= 문자열과 문자열의 연산 =========================");
        System.out.println("hello" + "jinah");
//        System.out.println("hello" - "jinah");
//        System.out.println("hello" * "jinah");
//        System.out.println("hello" / "jinah");
//        System.out.println("hello" % "jinah");

        /* 문자열과 다른 형태의 값은 더해지지 않고 문자열로 바뀌어 이어붙여짐 */
        System.out.println("========================= 문자열과 다른 형태의 값 연산 =========================");
        System.out.println("hello" + 123);
        System.out.println("hello" + 123.456);
        System.out.println("hello" + 'a');
        System.out.println("hello" + true);

//        System.out.println(true + false); // 논리값끼리의 연산은 불가능함. 실수도 포함해서.

//        System.out.println(true +1);

        System.out.println(true + "a");     //문자열 합치기로 인식

        System.out.printf("123 + 456 =" + 123 + 456);
    }

}
