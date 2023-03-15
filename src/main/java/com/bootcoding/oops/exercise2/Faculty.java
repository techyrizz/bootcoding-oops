package com.bootcoding.oops.exercise2;

public class Faculty {
    public String name;

    public void startProjector(Projector projector ){
        System.out.println("Projector Starting");
    }
    public void startProjector(String name){
        System.out.println(name + "Projector started");
    }

    public void removeProjector(Projector[] ps){
        System.out.println("Projectors removed");
        for (Projector s : ps){
            System.out.println(s.name);
        }

    }
}
