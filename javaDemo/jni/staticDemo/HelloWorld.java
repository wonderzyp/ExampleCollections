package javaDemo.jni.staticDemo;

public class HelloWorld {

  public static native String getFromNative(String name);

  public static void main(String[] args) {
    String text = getFromNative("Is zyp handsome?");
    System.out.println(text);
  }
  
  static{
    System.load("/home/zyp/workplace/ExampleCollections/javaDemo/jni/staticDemo/libHelloWorld.so");
  }
}