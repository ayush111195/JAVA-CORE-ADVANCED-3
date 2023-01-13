//class main {
//    public static int ayush(int B,int H,boolean flage){
//        Scanner sc=new Scanner(System.in);
//        B=sc.nextInt();
//        H=sc.nextInt();
//        flage=false;
//        if (B>0&&H>0) flage=true;
//        else {
//            System.out.println("java.lang.Exception: Breadth and height must be positive");}




 //   public static void main(String[] args)  {

//        int n= sc.nextInt();
//        int j = 2;
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int result1=(a+b);
//        System.out.println(result1);
//         int result=1;
//        for(int i=1;i<=n-1;i++){
//            result=(result*j);
//            result1=b*result+result1;
//            System.out.println(result1);
//        }
//        int n=5;
//        int j=2;
//        int a=5;
//        int b=3;
//        int ser;
//        int result1=a+b;
//        int result=1;
//        for(int i=1;i<=n;i++){
//           result=(result*j);
//
//            result1=b*result+result1;
//            System.out.println(result1);
//        }
//        long x=sc.nextLong();
//        System.out.println(x+" can be fitted in:");
//        if(x>=-128 && x<=127)System.out.println("* byte");
//        if (x>=-2147483648&& x<=2147483647) {
//            System.out.println("* int");
//        }
//        if (x>=-9223372036854775808l&& x<= 9223372036854775807l) {
//            System.out.println("* long");
//
//        }
//if (x>= -( math.pow(2,16))&&x<=math.pow(2,16)-1) System.out.println("*short")


 //   mport java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

//public class Solution {
//    public static int ayush(int B,int H,boolean flag){
//        Scanner sc=new Scanner(System.in);
//        B=sc.nextInt();
//        H=sc.nextInt();
//        flag=false;
//        if (B>0&&H>0) flag=true;
//        else {
//            System.out.println("java.lang.Exception: Breadth and height must be positive");}
//        public static void main(String[] args){
//            if(flag){
//                int area=B*H;
//                System.out.print(area);
//            }

 //       }//end of main

   // }//end of class
//import java.util.Currency;
//
//public class Main {
//
//    public static void main(String[] args) {
//      //  Scanner scanner = new Scanner(System.in);
//     //   double payment = scanner.nextDouble();
//     //   scanner.close();
//        Currency cur =Currency.getInstance("usd");
//        String us=cur.getSymbol();
////        String in="Rs.";
////        Currency curr =Currency.getInstance("fen");
////        String c=curr.getSymbol();
////        Currency curre =Currency.getInstance("FRF");
////        String f=cur.getSymbol();
//
//
//        System.out.println("US: " + us);
////        System.out.println("India: " + in+payment);
////        System.out.println("China: " + c+payment);
////        System.out.println("France: " + f+payment);
//    }
//}
//import java.util.Currency;
//public class Main {
//    public static void main(String args[]) {
//       Scanner scan=new Scanner(System.in);
//        double payment=scan.nextDouble();
//        // Create a currency for USD
//        Currency cur = Currency.getInstance("USD");
        // Get and print the symbol of the currency
//        String symbol = cur.getSymbol();
//        Currency curr = Currency.getInstance("EUR");
//        String symbol1 = curr.getSymbol();
//        String symbol2="Rs.";
//        Currency curren = Currency.getInstance("CNY");
//        String symbol3 = curren.getSymbol();
//
//
//        System.out.println("Currency symbol is: " + symbol+payment);
//        System.out.println("Currency symbol is: " + symbol1+payment);
//        System.out.println("Currency symbol is: " + symbol2+payment);
//        System.out.println("Currency symbol is: " + symbol3+payment);
//
//    }
//}


