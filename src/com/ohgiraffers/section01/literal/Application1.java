package com.ohgiraffers.section01.literal;

public class Application1 {
    public static void main(String[] args) {
        System.out.println(123);
        System.out.println(1.23);

        System.out.println(true);
        System.out.println(false);

//        System.out.println('');   //single quotation. 문자형은 안에 아무 내용이 없으면 에러남.
        System.out.println('a');    //a는 문자형이라 문자 하나만 쓸수있는 ''에 쓸수있음
//        System.out.println('abc'); //abc는 문자열이라서 문자 하나만 쓸수있는 ''에는 못씀.
//        System.out.println('123'); //'숫자'는 문자열로 인식됨. 문자 하나만 쓸수있는 ''에는 못씀.
        System.out.println(1);

        System.out.println("a\n bc");   // \n : 이스케이프 문자. 개행. '\n'은 문자로 인식하지않음.
//        System.out.println('\');      // \ 하나만 넣으면 오류가 나옴
        System.out.println('\\');       // \ 를 문자열로 넣고싶을땐 \를 두개를 넣으면 \ 하나가 출력됨.

        System.out.println("");     //double quotation. 문자열은 '' 와 다르게 안에 아무 내용이 없어도 실행됨.
        System.out.println("a");
        System.out.println("123"); //"숫자"는 문자열로 인식됨.문자 여럿을 쓸수있는 ""에는 쓸수있음

        //print'ln' : 자동으로 문자형 또는 문자열 뒤에 들여쓰기를 해줌. <-> print

    }
}
