package edu.dmacc.codedsm.hw7;

public class SumHundred {
    public static void main(String[] args) {
        int firstInput = 10;
        int secondInput = 20;
        int priorResult = 0;
        int iterations = 0;

        priorResult = addThreeTogether(firstInput, secondInput, priorResult);
        System.out.println(priorResult);

        int total = 0;
        while (total < 100) {
            total = addThreeTogether(firstInput, secondInput, total);
            iterations++;
        }
        System.out.println(total);
        output(total, iterations);

    }

    public static int addThreeTogether(int firstInput, int secondInput, int priorResult) {
        return firstInput + secondInput + priorResult;
    }

    public static void output(int finalResult, int iterations) {
        System.out.println("The first result greater than 100 was " + finalResult + " and took " + iterations + " to complete");
    }
}

