package Marklist;
import java.util.Scanner;

public class Marklist {

    public static void main(String[] args) {
        int n = 4;
        String[] names = new String[n];
        int[] mark1 = new int[n];
        int[] mark2 = new int[n];
        int[] mark3 = new int[n];
        int[] total = new int[n];
        String[] results = new String[n];
        float[] average = new float[n];
        String[] grade = new String[n];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter your Name for student " + (i + 1) + ":");
            names[i] = input.next();
            System.out.println("Enter Mark1 for student " + (i + 1) + ":");
            mark1[i] = input.nextInt();
            System.out.println("Enter Mark2 for student " + (i + 1) + ":");
            mark2[i] = input.nextInt();
            System.out.println("Enter Mark3 for student " + (i + 1) + ":");
            mark3[i] = input.nextInt();

            total[i] = mark1[i] + mark2[i] + mark3[i];
            average[i] = (float) (total[i] / 3);
            if (average[i] >= 50) {
                results[i] = "P";
            } else {
                results[i] = "F";
            }

            if (average[i] >= 80 && average[i] <= 100) {
                grade[i] = "A";
            } else if (average[i] >= 75 && average[i] <= 79.9) {
                grade[i] = "B+";
            } else if (average[i] >= 65 && average[i] <= 74.9) {
                grade[i] = "B";
            } else if (average[i] >= 55 && average[i] <= 64.9) {
                grade[i] = "C+";
            } else if (average[i] >= 50 && average[i] <= 54.9) {
                grade[i] = "C";
            } else if (average[i] >= 40 && average[i] <= 49.9) {
                grade[i] = "D";
            } else {
                grade[i] = "F";
            }
        }

        String star = new String(new char[70]).replace('\0', '*');
        System.out.println(star);
        System.out.println("                     STUDENT MARKLIST                     ");
        System.out.println(star);
        System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAverage\tGRADE");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 101) + "\t" + names[i] + "\t" + mark1[i] + "\t" + mark2[i] + "\t" + mark3[i] +
                    "\t" + total[i] + "\t" + results[i] + "\t" + average[i] + "\t" + grade[i]);
        }
    }
}
