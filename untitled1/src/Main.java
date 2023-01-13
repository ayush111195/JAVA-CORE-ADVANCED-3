import jdk.dynalink.beans.StaticClass;

public class Main {
    static void table(int n ){
        int multi;
        for(int i =0;i<=10;i++){
            multi=n*i;
            System.out.format("%d*%d=%d\n",n,i,multi);
        }

        }



        static void tringle(int m){
            for (int i1=1;i1<=m;i1++){
                for (int j=1;j<=2*i1-1;j++){
                    if (j%2==0){
                        System.out.print(" ");}
                    else{
                        System.out.print("*");
                    }
                }
                System.out.println();
        }}


    static int sum(int s ){
        if (s==1){
            return 1;
        }
        else {
            return s+sum(s-1);
        }
    }

    static void tringle2 (int k){
        for (int i1=1;i1<=k;i1++){
            for (int j=k+3;j>=2*i1-1;j--){
                if (j%2==0){
                    System.out.print(" ");}
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static int fib(int d){
       // the series =0,1,1,2,3,5,8,13,21,34
        if (d==1){
            return 0;
        } else if (d==2) {
            return 1;}
        else {
            return fib(d-1)+fib (d-2);
        }
    }

    static int avrage  (int...arrays){
        int sum=0;
        for (int i3=0;i3< arrays.length;i3++) {
            sum=sum+arrays[i3];}
        int avrage=sum/ arrays.length;
        return avrage;
    }


    public static void main(String[] args){

table(2);


tringle(4);
tringle(6);

sum(6);
        System.out.println(sum(6));


tringle2(7);
tringle2(4);


int result =fib(5);
        System.out.println(result);

        System.out.println(avrage(100,200,300,400,500,600,700,800,900));
//       for (int i1=1;i1<=4;i1++){
//           for (int j=1;j<=2*i1-1;j++){
//               if (j%2==0){
//                   System.out.print(" ");}
//                   else{
//                   System.out.print("*");
//                   }
//           }
//           System.out.println();
//       }




//        for (int i1=1;i1<=4;i1++){
//            for (int j=7;j>=2*i1-1;j--){
//                if (j%2==0){
//                    System.out.print(" ");}
//                    else{
//                    System.out.print("*");
//                    }
//                }
//            System.out.println();
//            }
        }
    }