//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        String A="ayushgupta";//sc.next();
//        String B="arpit";//sc.next();
//        System.out.println((A.length())+B.length());
//        int x=(A.compareTo(B));
//        if(x>0){
//            System.out.println("Yes");}
//        else {
//            System.out.println("No");}
//        String firstLetter = A.substring(0, 1);
//       // System.out.println(firstLetter);
//        String remainingLetters = A.substring(1, A.length());
//       // System.out.println(remainingLetters);
//        firstLetter = firstLetter.toUpperCase();
//        A=firstLetter+remainingLetters;
//       // System.out.println(A);
//        String firstlatter =B.substring(0,1);
//        String remaininglattter=B.substring(1,B.length());
//        firstlatter=firstlatter.toUpperCase();
//        B=firstlatter+remaininglattter;
//        System.out.println(B+" "+A);
//
//        /* Enter your code here. Print output to STDOUT. */

//        for (int i=A.length()-1;i>=0;i--){
//            rev=rev+A.charAt(i);
//        }
//        System.out.println(rev);
//        List<String>list1=new ArrayList<String>();
//        for (int i=0;i<=A.length()-3;i++){
//            //for (int j=0;j<=n;j++){
//              String B=  A.substring(i,i+3);
//              //  System.out.println(B);
//            list1.add(B);}
//
//
//          //  System.out.println(list1);
//        Collections.sort(list1);
//      //  System.out.println(list1);
//        System.out.println(list1.get(0));
//        System.out.println( (list1.get(list1.size()-1)));

     //   Java program to demonstrate
// isProbablePrime() method of BigInteger
//
//public class Main {
//
//
//
//    public static void main(String[] args) {
//        int a=123456;
//        System.out.println(a.intValue);

  //  }}
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        BigInteger A = scan.nextBigInteger();
//        BigInteger B = scan.nextBigInteger();
//        if(((int) Math.log10(A.intValue())+1)<200 &&((int) Math.log10(B.intValue()) + 1)<200);
//      //  if(((int) Math.log10(A.intValue())+1)<200 && ((int) Math.log10(B.intValue())+1)<200){
//        {
//            System.out.println(A.add(B));
//            System.out.println(A.multiply(B));
//        }
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//    }
//}
//
//import java.math.BigDecimal;
//import java.util.*;
//class Solution{
//
//    public static void main(String []args){
//        //Input
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        String []s=new String[n+2];
//        for(int i=0;i<n;i++){
//            s[i]=sc.next();
//        }
//        sc.close();
//        int temp;
//        for (int i=0;i<s.length-2;i++) {
//            for (int j=0;j<s.length-2;j++){
//                if(s[j]<s[j+1]){
//            }
//
//
//        }
//        //Output
//        for(int i=0;i<n;i++)
//        {
//            System.out.println(s[i]);
//        }
//    }
//
//}
//                            precties set -9
//
// class employee{
//    int salary;
//    String name;
//    public int getSalary ( ) {
//        return salary;
//    }
//    public String getName() {
//        return name;
//    }}
//    class phone{
//    public void ring(){
//        System.out.println("ringing");
//    }
//    public void vibrate(){
//        System.out.println("vibrate");
//    }
//    public void CallFrnd(){
//        System.out.println("call mukul ");
//    }
//    }
//    class square{
//    int side1;
//    int side2;
//                  //  or
////        public  void side(int side1, int side2) {
////           this. side1=side1;
////           this.side2=side2;
////        }
//        public void area (){
//            System.out.println(side1*side2);
//        }
//        public void perimetar(){
//            System.out.println(2*(side2+side1));
//        }
//    }
//      public class Main {
//
//      public static void main(String[] args) {
//          employee ayush=new employee();
//          ayush.salary=12345;
//          ayush.name="ayush gupta";
//          System.out.println(ayush.getSalary());
//          System.out.println(ayush.getName());
//
//      //    porblem no 2-
//          phone apple=new phone();
//          apple.ring();
//          apple.vibrate();
//          apple.CallFrnd();
//
//      //   problem no 3-
//          square abcd=new square();
////          abcd.side1=3;
////          abcd.side2=9;
//          abcd.side(3,9);
//          abcd.perimetar();
//          abcd.area();
//      }
//}
//
//  class circul {
//    int redius;
//
//    circul(int a){
//      this.redius=a;
//    //  System.out.println("ayush");
//    }
//    public double  area1(){
//      return 2*3.14*redius;
//    }
//  }
//class cyalnder extends circul{
//int height;
//cyalnder(int b ) {
//  super(12);
//  this.height=b;
// // System.out.println("arpit");
//}
// public double area(){
//  return  2*3.14*redius*height;
//  }
//
//}
//class ayush{
//  public
//}
//public class Main {
//  public static void main(String[] args) {
//    cyalnder show=new cyalnder(13);
//   // show.area1();
//    System.out.println(show.area());
//
//  }
//}
//

