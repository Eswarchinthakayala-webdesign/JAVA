package com.sriram.staticExample;



public class InnerClasses {
    static class Test{
        String name;
        public Test(String name)
        {
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Test a=new Test("Eswar");
        Test b=new Test("Sriram");
        System.out.println(a.name);
        System.out.println(b.name);

    }



}
