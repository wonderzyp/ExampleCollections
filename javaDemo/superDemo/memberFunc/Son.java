package javaDemo.superDemo.memberFunc;

public class Son extends Parent{
    private static String name = "Son_name";

    @Override
    public void getName() {
        System.out.println(name);
//        super.getName();  // use super to access parent, if you want
    }
}
