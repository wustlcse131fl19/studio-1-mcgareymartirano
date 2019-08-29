package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);

        int n1 = ap.nextInt("What is the first of two values to be averaged?");
        int n2 = ap.nextInt("What is the second?");

        double avg = (n1 + n2) / 2.0;

        System.out.println("The average of " + n1 + " and " + n2 + " is " + avg);

    }

}
