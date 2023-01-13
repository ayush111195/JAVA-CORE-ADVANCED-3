import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Main {
//    static int sum (int a, int b ){
//        return a+b;}
//        static int sum (int a ,int b,int c){
//        return a+b+c;}
//
//    static int sum (int a ,int b,int c,int d){
//        int z;
//        z=a+b+c;
//
//        return z;}

static int sum(int...arr){
    //avalable ass int []arr
    int sum=0;
    for (int i=0;i<arr.length;i++){
        sum=sum+arr[i];}
        return sum;}


    public static void main(String[] args) {
        System.out.println("the sum of nothimg -"+ sum());
        System.out.println("the sum of two no-" + sum(23,33));
        System.out.println("the sum of 3 no-" + sum(23,33,55 ));
        System.out.println("the sum of 4 no-" + sum(23,33,55 ,44));

        }

    }

