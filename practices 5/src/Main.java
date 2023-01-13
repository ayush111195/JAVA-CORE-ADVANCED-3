import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                                     //question no-1---


        for (int n=4;n>0;n--) {
            for (int m = 0; m < n; m++) {
                System.out.print("*");}
                System.out.print("\n");}
//
//
//
//        for (int h = 1;h<5;h++){
//            System.out.print(h+".");
//        System.out.println("ayush");}

                                  //question  on no-2-----------

        Scanner ayush =new Scanner(System.in);
//        System.out.println("enter the no-");
//        int a1= ayush.nextInt();                          //(with out using loop)
//        System.out.println(a1 * (a1 + 1));
//

        int sum=0;
        int b1=4;
        for (int i=0;i<b1;i++){                              //(for loop se)
           sum=sum+(2*i);}
            System.out.println("sum=");
            System.out.println(sum);



//    System.out.println("enter the no-");
//    int sum1=0;
//     int c1 = ayush.nextInt();                                  //(while loop se)
//     int i1=0;
//      while (i1<c1)
//    {
//    sum1=sum1+(2*i1);
//         i1++;}
//    System.out.println(sum1);

                                            //question no 3-----


//        System.out.println("enter the no-");
//        int t1= ayush.nextInt();
//        for (int i3=1;i3<=10;i3++){
//        int t2 =t1*i3;
//        System.out.println(t2);}

                                         //question no----4


//        System.out.println("enter your no--");
//        int t3= ayush.nextInt();
//        for (int i4=10;i4>=1;i4--){
//            int i3 =t3*i4;
//            System.out.println(i3);
//        }

                                        //or
        System.out.println("enter your no--");
        int t5= ayush.nextInt();
        for (int i4=10;i4>=1;i4--){
            int i3 =t5*i4;
            System.out.format("%d*%d=%d\n",t5,i4,t5*i4);}


                                   //question no-5---

        System.out.println("enter the no-");
        int b5= ayush.nextInt();
        for (int c5 =0;c5<b5;c5++)
        System.out.println(b5*(b5-1));


        // first and best way
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter a num :");
//        int n = input.nextInt();
//        int res = 1;
//        for (int i = 1; i <= n; i++){
//            res *= i;
//        }
//        System.out.printf("Factorial of %d is %d", n, res);

// second way

        System.out.println("enter a num :");
        int n = ayush.nextInt();
        int new_val = 0;
        for (int i = 1; i < n; i++){
            if (i == 1){
                new_val = i * (i+1); // 1*2 = 2
            }
            else{
                new_val = new_val * (i+1); // 2 * 3 = 6, 6*4 =
            }
            System.out.println(new_val);
        }
        System.out.printf("Factorial of %d is %d", n, new_val);}}


        /*
        Scanner input = new Scanner(System.in);
        System.out.println("enter a num :");
        int n = input.nextInt();
        int res = 1;
        for (int i = 1; i <= n; i++){
            res *= i;
        }
        System.out.printf("Factorial of %d is %d", n, res);}*/