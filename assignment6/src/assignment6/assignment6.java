package assignment6;

import java.util.*;

public class assignment6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scane = new Scanner(System.in);
        
       

        System.out.println("how many number do you whant?");
        int x = scan.nextInt();
        System.out.println("type in " + x + " amount of numbers in one line with a space between every number.");
        String numbers = scane.nextLine();
        String number[] = numbers.split(" ");
        int numberlength = number.length;
        int i = 0;
        double value;
        double sum = 0;
        double ave = 0;
        while (x > i && i >= 0) {
            value = Double.parseDouble(number[i]);
            sum = sum + value;
            ++i;
        }
        ave = sum / x;
        System.out.println("the sum is: " + sum);
        System.out.println("the average is: " + ave);
        Arrays.sort(number);
        System.out.println("smallest number " + number[0]);
        System.out.println("Biggest number " + number[x - 1]);
        System.out.println("second smallest number " + number[1]);
        System.out.println("second Biggset number " + number[x - 2]);

        int p = 0;
        int e = 0;
        System.out.println("chech if a number exist in the double");
        double y = scan.nextDouble();
        while (numberlength > p) {
            if (Double.parseDouble(number[p])== y) { //number is an string but into a double
                ++e;
            }
            ++p;
        }
        if (e > 0) {
            System.out.println("you have "+y+" "+e+" times in the list of numbers");
        }else{
            System.out.println("dosent exist in the list of numbers");
        }
        //-----------
        /*
        int array[] = {2, 4, 8, 10, 1, 3, 5, 7, 9,};
        int arrayL = array.length;
        int a = -1;
        int b = 0;
        while (arrayL > b) {
            System.out.println(array[arrayL + a]);
            --a;
            ++b;
        }
         */
    }
}
