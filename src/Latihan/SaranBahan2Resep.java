/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Aby
 */
public class SaranBahan2Resep {
    public static void main(String[] args) {
        String identitas = "Aby Sucahyo / XRPL 5 / 01";
        System.out.println("Identitas : " + identitas );
        
         System.out.println("\nSaran Resep dari Bahan Milik Anda\n");
         
         Scanner scanner = new Scanner (System.in);
         
         System.out.println("Bahan Pertama: ");
         System.out.println("1.Pisang");
         System.out.println("2.Telur");
         System.out.println("Masukkan no pilihan Anda: ");
         int bahan1 = scanner.nextInt();
         
         if(bahan1 == 1 || bahan1 == 2)
         {
             System.out.println("Bahan Kedua: ");
             if(bahan1 == 1) {
                 System.out.println("1. Susu");
                 System.out.println("2. Minyak Goreng");
                 System.out.println("3. Tidak Ada");
             }else{
                 System.out.println("1. Susu");
                 System.out.println("2. Roti");
                 System.err.println("3. Tidak Ada");
             }
             System.err.println("Masukkan no pilhan Anda ");
             int bahan2 = scanner.nextInt();
             
             
         }else 
             System.out.println("Mohan Maaf, Pilihan tidak ditemukan,"
                     + "Tidak memberikan Saran Resep");
         int bahan2 = scanner.nextInt();
         if(bahan2 >=1 && bahan2 <= 3)
         {
             if(bahan1==1)
                 switch (bahan2)
                 {
                     case 1:System.out.println(
                     "Anda dapat mebuat milk shake banana "); break;
                     case 2:System.out.println(
                     "Anda dapat membuat pisang goreng "); break;
                     case 3:System.out.println(
                     "Anda dapat membuat pisang rebus "); break;
                 }    
             else 
                 switch(bahan2)
                 {
                     case 1: System.out.println(
                     "Anda dapat membuat telur mata sapi"); break ;
                     case 2: System.out.println(
                     "Anda dapat membuat sandwich telur"); break;
                     case 3: System.out.println(
                     "Anda dapat membuat telur rebus"); 
                 }
         }else
             System.out.println("Mohon Maaf, Pilihan tidak ditemukan, "
             + "tidak dapat memberikan saran resep");
    }
}
