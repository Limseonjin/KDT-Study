package day01;

public class Casting {
    public static void main(String[] args) {
        byte a = 100;
        int b = a;

        int c = 200;
        byte d = (byte) c;
        System.out.println("d = " + d);

        //다운 캐스팅은 데이터 소실이 발생할 수 있다.
        double n = 3.5;
        int m = (int) n;

        //연산시 일어나는 자동 캐스팅
        int k = 100;
        double j = 5.6;

        double result = k + j;
        //데이터 크기가 다르면 큰쪽으로 자동변환 후 연산
        
        char x = 'A';
        int y = 3;
        char result2 = (char) (x + y);

        System.out.println("result2 = " + result2);

        //int보다 작은 데이터(byte,short,char)의 연산은
        //결과가 자동으로 int 처리가 된다.
        byte b1 = 100;
        byte b2 = 120;
        int result3 = b1 + b2;

        System.out.println('A'+'C'); //132
        int g = 24;
        double r =  g / 5.0;
        System.out.println("r = " + r);


    }
}
