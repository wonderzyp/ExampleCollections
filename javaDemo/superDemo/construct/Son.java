package javaDemo.superDemo.construct;

public class Son extends Parent{
    public Son(String name, int id){
        super(name, id);
        System.out.println("son"+name+" "+id);
    }
}
