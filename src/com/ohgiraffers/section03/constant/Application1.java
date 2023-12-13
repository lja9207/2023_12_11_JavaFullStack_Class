package com.ohgiraffers.section03.constant;

public class Application1 {
    public static void main(String[] args) {
        /* [ 상수의 사용 목적 ] */
        /* 변경되지 않는 고정된 값을 저장할 목적으로 사용한다. */
        /* 초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 않도록 한다. */

        /* [ 사용 방법 ] */
        /* 1. 상수를 선언한다. (final 키워드 사용) */
        /* 2. 값을 초기화한다. */
        /* 3. 필요한 위치에 상수를 호출해서 사용한다. */

        /* 1. 상수를 선언한다. */
        final int HEIGHT;

        /* 2. 값을 초기화한다. */
        HEIGHT = 199;
//        HEIGHT = 200; //이미 초기화해서 수정할 수 없다는 에러가 뜸.
        //한번 초기화한 이후에는 값을 재대입(수정)하는 것은 불가능하다.

        /* 3-1. 필요한 위치에 상수를 호출해서 사용한다. */
        System.out.println("다람쥐의 키는?! " + HEIGHT);

        /* 3-2. 필요 시 연산식에 호출해서 사용한다. */
        System.out.println("다람쥐의 키는?! " + (HEIGHT * 2));

        /* 3-3. 대입연산 시 사용한다. */
        int monkeyHeight = HEIGHT;
        System.out.println(monkeyHeight);

//        HEIGHT = HEIGHT + 10;     // 좌항에 사용하면 재대입이 되기 때문에 좌항에는 사용 불가능하다.
        // 대딥 연산자의 좌항에는 기술 불가능하다.
    }
}
