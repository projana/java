public class LocalGloblaValue {
    public static int value1 = 100; // 전역변수
    public static void method1(){
//        변수 value1이 전역 변수이기때문에 사용 가능
        System.out.println("method1 안에서 value1:"+value1);
    }
    public  static void method2(){
//        method2에서 선언한 변수 value2
        int value2 = 2000;
        System.out.println("method2 안에서 value2:"+value2);
    }
    public  static void method3(){
//        method 3안에서 선언한 변수 value1, value2
        int value1 = 1000;  // 지역 변수 value1
//        method2 안에서 선언한 value2와 method3//  지역 메소드가 다르기 때문에 동일한 이름 사용하는 문제 없음
        int value2 = 2000; // 지역 변수 value2
//         지역 변수 value1과 이름이 같지만 지역변수가 우선순위가 더 높기때문에 지역변수 value1이 사용됨

        System.out.println("method3 안에서 value1:"+value1);
        System.out.println("method3 안에서 value2:"+value2);
    }

    public static void main(String[] args) {

        System.out.println("-----지역변수 / 전역변수 -----");

//        전역변수 : 프로그램 전체에서 언제든지 접근할 수 있는 변수
//        지역변수 : 특정 코드블럭 안에서 선언되고 사용되고  삭제되는 변수

//        지역변수와 전역변수의 이름이 같을 경우 !!!!지역 변수!!!!!!의 우선 순위가 더 높음

        System.out.println("전역 변수 value1 : " + value1);

        method1(); // 메소드 1 실행

        System.out.println();

        method2();

        System.out.println();

        method3();
        System.out.println("method3 밖에서 선언한 ");


    }
}
