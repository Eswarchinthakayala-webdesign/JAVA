package com.sriram.OOP3;

public class ObjectPrint extends Object {
    int num;
    ObjectPrint(int num){
        this.num=num;
    }
    @Override
    public String toString()
    {
        return "Number is "+num;
    }

    public static void main(String[] args) {
        ObjectPrint obj=new ObjectPrint(45);
        System.out.println(obj.toString());
    }
}
