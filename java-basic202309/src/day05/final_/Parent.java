package day05.final_;

class Child extends Parent{
//    public void sing(){
//        System.out.println("zzzz");
//    } final로 인해 제한
    public void dance(){
        int a = 10;
    }
}
public class Parent {
    public final void sing(){}
    public void dance(){}
}
