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
         
    }
}
