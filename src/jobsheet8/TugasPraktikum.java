/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TugasPraktikum {
    public static void main(String [] args){
        //membuat variabel dan scanner
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner (System.in);
        
        while(running) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab[ya/tidak]");
            
            jawab = scan.nextLine();
            
            //cek jawabnya,kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("ya")){
                running = false;
            }
            
            counter++;
        }
          System.out.println("Anda sudah melakukan perulangan sebanyak"+counter+"kali");
          
        }
                
    }
    
    

