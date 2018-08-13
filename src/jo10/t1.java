/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jo10;
import java.util.Scanner;

public class t1 {
    public static void main (String[]args){
        String[] nama ={"Deanne", "Victoria"," Erna", "Nathalie", "Pamela"," Armand","Omar", "Alvaro", "Ben", "Danny"};
        Scanner yudhis=new Scanner (System.in);
        System.out.println("masukan nama :");
        String y = yudhis.nextLine();
       String x = "";
        for (int i = 0;i<nama.length ;i++){
            if (y.equals(nama[i])){
                x = nama[i];}
            
            }if (x.equals(y)){       
             System.out.println("nama " + x);}
            else{
                System.out.println("tidak ditemukan");}
      
        }

    }
    

