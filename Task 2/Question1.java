//Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote.

import java.util.Scanner;
public class Question1 {
    public static void VoteCheck(int age){
        if(age >= 18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cannot vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        VoteCheck(age);
    }
}