import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // question no 1-- (change the string to lower case)
        String name = "ARPIT GUPTA";
        System.out.println(name.toLowerCase());
        // question no 2--(replace spaces with underscore)
        System.out.println(name.replace(" ", "_"));
                       // question no 3---
          //  Scanner ayush = new Scanner(System.in);
         //System.out.println("enter your name-");
         //String a1= ayush.next();
        // String name1 = "shivam";
        //System.out.println(" dear " + a1 + " thanks a lot");
        // String name2= "gupta";
        // System.out.println(name1.replace(name1,name2));
        //System.out.println("enter your name2-");
        // String a2=ayush.next();
        //System.out.println(a1.replace(a1,a2));
                       //question no---4
        String name3= " dear  <|name|>   thanks a lot ";
        System.out.println(name3.replace("<|name|>","jay prakash "));
                       //question no --5
         String name4 ="he   is   a   good    boy";
        System.out.println(name4.indexOf("  "));
        System.out.println(name4.indexOf("   "));
                    //question no--6
        String name5="AYUSH IS A GOOD BOY.";;
        System.out.println(name5.equalsIgnoreCase("ayush is a good boy."));
                     //question no--7
        String name6="hey ayush, \n\tthis java course is nice .\n thanks!";
        System.out.println(name6);
                      //(\n)=new line ke leye
                      //(\t)= new tabe ke leye
        String name7="hey ayush, \b this java course is nice .\b thanks!";
        System.out.println(name7);
                      //(\b)=khud se just pehle wale char, symble ko gyb kr deti h
        String name8="hey ayush, \r this java course is nice , thanks!";
        System.out.println(name8);
                      //(\r)=khud se pehle wali sabhi chejo ko khtm kr deti h
        String name9="hey ayush, \f this java course is nice .\f thanks!";
        System.out.println(name9);
                      //(\f)=khud ki jgh ek box bna deti h
        String name10="hey ayush, \'this java course is nice .\' thanks!";
        System.out.println(name10);
                      //(\')=khud ki jgh ' lga deti h
        String name11="hey ayush, \"this java course is nice .\" thanks!";
        System.out.println(name11);
                       //(")=khud ki jgh " lga deta h
        String name12="hey ayush, \\this java course is nice .\\ thanks!";
        System.out.println(name12);
                        //(\\)=khud ki jgh \\ lga deta h

    }
}