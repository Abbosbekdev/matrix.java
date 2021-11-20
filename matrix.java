package com.company;

import java.util.Random;
import java.util.Scanner;

public class Matritsa {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Random tasodif = new Random();
        int [][] a = new int[20][20];
        int m = scanf.nextInt();
        int n = scanf.nextInt();

        // 1 - masala

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                a[i][j] = 10*j;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }

        // 2- masala

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                a[i][j] = i*5;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }

        // 3 - masala

//        int k;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//              k = scanf.nextInt();
//              a[i][j] = k;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }

        // 4 - masala

//        int b[] = new int[20];
//        for (int i =0;i<n;i++){
//              b[i] = scanf.nextInt();
//
//            }
//        for (int i =0;i<n;i++){
//            for (int j =0;j<m;j++){
//                a[i][j] = b[i];
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }

        // 5 - masala

//        int b [] = new int[20];
//        int d = scanf.nextInt();
//        for (int i = 0; i < m; i++) {
//            b[i] = scanf.nextInt();
//        }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][0] = b[i];
//                a[i][j+1] = a[i][j]+d;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }

        // 6 - masala

//        int b [] = new int[20];
//        int q = scanf.nextInt();
//        for (int i = 0; i < m; i++) {
//            b[i] = scanf.nextInt();
//        }
//        for (int i = 0;i<m;i++){
//            for (int j = 0; j < n; j++) {
//                a[i][0] = b[i];
//                a[i][j+1] = a[i][j]*q;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }

        // 7 - masala

