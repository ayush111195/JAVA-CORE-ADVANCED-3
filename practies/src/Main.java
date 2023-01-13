import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //question no-1---------------
        //int a=10;
        //if (a=11)
        //if ke sath (=) nhi lta yhan (==) lgana pdta h................
        //right solution
        int a = 10;
        if (a == 11) {
            System.out.println("i am 11");
        } else {
            System.out.println("i am not 11");
        }
        //----------------------------------------------------------------------------------
                                                //question no-2---------------

        Scanner ayush = new Scanner(System.in);
        System.out.println("enter your name-");
        String str = ayush.next();
        System.out.println(" enter your m no-");
        int marks1 = ayush.nextInt();
        System.out.println(" enter your c no-");
        int marks2 = ayush.nextInt();
        System.out.println(" enter your p no-");
        int marks3 = ayush.nextInt();
        int sum = marks3 + marks2 + marks1;
        int sum1 = sum * 100;
        int totel = 300;
        float per = sum1 / totel;
        System.out.println("your %number is -");
        System.out.println(per + "%");
        if (per < 40) {
            System.out.println("you are fail");
        } else if (marks1 < 33) {
            System.out.println("you are fail");
        } else if (marks2 < 33) {
            System.out.println("you are fail");
        } else if (marks3 < 33) {
            System.out.println("you are fail");
        } else {
            System.out.println(" hey " + str + " congratulations you are pass!!!");
        }
        //or
        if (per < 40 && marks1 < 33 && marks2 < 33 && marks3 < 33) {
            System.out.println(" sorry " + str + " you are fail ");
        } else {
            System.out.println("conggratulations " + str + " you are pass");
        }
        //-----------------------------------------------------------------------------------
                                                   //question no 3

        System.out.println("enter your income-");
        long income= ayush.nextLong();
        if (income<250000){
            System.out.println("you are tax free");}
        else if ( income<500000){
            System.out.println("your tax is = 5%");
        long tax=income*5/100;
        System.out.println("you have to pay-"+ tax+"Rs");}
         else if (income<1000000){
            System.out.println("your tax is =20%");
            long tax1=income*20/100;
            System.out.println("you have to pay-"+ tax1+"Rs");}
         else  {System.out.println("your tax is =30%");
             long tax2=income*30/100;
             System.out.println("you have to pay-"+ tax2+"Rs");}
         //------------------------------------------------------------------------------------------------
                                                   //question no-4------

       System.out.println("enter your no -");
        int day= ayush.nextInt();
        switch (day){
            case 1 :
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3 :
                System.out.println("wednesday");
                break;
            case 4 :
                System.out.println("thursday");
                break;
            case 5 :
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;}
      //  --------------------------------------------------------------------------------------------
                                                        //question no - 5

       System.out.println("enter youe website name->");
        String website = ayush.next();
        if(website.endsWith(".com")){
            System.out.println("this is a commercial website");}
        else if (website.endsWith(".org")) {
            System.out.println("this is a organatigation website");}
        else if (website.endsWith(".in")) {
            System.out.println("this is a indian website");}
        //--------------------------------------------------------------------------------------------------
                                                  //question no-6

        System.out.println("enter the year-");
        int year = ayush.nextInt();
        if (year%4==0){
            System.out.println("this is leap year");}
        else if (year%400==0) {
            System.out.println("this is leap year");}
        else{
            System.out.println("this this not leap year");}
        int year3 = ayush.nextInt();
        System.out.println(year3%3);
    }
}
//-------------------------------------------------------------------------------------





