package com.ohgiraffers.section03.constant;

public class Application2 {
    public static void main(String[] args) {
        /* [상수의 명명규칙] */
        /* 상수의 명명 규칙은 컴파일 에러를 발생시키는 규칙에 대해서는 변수의 명명 규칙과 거의 동일하다. */
        /* 단, 개발자끼리의 암묵적인 규칙에서 일부 차이가 있다. */
        /* 1. 모든 문자는 영문자 대문자 혹은 숫자만 사용한다.
        * 2. 단어와 단어 간 연결은 언더스코어(_)를 사용한다
        * */

        final int HEIGHT = 100;
        final int HEIGHT300 = 300;
        final int height = 100;     //소문자로 써도 컴파일 에러는 발생하지 않는다.

        final int MORNING_HEIGHT = 600;
        final int NIGHT_HEIGHT = 500;
        final int afternoonHeight = 550;    //카멜표기법으로 써도 무방하지만 상수인지 변수인지 알아볼수없기에 (_)를 이용한다.

    }
}
