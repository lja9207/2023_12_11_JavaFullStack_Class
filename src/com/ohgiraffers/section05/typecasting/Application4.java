package com.ohgiraffers.section05.typecasting;

public class Application4 {

    public static void main(String[] args) {
        /* 형변환 사용 시 주의할 점 : 데이터 손실에 유의해야 한다 */

        /* 1. 의도하지 않은 데이터 손실 */
        int inum = 300;
        byte bnum = (byte)inum;

        System.out.println("inum : " + inum);                       // 300
        System.out.println("300의 byte 강제 형변환 시 : " + bnum);     //44
        //강제 형변환 시 예측할 수 없는 결과가 나옴.
        //bit 앞부분을 전부 날려버림 -> 예측이 어려움


        /* 2. 의도한 데이터 손실 */
        double weight = 10.12385892571;
        int floorWeight = (int)weight;

        System.out.println("Weight : " + weight);
        System.out.println("floorWeight : " + floorWeight);     // 10
        // 소수점 절삭을 위해 형변환을 이용할 수 있음


    }
}