//
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//class Arithmetic{
////  int a;
////  int b;
//  public int add( int a,int b){
////    this.a=a;
////    this.b=b;
//    return a+b;
//  }
//
//}
//class Adder extends Arithmetic{
//
//}
//public class Main {
//  public static void main(String[] args) {
//    // Create a new Adder object
//    Adder a = new Adder();
//
//    // Print the name of the superclass on a new line
//    System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
//
//    // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
//    System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
//  }
//}

//Write your code here
//
//import java.util.*;
//abstract class Book{
//  String title;
//  abstract void setTitle(String s);
//  String getTitle(){
//    return title;
//  }
//}
//
//class MyBook extends Book{
//  void setTitle(String s){
//    this.title=s;
//  }
//
//}
//
//public class Main{
//
//  public static void main(String []args){
//    //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
//    Scanner sc=new Scanner(System.in);
//    String title=sc.nextLine();
//    MyBook new_novel=new MyBook();
//    new_novel.setTitle(title);
//    System.out.println("The title is: "+new_novel.getTitle());
//    sc.close();
//
//  }
//}
//
//import org.w3c.dom.ls.LSOutput;
//
//import java.util.*;
//interface AdvancedArithmetic{
//  int divisor_sum(int n);
//}
//class MyCalculator implements AdvancedArithmetic {
//  @Override
//  public int divisor_sum(int n) {
//    int sum = 0;
//    for (int i = 1; i <=n; i++) {
//      if (n % i == 0) {
//        sum = sum + i;
//
//      }
//
//    }
//
//    return sum;
//  }
//}
//
//class Solution{
//  public static void main(String []args){
//    MyCalculator my_calculator = new MyCalculator();
//    System.out.print("I implemented: ");
//    ImplementedInterfaceNames(my_calculator);
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    System.out.print(my_calculator.divisor_sum(n) + "\n");
//    sc.close();
//  }
//  /*
//   *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
//   */
//  static void ImplementedInterfaceNames(Object o){
//    Class[] theInterfaces = o.getClass().getInterfaces();
//    for (int i = 0; i < theInterfaces.length; i++){
//      String interfaceName = theInterfaces[i].getName();
//      System.out.println(interfaceName);
//    }
//  }
//}

//public class Main{
//  public static void main(String[] args) {
//    System.out.println("ayush gupta");
//  }
//}
//import java.io.*;
//import java.lang.reflect.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;



//  void add(int n1,int n2) {
//  }
//  void add(int n1,int n2,int n3){
//
//  }
//  void add(int n1,int n2,int n3,int n4,int n5){
//
//  }
//  void add(int n1,int n2,int n3,int n4,int n5,int n6){
//
//  }
//  public int  method (){
//
//    return 0;
//  }
//}
//class set{
//
//}
//

