package com.ohgiraffers.section05.typecasting;

public class Application2 {
    public static void main(String[] args) {
        /* 2. 강제 형변환 (명시적 형변환)
        *  바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
        *  (바꿀자료형) 값;
        * */

        /* 2-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다. */
        /* 2-1-1. 정수끼리의 강제 형변환 */
        long lnum = 8;
//        int inum = lnum;      // (int) = (long). 데이터 손실 가능성이 있으므로 자동 형변환되지 않는다.
        int inum = (int)lnum;   // (int) = (int)
        short snum = (short) inum;
        byte bnum = (byte) snum;


        /* 2-1-2. 실수끼리의 강제 형변환 */
        double dnum = 8.0;
//        float fnum = dnum;     // (float) = (double). 데이터 손실 가능성이 있으므로 컴파일 에러가 발생한다.
        float fnum = (float)dnum;


        /* 2-2. 실수를 정수로 변경 시 강제 형변환이 필요하다. */
        float fnum2 = 4.0f;
//        long lnum2 = fnum2;       // (long) = (float). float는 4byte, long은 8byte임에도 자동 형변환이 불가능하다. (소수점 자리 이하의 데이터 손실 가능성)
        long lnum2 = (long)fnum2;   // (long) = (long)
        System.out.println("lnum2 : " + lnum2); // 4.0 -> 4


        /* 2-3. 문자형을 int형 미만 크기의 변수에 저장하려면 강제 형변환이 필요하다. */
        char ch = 'a';
//        short snum2 = ch;         // (short) = (char). 같은 2byte이지만, 부호비트로 인한 값이 범위가 다르기 때문에 강제 형변환이 필요하다.
        short snum2 = (short) ch;   // (short(2)) = (short(2)).
        byte bnum2 = (byte) ch;     // (byte(1)) = (byte(1))


        /* (추가) 정수를 char 자료형에 강제 형변환해서 대입하기 */
        int num1 = 97;
        int num2 = -97;

//        char ch2 = num1;            // (char(2)) = (int(4))
        char ch2 = (char)num1;
        char ch3 = (char)num2;          // 강제 형변환시 음수도 들어감.

        System.out.println("ch2 : " + ch2);
        System.out.println("ch3 : " + ch3);


        /* 2-4. 논리형은 강제 형변환 규칙에서도 제외된다. */
        boolean isTrue = true;
//        byte b = (byte)isTrue;
//        short shortTrue = (short)isTrue;
//        short shortTrue = (short)isTrue;
//        int intTrue = (int)isTrue;
//        long longTrue = (long)isTrue;
//        float floatTrue = (float)isTrue;
//        double doubleTrue = (double)isTrue;
//        char charTrue = (char)isTrue;
    }
}
