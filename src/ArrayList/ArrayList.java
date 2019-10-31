package ArrayList;
import  java.util.ArrayList

import java.util.HashSet;




public class ArrayList {


    java.util.ArrayList<Integer> answers = new java.util.ArrayList<>();
        answers.add(1);
        answers.add(2);
        answers.add(3);

        for (int i = 0; i < answers.size(); i++) {
        answers.set(i, i);
    }
        for (int answer : answers) {
        System.out.println(answer);
    }

    HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        for (int answer : set) {
        System.out.println(answer);
    }



 }






