/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;

import java.util.Scanner;
/**
 *
 * @author Tanto
 */
public class Bank {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // TODO12345 code application logic heresaya
       input A = new input();
       int x=0;
       
       do{
            System.out.print(" Masukan Password : ");
            int pass = scan.nextInt();
            if(pass == 12345){
                A.masukan();
            } else {
                System.out.println(" password Salah");
                x++;
            }  
       }while(x<3);{
        System.out.println(" Gagal \n Input Password Sudah Lebih Kali");
    }
       
    }
}
