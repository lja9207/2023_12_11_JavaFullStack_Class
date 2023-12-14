package com.ohgiraffers.excersize.excersize;

public class excercise1 {

    public static void main(String[] args) {
//        String message = "다람에게, 나는 이제 도시로 떠난다. 이 편지를 100명에게 돌리지 않으면 너는 평생 시골쥐일지어다!";
//        System.out.println("----------------------------------------------");
//        System.out.println("김" + message);
//        System.out.println("박" + message);
//        System.out.println("이" + message);
//        System.out.println("최" + message);
//        System.out.println("남" + message);
//        System.out.println("한" + message);
//        System.out.println("방" + message);
//        System.out.println("송" + message);
//        System.out.println("권" + message);
//        System.out.println("홍" + message);

        // a = 1 -> firstName = 김
        // a = 2 -> firstName = 박
        // a = 3 -> firstName = 이
        // a = 4 -> firstName = 최 ...

        int a = 0;
        String msg = "다람에게, 나는 이제 도시로 떠난다. 이 편지를 10명에게 돌리지 않으면 너는 평생 시골쥐일지어다!";
        String firstName = "";

            switch (a)
            {
                case 0 : firstName = "김";
                    System.out.println(firstName + msg);
                    a++;
                case 1 : firstName = "박";
                    System.out.println(firstName + msg);
                    a++;
                case 2 : firstName = "이";
                    System.out.println(firstName + msg);
                    a++;
                case 3 : firstName = "최";
                    System.out.println(firstName + msg);
                    a++;
                case 4 : firstName = "남";
                    System.out.println(firstName + msg);
                    a++;
                case 5 : firstName = "한";
                    System.out.println(firstName + msg);
                    a++;
                case 6 : firstName = "방";
                    System.out.println(firstName + msg);
                    a++;
                case 7 : firstName = "송";
                    System.out.println(firstName + msg);
                    a++;
                case 8 : firstName = "권";
                    System.out.println(firstName + msg);
                    a++;
                case 9 : firstName = "홍";
                    System.out.println(firstName + msg);
                    a++;
        }
        System.out.println("배가 안아팠음좋겠다");
    }
}
