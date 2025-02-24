package com.sriram.OOP3;

public class ObjectPrint extends Object {
    int num;
    ObjectPrint(int num){
        this.num=num;
    }
    final  void ans()
    {
        System.out.println("Number is :"+num);
    }

    public static void main(String[] args) {
        ObjectPrint obj=new ObjectPrint(34);
        obj.ans();
    }
}
