package com.sriram.staticExample;

public class Main {

    public static void run()
    {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        Human h1=new Human(12,"Eswar",100000,false);
        Human h2=new Human(12,"Eswar",100000,false);
        Human h3=new Human(12,"Eswar",100000,false);
        Human h4=new Human(12,"Eswar",100000,false);
        System.out.println(Human.population);
        run();
    }
}
