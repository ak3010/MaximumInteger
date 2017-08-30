/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Ayush Kanoria
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws IOException {
       int a;
       int myList[] =new int[1000];
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number of Integer: ");
        int num =  sc.nextInt();
       System.out.print("Enter "+ num + " number of your choice :");
       for(a=0;a<=num-1;a++){
           myList[a]=sc.nextInt();
       }
        //int[] myList = {54, 53, 546, 548};
        String x,y,result="";
        int swap=0;
        int n = myList.length;
        
        for (int i = 0; i < n-1; i++) {
            for (int j=0; j< n-i-1; j++)
            {
                x=Integer.toString(myList[j]);
                y=Integer.toString(myList[j+1]);
                if (x.compareTo(y) <= 0)
                {
                    swap=myList[j];
                    myList[j]=myList[j+1];
                    myList[j+1]=swap;
                }
            }
        }
        
        for (int i = 0; i < myList.length; i++) {
         result+=myList[i];
        }
        
        System.out.println("Largest Number:" + result);
   }
}
