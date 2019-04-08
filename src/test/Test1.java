package test;

public class Test1 {
    private String name="Test1";

    public Test1() {
    }

    public Test1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("This is Test1");
    }
}
