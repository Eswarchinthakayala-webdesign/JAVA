package com.sriram.staticExample;

 class Test{
     static String name;
    public Test(String name)
    {
        Test.name=name;
    }
}
public class InnerClasses {


    public static void main(String[] args) {
        Test a=new Test("Eswar");
        Test b=new Test("Sriram");
        System.out.println(a.name);
        System.out.println(b.name);

    }
}
