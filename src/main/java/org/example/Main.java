package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter a high: ");
        double height = scanner.nextDouble();
        System.out.println(area(width, height));
    }

//Firs Method => Havlayan Köpeğimiz
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock<0 || clock>23){
            return false;
        } else if (isBarking && (clock < 8 || clock == 23)) {
            return true;
        }else {
            return false;
        }
    }
//******************************************************************************************

    //Second Method => Yaş Tespiti
   public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if (firstAge >= 13 && firstAge <= 19){
           return true;
       } else if (secondAge >= 13 && secondAge <= 19) {
           return true;
       } else if (thirdAge >= 13 && thirdAge <= 19) {
           return true;
       }else {
           return false;
       }
   }

   //Second Method 2. Alternatif
/*    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge);
    }

    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }*/

    //****************************************************************************

//Third Method => Oyuncu Kedi
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        //upperLimit isSummer true ise 45, false ise 35. Yani yaz ise 45 değil ise 35 derece
        int upperLimit = isSummer ? 45 : 35;

        //25-35 arası oyun oynuyor. Yazın ise 25-45. Ona göre bunu yazacağız.
        return temp >= 25 && temp <= upperLimit;
    }

    //****************************************************************************

    //Fourth Method => Alan Hesaplama
    public static double area(double width, double height) {
        /* Alternatif => Scannersız
        double rectangleArea = width * height;
        if (width < 0 || height < 0){
            return -1;
        }else {
            return rectangleArea;
        }*/
        if (width < 0 || height < 0){
            System.out.println("Width or Height less than zero");
            return -1;
        }
        return width * height;
    }

//***************************************************************************************


    public static double area(double radius) {
        double circleArea = radius*radius*Math.PI;
       if (radius < 0){
           return -1;
       }else {
           return circleArea;
       }
    }
}
