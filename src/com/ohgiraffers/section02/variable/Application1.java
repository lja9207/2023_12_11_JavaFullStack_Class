package com.ohgiraffers.section02.variable;

public class Application1 {
    public static void main(String[] args) {

        /* 변수의 사용 목적
            1. 값에 의미를 부여하기 위함
            2. 한 번 저장한 값을 재사용하기 위함
            3. 시간에 따라 변하는 값을 저장 및 사용하기 위함
         */

        System.out.println("========== 1. 값에 의미를 부여하기 위함 ==========");
        System.out.println("용돈을 포함한 자산 잔고 : " + (1000000 + 200000) + "원");

        int wallet = 200000;
        int pocketMoney = 1000000;

        System.out.println("용돈을 포함한 자산 잔고 : " + (pocketMoney + wallet) + "원");

        System.out.println("========== 2. 한 번 저장한 값을 재사용하기 위함 ==========");
        System.out.println("김다람에게, 나는 이제 도시로 떠난다. 이 편지를 100명에게 돌리지 않으면 너는 평생 시골쥐일지어다!");
        System.out.println("박다람에게, 나는 이제 도시로 떠난다. 이 편지를 100명에게 돌리지 않으면 너는 평생 시골쥐일지어다!");
        System.out.println("이다람에게, 나는 이제 도시로 떠난다. 이 편지를 100명에게 돌리지 않으면 너는 평생 시골쥐일지어다!");
        System.out.println("최다람에게, 나는 이제 도시로 떠난다. 이 편지를 100명에게 돌리지 않으면 너는 평생 시골쥐일지어다!");
        System.out.println("남다람에게, 나는 이제 도시로 떠난다. 이 편지를 100명에게 돌리지 않으면 너는 평생 시골쥐일지어다!");
        System.out.println("한다람에게, 나는 이제 도시로 떠난다. 이 편지를 100명에게 돌리지 않으면 너는 평생 시골쥐일지어다!");
        System.out.println("방다람에게, 나는 이제 도시로 떠난다. 이 편지를 100명에게 돌리지 않으면 너는 평생 시골쥐일지어다!");
        System.out.println("송다람에게, 나는 이제 도시로 떠난다. 이 편지를 100명에게 돌리지 않으면 너는 평생 시골쥐일지어다!");
        System.out.println("권다람에게, 나는 이제 도시로 떠난다. 이 편지를 100명에게 돌리지 않으면 너는 평생 시골쥐일지어다!");
        System.out.println("홍다람에게, 나는 이제 도시로 떠난다. 이 편지를 100명에게 돌리지 않으면 너는 평생 시골쥐일지어다!");

        String message = "다람에게, 나는 이제 도시로 떠난다. 이 편지를 100명에게 돌리지 않으면 너는 평생 시골쥐일지어다!";
        System.out.println("----------------------------------------------");
        System.out.println("김" + message);
        System.out.println("박" + message);
        System.out.println("이" + message);
        System.out.println("최" + message);
        System.out.println("남" + message);
        System.out.println("한" + message);
        System.out.println("방" + message);
        System.out.println("송" + message);
        System.out.println("권" + message);
        System.out.println("홍" + message);

        System.out.println("========== 3. 시간에 따라 변하는 값을 저장 및 사용하기 위함 ==========");

        int acorns = 1;
        System.out.println("지금 도토리가 몇 개 있지? " + acorns + "개 있네~ 쇼핑을 가야겠다~");

        acorns = acorns + 100;
        System.out.println("도토리 샀다~ 그럼 지금은 몇 개지? " + acorns + "개다! 아싸~");

        acorns = acorns - 27;
        System.out.println("걸었더니 배고프네... 얼마 안 먹었는데 몇 개 남았지? " + acorns + "개?!");

        acorns = acorns + 3;
        System.out.println("댕이득!!! 도토리 주웠다~~~ 이제 " + acorns + "개야!");


    }
}
