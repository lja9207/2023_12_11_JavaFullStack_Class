package com.ohgiraffers.section02.variable;

public class Application3 {
    public static void main(String[] args) {
        /* 1. 컴파일 에러를 방지하기 위한 명명규칙 */
        /* 1-1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다. */
        int acorns = 1000;
//        int acorns = 10000; //동일한 범위 내에서 같은 변수명을 사용하여 에러남

        /* 1-2. 예약어는 사용이 불가능하다. */
//        int true = 1;
//        int for = 1;

        /* 1-3. 변수명은 대소문자를 구분한다. */
        int Acorns = 100000;
        int True = 1;

        /* 1-4. 변수명은 숫자로 시작할 수 없다. */
//        int 100newSongs = 300;    //
        int newSongs100 = 300;

        /* 1-5. 특수문자는 언더스코어(_)와 '$'만 사용 가능하다. */
//        int id;peaceB = 1;
//        int id@peaceB = 1;
          int id_peaceB = 1;
          int $ale = 100;

        /* 2. 컴파일 에러를 발생시키진 않지만 개발자끼리의 암묵적인 명명규칙 */
        /* 2-1. 변수명의 길이 제한은 없으나, 적당한 길이로 해야 한다. */
        int blueskywithalotofbigcloudthecloudsembleasdsfsdfsheep;

        /* 2-2. 변수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두 번째 단어는 대문자로 시작한다. (낙타봉표기법) */
        //통상적으로 클래스명은 대문자, 변수명은 소문자로 시작하도록 함.
        int favoriteSong = 10;
        int hateVegetables = 20;

        /* 2-3. 단어와 단어 사이의 연결을 언더스코어(_)로 하지 않는다. */
        int choco_milk = 500;
        int chocoMilk = 500;

        /* 2-4. 한글로 변수명을 짓는 것이 가능하지만, 권장하지 않는다. */
        int 간식;

        /* 2-5. 변수 안에 저장한 값이 어떤 의미를 가지는지 명확하게 표현하도록 한다. */
        String s;
        String snack;

        /* 2-6. 전형적인 변수 이름이 있다면 가급적 해당 이름을 사용한다. */
        int sum = 0;
        int max = 100;
        int min = -100;
        int count = 10;

        /* 2-7. 명사형으로 작성하는 것을 권장한다 .*/
        String goCity = "";
        String city = "";

        /* 2-8. boolean 형은 의문문으로, 가급적이면 긍정형으로 명명한다. */
        boolean isAlive= true;
        boolean isDead = false;

    }
}
