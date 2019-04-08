package test;

public class Main {
    public static void main(String[] args) {
        Test1 t1=new Test1();
        Test1 t2=new Test2();
        t1.show();
        t2.show();

        Test1 t4=new Test3();
        Test1 t3=t4;
        t3.show();
        t4.show();
    }
}
