public class DataTypes {
    public static void main(String[] args) {
//        기본타입
//        자바에서 사용되는 기본 데이터 타입 8가지를 뜻함
//        byte: 1byte 크기, -128 ~ 127 까지의 정수 (거의 사용 안함)
//        short : 2byte크기, 현ㅇ재 ㄱ의 사용 안함
//        char : 2byte크기,문자 타입이면서 정수 타입. ascii 코드를 사용
//        int : 4byte크기, 자바의 기본 정수 타입
//        long : 8byte크기,int보다 큰 정ㅜ를 사용 시사용, 접미사로 L을 붙여야함.
//        float : 4byte크기, 실수 타입, 많이 사용 안함, 접미사로 F를 붙여야함.
//        double : 8byte크기, 실수 타입, 자바의 기본 실수 타입, 접미사 사용 안함.
//        - float 과 double은 차이가 없어보이지만 정확도의 차이가 발생함.
//        boolean : 1byte크기, true , false만 표현

        byte bValue1 = 10;
        byte bValue2 = 20;
        System.out.println(bValue1);
        System.out.println(bValue2);
//        자바에서 정수 타입의 기본 타입은 int 타입임
//        정수 연산 시 int 타입으로 자동 타입변환됨
//        결과를 int타입의 변수에 저장해야 함
//        만약 byte타입의 변수에 결과를 저장하고 싶을 경우 강제 타입 변환을 해야함
        int bValue3= bValue1+bValue2;
        System.out.println(bValue3);

        char cValue1 ='A';
        char cValue2 ='B';
        System.out.println(cValue1);
        System.out.println(cValue2);
//        char 타입은 문자 타입이면서 정수 타입이기 때문에 char타입의 변수 cValuer1에 정수 70을 입력하면 아스키 코드ㅠ표에 있는 문자
//        'F'가 저장됨
        cValue1 = 70;
        System.out.println(cValue1); //F
        cValue2=102;
        System.out.println(cValue2);//f
//         문자 'C'와 정수 10을 더하면 char타입의 변수 cValue2에 저장 시 아스키 코드표의 정수 77에 해당하는 문자 'M'이 저장됨
        cValue2 = 'C'+10;
        System.out.println(cValue2); //M

        short sValue1 = 100;
        short sValue2 = 200;
        System.out.println(sValue1);
        System.out.println(sValue2);
//        int sValue

//        자바의 정수 기본 타입
        int iValue1 = 1000;
        int iValue2 = 2000;
        System.out.println(iValue1);
        System.out.println(iValue2);
        int iValue3 = iValue1+iValue2;
        System.out.println(iValue3);//3000

        long lValue1 = 100000L;
        long lValue2 = 200000L;
        System.out.println(lValue1);
        System.out.println(lValue2);
        lValue1 =100000;
        lValue2 =200000;
        System.out.println(lValue1);
        System.out.println(lValue2);
//        작은 데이터 타입에서 큰 데이터 타입으로 데이터 저장 시 자동 타입 변환
//        int +int 형태가 되어 결과가 int타입으로 됨
//        그 결과를 long 타입의 변수에 저장하기 때문에 자동타입 변환이 발생함
        long lValue3 = lValue1+lValue2;
        System.out.println(lValue3);//300000

        // int 타입의 데이터(100000)가 자동 타입변환되어 long타입의 변수에 저장됨(100000L),
        long lValue4 = 100000;
        System.out.println(lValue4);
//        int 타입의 데이터 100000를 long타입에 저장하는 것과 long 타입의 데이터 100000L을 long타입의 변수에 저장하는 것은 차이가 없음
        lValue4 = 100000L;
        System.out.println(lValue4);

//      int타입의 데이터는 -21억 ~ +21억 까지 표현이 가능 ㅏ기 때문에 그 이상의 숫자를 표현하려면 ,long타입의 데이터롤 표현해야 함
//        int iValue4 = 10000000000;
//        10000000000 은 int타입의 리터럴 데이터 이기 때문에int 타입에서 표현할 수 있는 ㄷ최대값을 벗어나서 오류가 발생함
//        리터럴 데이터를 표시할 경우에도 -21억~+21억을 벗어날 경우 접미사 L을 추가하여 long 타입의 데이터로 표시해야함.
        lValue4=1000000000L;
        System.out.println(lValue4);



        float fValue1 = 10.5F;
        float fValue2 = 20.5F;
        System.out.println(fValue1);
        System.out.println(fValue2);

        double dValue1 = 100.5;
        double dValue2 = 200.5;
        System.out.println(dValue1);
        System.out.println(dValue2);

        boolean boolValue = true;//t
        System.out.println(boolValue);//t

//        자동 타입 변환 : 작은 데이터 타입의 데이터를 큰 데이터 타입의 변수에 저장하는 것, 컴파일러가 알아서 자동으로 변환함,
//데이터 손실이 없음

//        byte bValue5 =10;
//        System.out.println("byte타입의 변수 bValuer5 :" + bValue5);
//        int iValue5 = bValue5;
//        System.out.println("int 타입의 변수 iValuer5 :"+ iValue5);
//        long iValue5 = iValue5;
//        System.out.println("long 타입의 변수 lValuer5 :"+ bValue5);
//        float fValue5 = lValue5;
//        System.out.println("flat 타입의 변수 fValuer5 :"+ fValue5);
//        double dValue5 = lValue5;
//        System.out.println("double 타입의 변수 dValuer5 :"+ dValue5);

        System.out.println("\n-----float과 double의 정확도  -----\n");

        float fValue6 = 10.1234567890123456789F; //소수점 6자리 반올림 --잘안씀
        double dValue6 = 10.1234567890123456789;  //ㅇ접미사 안붙여도 되고

        System.out.println("float의 정확도 :"+fValue6);
        System.out.println("double의 정확도 :"+dValue6);

//        강제 타입 변환 : 큰 데이터 타입의 데이터를 작은 데이터 타입의 변수에 저장하는 방법, 사용자가 직접 변환할 데이터 타입을 입력, 데이터의 손실이 발생할 수 있음!
        int iValue6 = 100;
        byte bValue6 = (byte) iValue6;
        System.out.println("bValue6 :"+ bValue6);

        long lValue6 = 500;
        lValue6 = (int)lValue6;
        System.out.println("iValue6의 값:"+iValue6);

        double dValue7 = 3.14;
        iValue6 = (int)dValue7;
        System.out.println("iValue6의 값 :"+iValue6);
//
//      강제 타입변환시 주의사항
//        큰 데이터 타입의 테이터를 작은 데이터 타입의 벼수에 저장 시 작은 데이터 타입이 제공하는 사용 범위를 넘어가게 될 경우 정상적인 데이터를 저장한다고 보장할 수 없음

        int iValue8 =100;
        System.out.println("iValue8의 값:"+iValue8);

        byte bValue8 = (byte)iValue8;
        System.out.println("bValue8의 값:"+bValue8);

        iValue8=128;
        System.out.println("iValue8의 값:"+iValue8);

//        강제 타입 변환 시 기존 데이터가 작은 데이터 타입의 최소 혹은 최대값의 범위를 벗어날 경우ㅂ 반대값이 출력됨

        bValue8= (byte) iValue8;
        System.out.println("bValue8의 값:"+bValue8);//-128

//        연산식 안에서 자동 타입 변환
//        서올 다른데이터 탕비을 연산 시 큰 테이터 타입으로 변환 후 연산
        System.out.println("\n----- 연산식에서 자동 타입 변환------\n");

        int iValue9 = 100;
        double dValue9 = 10.5;

        double dResult = iValue9 + dValue9;
        System.out.println("result : "+ dResult);

//        int 타입과 double타입의 데이터를 연산 시 큰 데이터 타입인 double타입으로 자동 타입 변환되기 때문에 결과가 double타입으로 출력됨
//        double타입으로 출력된 결과를 int타입의 변수에 저장하려고 하기 때문에 오류가 발생함
//        오류가 발생하지 않으려면 저장할 변수를 double로 바꾸던지, 연산된 결과를 int타입으로 강제 타입 변환해야 함.
        int iResult = (int)(iValue9/3.0);
        System.out.println("iResult :"+iResult);



    }
}
