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
public class tarik {
    Scanner scan = new Scanner(System.in);
    int ambil, hasil;
    
    tarik( int temp){
        System.out.print(" Masukan Nominal Uang : ");
        ambil = scan.nextInt();
        if ((ambil%5000)==0){
           hasil = temp - ambil; 
        }else{
            System.out.println(" Error \n Tarik Tunai Harus Kelipan Rp.5000");
            input A = new input();
            hasil = A.saldo;
        }
    }
    int hasil_tarik(){
        return hasil;
    }
}
