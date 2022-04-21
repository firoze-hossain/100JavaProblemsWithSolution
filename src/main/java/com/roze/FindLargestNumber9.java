package com.roze;

import java.util.Scanner;

/**
 *
 * @author firoze
 * Find Largest number
 */
public class FindLargestNumber9 {
    public static void main(String[] args) {
        int firstNum,secondNum,thirdNum;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number: ");
        firstNum=sc.nextInt();
        secondNum=sc.nextInt();
        thirdNum=sc.nextInt();
        if(firstNum>secondNum && firstNum>thirdNum){
            System.out.println("The First Number is the Largest Number");
        }
        else if(secondNum>firstNum && secondNum>thirdNum){
         System.out.println("The Second Number is the Largest Number");
        }
        
        else if(thirdNum>firstNum && thirdNum>secondNum){
        System.out.println("The Third Number is the Largest Number");
        }
        else{
            System.out.println("Entered numbers are not distinct!!");
        }
        
    }

}
