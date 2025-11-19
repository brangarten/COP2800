/*
Scenario:
Teachers spend too much time converting numeric scores into letter grades. 
This software automates the process using adjustable grading scales.

Inputs:

    scale (1=Strict, 2=Normal, 3=Easy)

    score (0–100)

Logic:

    switch(scale) → adjusts the score:

        Strict: subtract 5 points

        Easy: add 5 points

        Normal: no change

    if/else if → assign letter grade:

        ≥90 A, ≥80 B, ≥70 C, ≥60 D, else F

Output: Letter grade and adjusted score.
 */

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class set3_education {
    public static void main(String[] args) {
        short scale = 0, score = 0, scalePoints = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Select the scale (1 - Strict, 2 - Normal, 3 - Easy)" + "\n> ");
        scale = scan.nextShort();

        /* Make registry instead of having goyslop if statements 
        Map<Short, Character> letterGrade = new HashMap<>();
        letterGrade.put(90, 'A');
        */
        switch (scale) {
            case 1:
                scalePoints -= 5;
                break;
            case 2:
                scalePoints += 5;
                break;
            case 3:
                scalePoints = 0;
                break;
        }

        System.out.print("Enter score" + "\n> ");
        score = scan.nextShort();

        short totalScore = (short) (score + scalePoints);
        scan.close();

        if (totalScore >= 90) {
            System.out.println("Letter grade: A");
        } else if (totalScore >= 80) {
            System.out.println("Letter grade: B");
        } else if (totalScore >= 70) {
            System.out.println("Letter grade: C");
        } else if (totalScore >= 60) {
            System.out.println("Letter grade: D");
        } else {
            System.out.println("Letter grade: F 💀");
        }
    }
}