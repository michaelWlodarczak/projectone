package edu.sda.grcy.patterns2.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterUsage {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new PupilAdapter(new Pupil("Krzysztof","Ptych","ptych14@wp.pl",19,List.of(4,5,5))));
        students.add(new PupilAdapter(new Pupil("Janusz","Wieczorek","wijan@interia.pl",21,List.of(4,5,3))));

        for (final var student: students) {
            System.out.println(student.getFullName());
            System.out.println(student.getContactDetails());
            System.out.println(student.getResults());
            System.out.println(student.isAdult());
        }
    }
}
