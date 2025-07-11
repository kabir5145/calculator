package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class add_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number :");
        int input = sc.nextInt();
      while (input>=10){
         int i = input/10;
         input = input%10;
         input = i+input;
      }
          ;
        System.out.println(input);
    }
}