//        int k = scanf.nextInt();
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println("\n");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (k == i){
//                    System.out.print(a[i][j]+"\t");
//                }
//            }
//        }

        // 8 - masala

//        int k = scanf.nextInt();
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println("\n");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (k == j){
//                    System.out.println("\t\t"+a[i][j]);
//                }
//            }
//        }

        // 9 - masala

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println("\n");
//        for (int i = 0; i < m; i+=2) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }

        // 10 - masala

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println("\n");
//        for (int i = 0; i < m; i++) {
//            for (int j = 1; j < n; j+=2) {
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }

        // 11 - masala

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println("\n");
//        for (int i = 0; i < m; i++) {
//            if (i%2!=0)
//            for (int j = n-1; j >=0; j--) {
//                System.out.print(a[i][j]+"\t");
//            }
//            else
//                for (int j = 0; j < n; j++) {
//                    System.out.print(a[i][j]+"\t");
//                }
//            System.out.println();
//        }

        // 12 - masala

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println("\n");
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (j%2==0){
//                    a[i][j] = 0;
//                }
//            }
//        }

        // 13 - masala

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < m; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println("\n");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < m; j++) {
//                if (i>=j){
//                System.out.print(a[i][j]+"\t");
//                }
//            }
//            System.out.println();
//        }


        // 14 - masala

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println("\n");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i<=j)
//                    System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
        // negadir teskari holatda chiqyabdi

        // 15 - masala


        // 16 - masala


        // 17 - masala

//    int k = scanf.nextInt(),yigindi = 0,kopaytma =1;
//        for (int i = 0; i < m; i++) {
//        for (int j = 0; j < n; j++) {
//            a[i][j] = tasodif.nextInt(8)+1;
//            System.out.print(a[i][j]+"\t");
//        }
//        System.out.println();
//    }
//        for (int i = 0; i < m; i++) {
//        for (int j = 0; j < n; j++) {
//            if (k == i){
//                yigindi+=a[k][j];
//                kopaytma*= a[k][j];
//            }
//        }
//    }
//        System.out.println("yigindisi = " + yigindi);
//        System.out.println("kopaytmasi = "+kopaytma);

        // 18 - masala

//        int k =scanf.nextInt(),yigindi = 0,kopaytma =1;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (k==j){
//                    yigindi+=a[i][k];
//                    kopaytma*=a[i][k];
//                }
//            }
//        }
//        System.out.println("yigindi = "+yigindi);
//        System.out.println("kopaytma = "+kopaytma);


        // 19 - masala

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < m; i++) {
//            int yigindi =0;
//            for (int j = 0; j < n; j++) {
//                yigindi += a[i][j];
//            }
//            System.out.println(i+1+"- satr yigindisi = "+yigindi);
//        }

        // 20 - masala

        // barcha  ustunlari kopaytmasi

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        for (int j = 0; j < m; j++) {
//            int kopaytma = 1;
//            for (int i = 0; i < n; i++) {
//                kopaytma *=a[i][j];
//            }
//            System.out.println(j+1+"-ustun kopaytmasi = "+kopaytma);
//        }

        // 21 - masala

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i < m; i+=2) {
//            int s =0;
//            for (int j = 0; j < n; j++) {
//                s+=a[i][j];
//            }
//            System.out.println(i+"- satr o'rtachasi = "+s/m);
//        }

        // 22 - masala

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < m; i+=2) {
//            int s=0;
//            for (int j = 0; j < n; j++) {
//                s+=a[i][j];
//            }
//            System.out.println(i+"- satr yigindisi = "+s);
//        }

        // 23 - masala

        // har bir satr eng katta elementi

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < m; i++) {
//            int max = a[i][0];
//            for (int j = 0; j < n; j++) {
//                if (max < a[i][j]) max = a[i][j];
//            }
//            System.out.println(i+1+"- satr max elementi : "+max);
//        }

        // 24 - masala

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        for (int j = 0; j<m; j++) {
//            int max = a[0][j];
//            for (int i=0;i<n;i++){
//                if (max < a[i][j])max = a[i][j];
//            }
//            System.out.println(j+1+"- ustun max elementi : "+max);
//        }

        // 25 - masala

        //elementlari yigindisi eng katta bolgan satr

//        int massiv [] = new int[20];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < m; i++) {
//            massiv[i] = 0;
//            for (int j =0;j<n;j++){
//                massiv[i]+=a[i][j];
//            }
//            System.out.println(i+1+" satr yigindisi : "+massiv[i]);
//        }
//        int max;
//        max = massiv[0];
//        for (int i = 0; i < m; i++) {
//            if (max < massiv[i]) max = massiv[i];
//        }
//        System.out.println("max yig'indi : "+max);

        // 26 - masala

        // ustun elemetrlari orasida eng kichik kopaytmaga egasi

//        for (int i = 0; i <m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        int massiv [] = new int[20];
//        for (int j = 0; j < m; j++) {
//            massiv[j] = 1;
//            for (int i = 0; i < n; i++) {
//                massiv[j] *=a[i][j];
//            }
//            System.out.println(j+1+" ustun kopaytmasi : "+massiv[j]);
//        }
//        int min = massiv[0];
//        for (int j = 0; j < m; j++) {
//            if (min > massiv[j]) min = massiv[j];
//        }
//        System.out.println("min kopaytma : "+min);

        // 27 - masala

        // yigindisi eng kichik bolgan satrning eng katta elementi

//        int massiv [] = new int[20];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < m; i++) {
//            massiv[i] = 0;
//            for (int j =0;j<n;j++){
//                massiv[i]+=a[i][j];
//            }
//            System.out.println(i+1+" satr yigindisi : "+massiv[i]);
//        }
//        int min;
//        int k = 0;
//        min = massiv[0];
//        for (int i = 0; i < m; i++) {
//            if (min > massiv[i]) {
//                min = massiv[i];
//                k = i;
//            }
//        }
//        System.out.println("min yig'indi : "+min+"\nindeksi : "+k);
//        int max = a[k][0];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (max < a[k][j])max = a[k][j];
//            }
//        }
//        System.out.println("eng katta elementi : "+max);


        // 28 - masala

        // yigindisi max bolgan ustunning eng kichik elementi

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        int massiv [] = new int[20];
//        for (int j = 0; j < m; j++) {
//            massiv[j] = 0;
//            for (int i = 0; i < n; i++) {
//                massiv[j]+=a[i][j];
//            }
//            System.out.println(j+1+" ustun yig'indisi : "+massiv[j]);
//        }
//        int max = massiv[0];
//        int k = 0;
//        for (int j = 0; j < m; j++) {
//            if (max < massiv[j]) {
//                max= massiv[j];
//                k = j;
//            }
//        }
//        System.out.println("max yigindi : "+max+"\nindeksi : "+k);
//        int min = a[0][k];
//        for (int j = 0; j < m; j++) {
//            for (int i = 0; i < n; i++) {
//                if (min > a[i][k]) min = a[i][k];
//            }
//        }
//        System.out.println("min elementi : "+min);

        // 29 - masala

//        int s,k=0;
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < m; i++) {
//            s = 0;
//            for (int j = 0; j < n; j++) {
//                s+=a[i][j];
//                if (a[i][j] < s/n){
//                    k = j;
//                }
//            }
//            System.out.println(i+1+" ustun yigindisi : "+s+"\nsoni : "+k);
//        }

        // 30 - masala

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        int s,max,k;
//        for (int j = 0; j < m; j++) {
//            s = 0; max = a[0][0];k=0;
//            for (int i = 0; i < n; i++) {
//                s+=a[i][j];
//                if (max >s)k++;
//            }
//            System.out.println("o'rta arifmerik : " +s+"\tmax : "+k);
//        }

        // 31 - masala


//        int yigindi = 0;
//        int [][] b = new int[20][20];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                yigindi+=a[i][j];
//            }
//        }
//        System.out.println("yigindi : "+yigindi*1./(m*n));
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                b[i][j] =Math.abs((yigindi/(m*n))-a[i][j]);
//            }
//        }
//        int max = b[0][0],min = a[0][0];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (max < b[i][j])
//                    max = b[i][j];
//                    min = a[i][j];
//            }
//        }
//        System.out.println(max+"\n"+min);

        // 33 - masala

//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = tasodif.nextInt(8)+1;
//                System.out.print(a[i][j]+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (a[i][j]%2==0) {
//                    System.out.print(a[i][j]+"\t");
//                }
//            }
//        }

    }

}

