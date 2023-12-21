package day01;

public class DataType {
    static int add (int n1,int n2){
        return n1+n2;
    }
    public static void main(String[] args) {
        byte i = 10;
        float v = 3.154315345344444444444f;
        double f = 1.4634135413541;

        boolean b1 = true;
        boolean b2 = false;

        if(b1){

        }
        char cc = 97; //65,97 =>A,a
        System.out.println("cc = " + cc);
        
        char[] str = {'h','e','l','l','o'};
        System.out.println("new String(str) = " + new String(str));

        //String은 기본 타입(int,double,boolean...)이 아님
        String s = "hello";
    }
}
