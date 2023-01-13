import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ayush= new Scanner(System.in);
        String arpit= "ayush , please choice any one- \n 1.rock \n 2.paper \n 3.scissor";
        System.out.println(arpit);
        String user1= ayush.next();
        String arpit1= "shweta , please choice any one- \n 1.rock \n 2.paper \n 3.scissor";
        System.out.println(arpit1);
        String user2= ayush.next();
        if (user1.startsWith("rock")&&user2.startsWith("paper")) {
            System.out.println("congratulation user2 you have win");}
        else if (user2.startsWith("rock")&&user1.startsWith("paper")) {
            System.out.println("congratulation user1 you have win");}
        else if (user1.startsWith("rock")&&user2.startsWith("scissor")) {
            System.out.println("congratulation user1 you have win");}
        else if (user2.startsWith("rock")&&user1.startsWith("scissor")) {
            System.out.println("congratulation user2 you have win");}
        else if (user2.startsWith("paper")&&user1.startsWith("scissor")) {
            System.out.println("congratulation user1 you have win");}
        else if (user1.startsWith("paper")&&user2.startsWith("scissor")) {
            System.out.println("congratulation user2 you have win");}
        else {
            System.out.println("opps!!draw!!");}

        }
    }
