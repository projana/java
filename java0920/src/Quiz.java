import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
//         87P 5.6.7~10번 문제--
        System.out.println("-----문제 5-----");

        System.out.print("논리 연산을 입력하세요>>");

//        사용자 키보드 입력을 받기 위한 Scnner클래스 객체 생성
        Scanner sc = new Scanner(System.in);
//        next () : 공백기호가 있는 위치까지 모든 데이터를 입력받음, 문자열로 입력받음
//        nextBoolean() : r공백 기호가 있는 위치까지 데이터를 boolean타입으로 입력받음
        boolean a = sc.nextBoolean(); // boolean타입으로 데이터 입력
        String op = sc.next();   // string타입으로 데이터 입력
        boolean b = sc.nextBoolean(); // boolean타입으로 데이터 입력

//        입력받은 연산자를 switch ~ case 문으로 비교
        switch (op) {
            case "AND":
                System.out.println(a && b);
                break;

            case "OR":
                System.out.println(a || b);
                break;
        }

        System.out.println("-----문제 6-----");
        System.out.println("돈의 액수를 입력하세요 >>");

//        사용자가 입력 받기 위한 scanner 객체 생성
        Scanner sc1 = new Scanner(System.in);
//        netint() : 사용자의 키보드 이벼력을 받을 때 정수로 받음
        int money = sc1.nextInt();

//        5만원권
        int mo50000 = money / 50000; // 현재 금액에서 5만으로 나눔, 5만원 권 수를 얻음
        money = money % 50000; // 5만원을 모두 제외하고 난 나머지 값, 1만원권 및 다ㅇ른 돈의 액수를 얻을 수있음

//        1만원권
        int mo10000 = money / 10000; // 현재금액에서 1만원으로 나눔, 1만원구너의 수를 얻음
        money = money % 10000; //1만언권을 제외한 나머지 금애을 저장

//        1천원권
        int mo1000 = money / 1000; // 현재금액에서 1천원으로 나눔, 1천원권의 수를 얻음
        money = money % 1000; // 1천원권을 제외한 나머지 금액을 저장

//        500원 동전
        int mo500 = money / 500; // 현재금액에서 500원으로 나눔, 500원동전의 수를 얻음
        money = money % 500; // 500원 동전을 제외한 나머지 금액을 저장

//        100원 동전
        int mo100 = money / 100; // 현재그액에서 100워느올 나눔, 100원동전의 수를 얻음
        money = money % 100; // 100원 동전을 제외한 나머지 금액으 저장

        int mo10 = money / 10; // 현재금액에서 10원으로 나눔, 10원 동전의 수를 얻음
        money = money % 10; // 10원 동전을 제오히ㅏㄴ 나머지 금액을 저장
//      1원 동전
        money = money % 1;

        System.out.println("오만원 " + mo50000 + "개");
        System.out.println("만원 " + mo10000 + "개");
        System.out.println("천원 " + mo1000 + "개");
        System.out.println("500원 " + mo500 + "개");
        System.out.println("100원 " + mo1000 + "개");
        System.out.println("10원 " + mo10 + "개");
        System.out.println("1원 " + money + "개");


        System.out.println("-----문제 7-----");

        System.out.println("학점을 입력하세요>>");

        Scanner scanner = new Scanner(System.in);
//        학점을 저장할 변수 선언, 사용자 입력값을 저장
        String level = scanner.next();

        switch (level) {
            case "A":
            case "B":
                System.out.println("Excellent");
                break;
            case "C":
            case "D":
                System.out.println("Good");
            default:
                System.out.println("Bye");
                break;
        }


        System.out.println("\n-----문제 8-----\n");


//        사용자 입력을 위한 scanner객체 생성
        Scanner sc11 = new Scanner(System.in);
//        화면 출력
        System.out.println("커피 주문하세요>>");

//        사용자 키보드 입력
        String coffee = sc.next(); //문자열
        int count = sc.nextInt(); // 정수

//        스위치문
        switch (coffee) {
            case "에스프레소":
                System.out.println(2000 * count + "원 입니다.");
                break;
            case "아메리카노":
                System.out.println(2500 * count + "원 입니다.");
                break;
            case "카푸치노":
                System.out.println(3000 * count + "원 입니다.");
                break;
            case "카페라떼":
                System.out.println(3500 * count + "원 입니다.");
                break;
            default:
                System.out.println("잘못 입력했습니다.");
                break;
        }


//        if 문 이용
//        System.out.println("커피주문(if문)>>");
//        Scanner scanner3 = new Scanner(System.in);
//        if (menu.equals("에스프레소")) {
//            System.out.println(2000 * count + "원 입니다.");
//        }
//        else if (menu.equals("아메리카노")) {
//            System.out.println(2500 * count + "원 입니다.");
//        }
//        else if (menu.equals("카푸치노")) {
//            System.out.println(3000 * count + "원 입니다.");
//        }
//        else if(menu.equals("카페라떼")) {
//            System.out.println(3500* count+"원 입니다.");
//        }


        System.out.println("\n-----문제 9-----\n");

            System.out.println("1~99 사이의 정수를 입력하세요>>");
            Scanner scanner2 = new Scanner(System.in);

            int input = scanner2.nextInt();
            int f = input / 10; // 10의 자리에 있는 숫자 알아내기
            int s = input % 10; //1의 자리에 있는 숫자 알아내기

//         첫번째 숫자와 두번째 숫자가 3의 배수인지를 저장하는 변수 선언
            boolean first = false; // 기본값 false
            boolean second = false;

//            3,6,9게임이므로 숫자를 3으로 나눈 후 그 나머지가 0이면 3의 배수임
            if (f % 3 == 0) {
//                3의 배수일 경우 first 의 값을 true로 변경
                first = true;
            }
            if (s %3 ==0){
                second =true;
            }

//            and연산 이므로 둘다 true 일 경우 전체가 true
            if(first&&second){
                System.out.println("박수짝짝");
//                or 연산이므로 둘 중 하나만 true  가 되면 결과 전체가 true가 됨
            } else if (first|| second) {
                System.out.println("박수 짝");
            }
            else {
                System.out.println("박수없음");
            }


//        System.out.println("\n-----문제 10-----\n");
//            Scanner sc = new Scanner(System.in);
//            String coffee = sc.next();
//            int count = sc.nextInt();
//
//            if(count >=10){
//                if(menu.equals("에스프레소")){
//                    System.out.println();
//                }
//            }



        }
    }
