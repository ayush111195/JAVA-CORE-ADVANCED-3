import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//   (1.) ******
//        *****
//        ****
//        ***
//        **
//        *
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


//   (2.) *
//        **
//        ***
//        ****
//        *****
//        ******
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//   (3.) *
//        **
//        ***
//        ****
//        *****
//        ******
//        *****
//        ****
//        ***
//        **
//        *

        for (int i1 = 1; i1 <= 6; i1++) {
            for (int j1 = 1; j1 <= i1; j1++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i1 = 1; i1 <= 6; i1++) {
            for (int j1 = 5; j1 >= i1; j1--) {
                System.out.print("*");
            }
            System.out.println();
        }


//       (4.)     *
//               ***
//              *****
//             *******
//            *********
//           ***********
//          *************


        for (int i3 = 1; i3 <= 7; i3++) {
            for (int j3 = 6; j3 >= i3; j3--) {
                System.out.print(" ");
            }
            for (int k3 = 1; k3 <= 2 * i3 - 1; k3++) {
                System.out.print("*");
            }
            System.out.println();
        }

//
//        (5.)
//                *************
//                 ***********
//                  *********
//                   *******
//                    *****
//                     ***
//                      *

        for (int i3 = 1; i3 <= 7; i3++) {
            for (int j3 = 1; j3 < i3; j3++) {
                System.out.print(" ");
            }
            for (int k3 = 13; k3 >= 2 * i3 - 1; k3--) {
                System.out.print("*");
            }
            System.out.println();
        }

//        (6.)        *
//                   * *
//                  * * *
//                 * * * *
//                * * * * *
//               * * * * * *

        for (int i4 = 1; i4 <= 7; i4++) {
            for (int j4 = 6; j4 >= i4; j4--) {
                System.out.print(" ");
            }
            for (int k4 = 1; k4 <= i4; k4++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //or
        for (int i4 = 1; i4 <= 7; i4++) {
            for (int j4 = 6; j4 >= i4; j4--) {
                System.out.print(" ");
            }
            for (int k4 = 1; k4 <= 2 * i4 - 1; k4++) {
                if (k4 % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


//          (7.)         * * * * * * *
//                        * * * * * *
//                         * * * * *
//                          * * * *
//                           * * *
//                            * *
//                             *
        for (int i4 = 1; i4 <= 7; i4++) {
            for (int j4 = 1; j4 < i4; j4++) {
                System.out.print(" ");
            }
            for (int k4 = 7; k4 >= i4; k4--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //or


        for (int i4 = 1; i4 <= 7; i4++) {
            for (int j4 = 1; j4 < i4; j4++) {
                System.out.print(" ");
            }
            for (int k4 = 13; k4 >= 2 * i4 - 1; k4--) {
                if (k4 % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


//          (8.)      *
//                   **
//                  ***
//                 ****
//                *****
//               ******

        for (int i5 = 1; i5 <= 6; i5++) {
            for (int j5 = 5; j5 >= i5; j5--) {
                System.out.print(" ");
            }
            for (int k5 = 1; k5 <= i5; k5++) {
                System.out.print("*");
            }
            System.out.println();
        }


//        (9.)        *
//                  * *
//                * * *
//              * * * *
//            * * * * *
//          * * * * * *

        for (int i5 = 1; i5 <= 6; i5++) {
            for (int j5 = 10; j5 > 2 * i5 - 2; j5--) {
                System.out.print(" ");
            }
            for (int k5 = 1; k5 <= 2 * i5 - 1; k5++) {
                if (k5 % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


//        (10.)          * * * * * *
//                         * * * * *
//                           * * * *
//                             * * *
//                               * *
//                                 *


        for (int i5 = 1; i5 <= 6; i5++) {
            for (int j5 = 1; j5 <= 2 * i5 - 2; j5++) {
                System.out.print(" ");
            }
            for (int k5 = 11; k5 >= 2 * i5 - 1; k5--) {
                if (k5 % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

//               (11.)        *
//                           * *
//                          *   *
//                         *     *
//                        *********

        for (int i6 = 1; i6 <= 5; i6++) {
            for (int j6 = 4; j6 >= i6; j6--) {
                System.out.print(" ");
            }
            for (int k6 = 1; k6 <= 2 * i6 - 1; k6++) {
                if (k6 == 1 || k6 == 2 * i6 - 1 || i6 == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


//                  (12.)                 *
//                                       * *
//                                      *   *
//                                     *     *
//                                    *       *
//                                     *     *
//                                      *   *
//                                       * *
//                                        *

        for (int i6 = 1; i6 <= 5; i6++) {
            for (int j6 = 4; j6 >= i6; j6--) {
                System.out.print(" ");
            }
            for (int k6 = 1; k6 <= 2 * i6 - 1; k6++) {
                if (k6 == 1 || k6 == 2 * i6 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i6 = 1; i6 <= 5; i6++) {
            for (int j6 = 1; j6 < i6; j6++) {
                System.out.print(" ");
            }
            for (int k6 = 1; k6 <= 11 - 2 * i6; k6++) {
                if (k6 == 1 || k6 == 11 - 2 * i6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


//    (13.)          ********
//                   *      *
//                   *      *
//                   *      *
//                   ********


        for (int i7 = 1; i7 <= 5; i7++) {
            for (int k7 = 1; k7 <= 8; k7++) {
                if (i7 == 1 || i7 == 5 || k7 == 1 || k7 == 8) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


//                                *******
//                                *     *
//                                *     *
//                                *******
//                                *     *
//                                *     *
//                                *     *

//        for (int i8 = 1; i8 <= 7; i8++) {
//            for (int k8 = 1; k8 <= 7; k8++) {
//                if (i8==4||k8==7||k8==1||i8==1){
//                    System.out.print("*");}
//
//                else {System.out.print(" ");}}
//            System.out.println();}

//        Write a program that generates a random number and asks the user to
//        guess what the number is. If the user's guess is higher than the random number,
//        the program should display "Too high, try again." If the user's guess is lower than
//        the random number, the program should display "Too low, try again." The program
//        should use a loop that repeats until the user correctly guesses the random number.

        Random arpit=new Random();
        int b= arpit.nextInt();
        System.out.println("the rendom no is-"+b);

       /*Scanner ayush=new Scanner(System.in);
        System.out.println("enter your no-");
        int a= ayush.nextInt();
        for (int i=a;i<b||i>b;i++) {


            if (i > b) {
                System.out.print("no is high");
            } else if (i < b) {
                System.out.print("no is low");
            }
            System.out.println();*/

      //  for (int i =0;)

        }
            }


            }









        

