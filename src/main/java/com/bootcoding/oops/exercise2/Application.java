package com.bootcoding.oops.exercise2;

public class Application {
    public static void main(String[] args) {


        Faculty faculty = new Faculty();
        Projector projector = new Projector();
        Projector[]ps = new Projector[5];

        faculty.startProjector(projector);
        projector.name = "proj1";
        faculty.startProjector(projector.name);

        for (int i = 0; i < ps.length; i++){
            Projector p = new Projector();
            p.name = "projector" + i;
            ps[i] = p;
        }

//        faculty.stopProjector(projector);
        faculty.removeProjector(ps);

        for (Projector s: ps)
            System.out.println(s.name);

    }
}