import java.util.Scanner;

class GiceGame{
    public static void main(String[] args){
        System.out.println("Rolling dice...");

        double rand1 = Math.random()*6 + 1;
        double rand2 = Math.random()*6 + 1;
        int num1 = (int)rand1;
        int num2 = (int)rand2;
        int sum = num1 + num2;

        System.out.println("Die 1: " + num1);
        System.out.println("Die 2: " + num2);
        System.out.println("Total value: " + sum);
    }
}
