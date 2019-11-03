package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//1.정답을 생성한다.
        Random random = new Random(0);

        System.out.println(random);

        int answer0;
        int answer1;
        int answer2;

        while (true){
            answer0 = random.nextInt(10);
            answer1 = random.nextInt(10);
            answer2 = random.nextInt(10);

            if  (answer0 == answer1 || answer0 == answer2 || answer1 == answer2)
                continue;
            break;
        }
        System.out.printf("[정답]");
        System.out.print(answer0 + " ");
        System.out.print(answer1 + " ");
        System.out.print(answer2 + " ");
        System.out.println();



        int tryCount = 0;

        while(true) {
            tryCount++;
         //2.추측을 입력받는다.

            int guess0;
            int guess1;
            int guess2;

            Scanner scanner = new Scanner((System.in));

            guess0 = scanner.nextInt();
            guess1 = scanner.nextInt();
            guess2 = scanner.nextInt();

            System.out.printf("[추측]");
            System.out.printf(guess0 + " ");
            System.out.printf(guess1 + " ");
            System.out.printf(guess2 + " ");
            System.out.println();

            //3. 결과를 입력받는다.
            int strike = 0;
            int ball = 0;
            int out = 0;

            if (answer0 == guess0)
                strike++;
            else if (answer0 == guess1 || answer0 == guess2)
                ball++;
            else
                out++;

            if (answer1 == guess1)
                strike++;
            else if (answer1 == guess0 || answer1 == guess2)
                ball++;
            else
                out++;

            if (answer2 == guess2)
                strike++;
            else if (answer2 == guess0 || answer2 == guess1)
                ball++;
            else
                out++;

            System.out.println(String.format("S:%d B:%d O:%d", strike, ball, out));


            if (strike == 3)
                break;
        }

        System.out.println(String.format("Count : %d", tryCount));
    }

}
