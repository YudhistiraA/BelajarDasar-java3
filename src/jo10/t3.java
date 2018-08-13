/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jo10;


public class t3 {
    public static void main(String[]args){
        int[][] arrayMulti = new int [2][3];
         arrayMulti [0][0] = 1;
         arrayMulti [0][1] = 1;
         arrayMulti [0][2] = 1;
         
         arrayMulti [1][0] = 1;
         arrayMulti [0][1] = 1;
         arrayMulti [1][2] = 1;
    
    for(int x = 0 ; x <= 1; x++){
        for(int y = 0 ;y <= 2; y++){
            System.out.format("arrayMulti{%d}{$6}=%d %n",x,y,arrayMulti[x][y]);
        }
    }
}
}