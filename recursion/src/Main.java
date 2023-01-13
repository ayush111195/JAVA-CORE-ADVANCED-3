import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Main {
//                             question no=1  (print no 1 to 5)
    static void num(int n) {
        if (n==6){
          return;
        }
        System.out.println(n);
        num(n+1);
    }

//  question no=2  (the sum of naturel no= )

    static int sum(int m){
        if (m==1){
            return 1;
        }

        return m+sum(m-1);
    }
// question no=3  ( find the =g! )

     static int  fact(int g){
        if (g==1||g==0){
            return 1;
        }
         return g*fact(g-1);
    }

//question no=3  (a ki power b find karna )
    static int power(int y,int u){ v 4
        if (u==0){
            return 1;
        }
        return y*power(y,u-1);
    }

    public static void main(String[] args) {
//  1=
       num(1);

//  2=
       System.out.println(sum(7));

//  3=
        System.out.println(fact(5));

//  4=
        System.out.println(power(3,5));








//        Scanner ayush=new Scanner(System.in);
//        System.out.println("enter your no -");
//        int a= ayush.nextInt();
//        int multi=1;
//        for (int i =1;i<=a;i++){
//            multi=multi*i;
//        }
//        System.out.println("the factorial of your enter no is - " + multi);
//
//                               // when we use recursion
//
    }
}