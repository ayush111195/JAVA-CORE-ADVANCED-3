import java.util.Scanner;

public class

Main {
    public static void main(String[] argg) {


        //question-1
      int sum = 0;
        int a[] = {10, 20, 30, 40, 50};
         for (int i=0;i<a.length;i++){
              sum=sum+a[i];}
              System.out.println(sum);
       // for (int element : a) {
        //    sum = sum + element;
       // }
       // System.out.println(sum);

                           //question-2


        float b[]={12.5f,13.5f,14.5f,15.5f,16.5f};
        float num = 14.6f;
        boolean isanarray=false;
        for (int i1=0;i1<b.length;i1++){
            if (num==b[i1]){
                isanarray=true;
                break;}}
        if (isanarray==true){
            System.out.println("the no is present in the arrary");}
        else {
            System.out.println("the no is not present in the arrary");}

                       //question-3=kise bhi array ke ander value dALNA



       Scanner ayush=new Scanner(System.in);
       System.out.println("enter your no -");
       int t= ayush.nextInt();
       boolean isanarray1=true;
       int y[]=new int[100];
        for (int i3=1;i3<=y.length;i3++)
        {   y[i3-1]=i3;
            if (y[i3-1]==t)
            {isanarray1=false;
                break;}}
        if (isanarray1==false){
            System.out.println("waoooo!!! it's match");}
        else {
                System.out.println( "sorry it's not match");}

        float sum1=0;
        int marks[]={40,50,55,67,78,81,67,94,71,33,99,76};
        for (int i2=0;i2<marks.length;i2++)

        { sum1=sum1+marks[i2];}//(shivam=10rs,shivam=shivam+rahul(shivam=10+10),shivam=shivam+ayush(shivam=20+30))


       System.out.println(sum1/(marks.length));


        int [][] matrix1={ {10,12,13},{14,15,16},{17,18,19}};
        int [][] matrix2={ {11,13,14},{15,16,17},{16,17,18}};
        int [][] result={ {0,0,0},{0,0,0},{0,0,0}};
        for (int i5=0;i5< matrix1.length;i5++){
            for (int j5=0;j5<matrix1[i5].length;j5++){
               // System.out.print(result[i5][j5]+" ");
                result[i5][j5] =matrix1[i5][j5]+matrix2[i5][j5];
                System.out.print(result[i5][j5]+" ");
            }
            System.out.println();
       }
                              //question-4=
                             // arrays ko reversh karna
       int []arr={1,2,3,4,5,6,7};
        int l=arr.length;
        int n=Math.floorDiv(l,2);//(math.floordiv ka use divied karne ke leye kiye jata isse hmesha ek int valaue milte h)
        int temp;//(4/2=2,5/2=2 hi dega .ke baad ke no ko nhi leta)
        for (int i6=0;i6<n;i6++){
            //swap a[i] and a[l-1-i]
            //|4| |3| |tem|-ek temp box genrate karna hota h
            temp=arr[i6];
            arr[i6]=arr[l-i6-1];
            arr[l-i6-1]=temp;}
        for (int i7=0;i7< arr.length;i7++){
       System.out.println(arr[i7]);}


                        //question-5=maximum no find karna array ke andar ka
        int []array3 ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,17,16};
        int max=0;
        for (int i8=0;i8<array3.length;i8++){
            if (array3[i8]>max){
                max=array3[i8];
            }
        }
       System.out.println("the value of maximum element in this arrray="+max);

                             //question-6=minimum no find karna array ke ander ka

        int []array4={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int min=234;
        for (int i9=0;i9<array4.length;i9++){
       if (array4[i9]<min){
           min=array4[i9];
       }}
            System.out.println("the value of minimum element in this array= "+min);


                                  //question no -7==array shorted h ya nhi(shorted=badte kram main h ya nhi)

       
       int []array6={1,3,4,6,7,8,12,4,2,1};//(koi bhi arraytabhi sorted hoga jab wo badte kram main ho)
       boolean ayush5=true;
       for (int i10=0;i10<array6.length-1;i10++){//length -1 isleye kiya kyun ki last wale ko kise se
                                                 // check nhi kiya ja skta
           if (array6[i10]>array6[i10+1]){
                ayush5=false;
           break;}}
       if (ayush5==false){
       System.out.println("array is  not shorted");}
       else{
           System.out.println("array is  shorted");}

                      //odd  no find karna-

        int[] array7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        for (int i11 = 0; i11 < array7.length; i11++) {
            if (array7[i11] % 2 == 1) {
                System.out.println(array7[i11]);
            }
        }
                 //odd no ka sum find karna-

        int[] array8 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int sum3 = 0;
        for (int i12 = 0; i12 < array7.length; i12++) {
            if (array8[i12] % 2 == 1) {
                sum3 = sum3 + array8[i12];
            }}
            System.out.println("the sum of all odd no from the arrays" + sum);

                               //even  no find karna-

        int[] array9 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        for (int i13 = 0; i13 < array9.length; i13++) {
            if (array9[i13] % 2 == 0) {
                System.out.println(array9[i13]);
            }
        }
                           //even no ka sum find karna-

        int[] array10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int sum4 = 0;
        for (int i14 = 0; i14 < array10.length; i14++) {
            if (array10[i14] % 2 == 0) {
                sum4 = sum4 + array10[i14];
            }}
            System.out.println("the sum of all even  no from the arrays" + sum1);

                   //same no ko array pe pta karna-

        int[] array11 = {1, 2, 3, 4,2, 5, 6, 7, 8,3, 9, 10, 11, 12, 13, 14, 15,11, 16, 17, 18, 19,2};
        for (int i15=0;i15<array11.length;i15++){
            for(int j=i15+1;j< array11.length;j++){
                if (array11[i15]==array11[j]){
                System.out.println(array11[i15]);}}
        }

                         // array ke elements ko  short (arrange) karna-
        int[] array12={38,52,9,18,6,62,13};
        int temp1;
        for (int i16=0;i16<array12.length;i16++){
            for(int j=0;j<array12.length-1-i16;j++){
                if (array12[j] >array12[j+1]){
                temp1=array12[j]   ;
                array12[j]=array12[j+1];
                array12[j+1]=temp1;
                }

            }

        }
        for(int i16=0;i16<array12.length;i16++) {
            System.out.println("the series" + array12[i16]);
        }
                                               // array ki string ko short (arrange) karna
        String[]arrays={"ayush","arpit","akash","aman","anmol","omji","suyash"};
        String temp2;
        for (int i17=0;i17<arrays.length;i17++){
            for(int j2=0;j2<arrays.length-1-i17;j2++){
                if (arrays[j2] .compareTo(arrays[j2+1])>0){     // compare to ka use englis ke  word ko compare karne ke leye
                    temp2=arrays[j2]   ;                                //           kiya jata h
                    arrays[j2]=arrays[j2+1];
                    arrays[j2+1]=temp2;
                }
            }}
            for (int i17=0;i17<arrays.length;i17++) {
                System.out.println(arrays[i17]);

            }
                              // array ke elements ko  short (arrange) karne ka dusra tarika-
           int arrays1[]={38,52,9,18,6,62,13};
            int temp3;
            for (int x=0;x< arrays1.length;x++){
                for (int j2=x+1;j2<arrays1.length;j2++){
                    if (arrays1[x]>arrays1[j2]){
                        temp3=arrays1[x];
                        arrays1[x]=arrays1[j2];
                        arrays1[j2]=temp3;
                    }
                }
            }
        for (int x=0;x< arrays1.length;x++){
            System.out.println(arrays1[x]);
        }
                                      // n ki power m find krna

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your no-");
        int numb= sc.nextInt();
        System.out.println("enter the power-");
        int power= sc.nextInt();
        int result1=1;
        for (int i21=1;i21<=power;i21++){
            if (power==0){
                System.out.print( "your answer-1");
            }
            result1=result1*numb;
        }
        System.out.println(result1);


    }}










