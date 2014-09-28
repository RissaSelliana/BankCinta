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
public class input {
    
    Scanner scan = new Scanner (System.in);
    int pil,saldo = 50000;
    
    void masukan(){
        System.out.println(" Saldo pertama = "+saldo);
        do {
        System.out.println("\n1. Menabung");
        System.out.println("2. Tarik Tunai");
        System.out.println("3. Cek Saldo");
        System.out.println("4. Exit");
        System.out.print(" Masukan Pilihan : ");
        pil = scan.nextInt();
        switch(pil){
            case 1 : { 
                menabung A = new menabung(saldo);
                saldo = A.hasil_tabung();
            } break;
            case 2 : { 
                tarik A = new tarik(saldo);
                if (saldo <= 20000){ System.out.println(" Saldo Anda Tidak Cukup :"
                            + " Saldo Anda = "+saldo);
                } else { saldo = A.hasil_tarik(); }
            } break;
            case 3 : {
                cek A = new cek();
                A.cek_saldo(saldo);
            }break;
            case 4 :{System.exit(pil);}break;
            default : System.out.println(" Pilihan Tidak Ada");
        }
        
        } while(pil != 4);
        System.exit(pil);
    }
}
