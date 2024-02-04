package homeass;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scissor, Rock, and Paper game between Computer and You");
        System.out.println("Rule: 0 for Scissor, 1 for Rock, and 2 for Paper");
        int min = 1, max = 3;
        int com = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Enter your choice: ");
        int user = sc.nextInt();
        String mess_com = "", mess_user = "";
        switch (com) {
            case 0:
                mess_com = "Scissor";
                break;
            case 1:
                mess_com = "Rock";
                break;
            default:
                mess_com = "Paper";
        }
        switch (user) {
            case 0:
                mess_user = "Scissor";
                break;
            case 1:
                mess_user = "Rock";
                break;
            default:
                mess_user = "Paper";
        }
        if (com == user) {
            System.out.println("The computer is " + mess_com + ". You are" + mess_user + " too. It is a draw");
        } else if ((com == 1 && user == 0) || (com == 0 && user == 2) || (com == 2 && user == 1)) {
            System.out.println("The computer is " + mess_com + ". You are" + mess_user + ". Computer won");
        } else {
            System.out.println("The computer is " + mess_com + ". You are" + mess_user + ". You won");
        }
    }
}