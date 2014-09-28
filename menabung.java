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
public class menabung {
    Scanner scan = new Scanner(System.in);
    int nabung, baru;
    
    menabung( int temp){
        System.out.print(" Masukan Nominal Uang : ");
        nabung = scan.nextInt();
        if((nabung >= 5000)&&(nabung%1000)==0){
            baru = temp + nabung;
        }else{
            System.out.println(" Error \n Minimal Rp.5000 / Harus Kelipatan Rp.1000");
            input A = new input();
            baru = A.saldo;
        }
    }
    int hasil_tabung(){
        return baru;
    }
    
}