//public class Solution {
//
//  public void main(String[] args) {
//    try{
//      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//      int n1=Integer.parseInt(br.readLine());
//      int n2=Integer.parseInt(br.readLine());
//      int n3=Integer.parseInt(br.readLine());
//      int n4=Integer.parseInt(br.readLine());
//      int n5=Integer.parseInt(br.readLine());
//      int n6=Integer.parseInt(br.readLine());
//      Add ob=new Add();
//      ob.add(n1,n2);
//      ob.add(n1,n2,n3);
//      ob.add(n1,n2,n3,n4,n5);
//      ob.add(n1,n2,n3,n4,n5,n6);
//      Method[] methods=Add.class.getDeclaredMethods();
//      Set<String> set=new HashSet<>();
//      boolean overload=false;
//      for(int i=0;i<methods.length;i++)
//      {
//        if(set.contains(methods[i].getName()))
//        {
//          overload=true;
//          break;
//        }
//        set.add(methods[i].getName());
//
//      }
//      if(overload)
//      {
//        throw new Exception("Overloading not allowed");
//      }
//    }
//    catch(Exception e)
//    {
//      e.printStackTrace();
//    }
//  }
//
//
//
//
//}

//
//public class Main {
//
//  public static void main(String[] args) {
//
//    Scanner scan = new Scanner(System.in);
//    String s = scan.nextLine();
//    try{
//    StringTokenizer st = new StringTokenizer(s);
//    int ayush=st.countTokens();
//    System.out.println(ayush);
//    for (int i=0;i<= ayush;i++){
//      System.out.println(st.nextToken());
//    }
//    }
//    catch (Exception e){
//      System.out.println(e);
//    }

//
//public class Main {
//  public static void main(String[] args) {
//    Scanner scan=new Scanner(System.in);
//    String s=scan.nextLine();
//
//
//    String [] a=s.trim().split("[ !,?._'@]+");
//    System.out.println(a.length);
//    for (int i=0;i<a.length;i++){
//      System.out.println(a[i]);
//    }
//  }
//}

//
//public class Main {
//  public static void main(String[] args) {
//    Scanner scan=new Scanner(System.in);
//    String  a= scan.next();
//    String b= scan.next();
//    String c= scan.next();
//    String d= scan.next();
//    String ip=a+b+c+d;
//    if (a.length()<4||(b.length()<4||(c.length()<4||(d.length()<4||){
//      System.out.println("false");
//    }
//  }
//}
//
//    StringBuffer  sb = new StringBuffer("ayush");
//    System.out.println(sb.reverse());

import java.lang.reflect.Array;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//class geta extends alian {
//      //  alian ayush=new alian();
//
//    }
//
//public class Main {
//  public static void main(String[] args) {
//geta arpit=new geta();
//      arpit.setId(123);
//  }}
//
//
//  }
//}

//}
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                if (i==1||i==5||i==9||j==1){
//                    System.out.print("*");
//                }
//            }
//            System.out.println( );
//        }}}
//
//public class Main {
//    public static void main(String[] args) {
//        for (int i=1;i<=5;i++){
//            for (int j=4;j>=i;j--){
//                System.out.print(" ");
//            }
//            for (int k=1;k<=2*i-1;k++){
//                if (k==1||k==2*i-1||i==5){
//                System.out.print("*");
//            }
//                else {
//                    System.out.print(" ");
//                }
//
//        }
//            System.out.println();
//    }
//}}
public class Main {
    public static void main(String[] args) {
//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=8;j++){
//                if (i==1||i==5||j==1||j==8){
//                    System.out.print(" *");
//
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println( );
//        }
//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=8;j++){
//                if (i==5||j==1||j==8){
//                    System.out.print(" *");
//
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println( );
//        }
//        for (int i=1;i<=9;i++){
//            for (int j=1;j<=9;j++){
//                if ((i==1&&j>=5)||(i==9&&j<=5)||i==5||(j==1&&i<=5)||(j==9&&i>=5)||j==5){
//                    System.out.print("*");
//
//                }
//                else {
//                    System.out.print(" ");
//                }
//
//    }
//            System.out.println();
//}}}
int i=10;
String s=String.valueOf(i);
  String a ="20";
        System.out.println(a+s);
        String s1="50";
        int a1= Integer.parseInt(String.valueOf(s1));
        System.out.println(a1+i);
    }
}


