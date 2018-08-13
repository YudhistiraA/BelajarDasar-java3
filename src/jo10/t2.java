/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jo10;
import java.util.Scanner;
public class t2 {
    public static void main (String[]args){
        int[] bil = new int[6];
        
        Scanner yudhis = new Scanner(System.in);
      
        for (int i = 0 ;i<6; i++){
               System.out.print("masukan bilangan ke-  "+ (i+1)+ " :");
                   bil[i] = yudhis.nextInt();}
         System.out.println("bilanga genap = ");
        for (int i = 0 ;i<6; i++){
            if (bil[i]%2==0){
             System.out.print( bil[i] + "  ");
             
            }}System.out.println(" ");
         System.out.println("bilangan ganjil = " );
        for (int i = 0 ;i<6; i++){
            if (bil[i]%2==1){
             
                System.out.print(bil[i] + "  ");
            }} 
       
        }}
    

    

             




