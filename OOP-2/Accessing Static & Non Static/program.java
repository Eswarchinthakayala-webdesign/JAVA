package com.sriram.staticExample;

public class Main {
    
    //not dependent on objects
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
        Main m=new Main();
        m.greeting();
    }
    //not static,belong to object
    void greeting()
    {
        System.out.println("Hello Guys");
    }
}
