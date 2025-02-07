package com.Eswar;
import java.util.*;
public class WrapperExample {
    public static void main(String[] args) {
        final int INC=5;
        System.out.println(INC);
        Integer num=45;
        Integer num1=num;
        num=35;
        System.out.println(num1);

        final A p1=new A("Eswar");
        System.out.println(p1.name);
        p1.name="Sriram";
        System.out.println(p1.name);
        // we can't reassign it,when we use final keyword for object but we can change value
//        p1=new A("Vamsi");
//        System.out.println(p1.name);

        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj=new A("New Name");
        }

    }
}

class A
{
    final int num=5;
    String name;
    A(String name)
    {
        System.out.println("Object is created");
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed");
    }
}
