/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.konversinilai;

import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class Konversinilai {

    public static void main(String[] args) {
         String nim, nama, prodi, matkul;
         int nilai;
         Scanner masukan = new Scanner (System.in);
         System.out.println("Masukan nim = ");
         nim = masukan.nextLine();
         System.out.println("Masukan nama = ");
         nama = masukan.nextLine();
         System.out.println("Matkul = ");
         matkul = masukan.nextLine();
         System.out.println("Masukan nilai angka = ");
         nilai = masukan.nextInt();
         //mengambil jurusan dari NIM
         prodi = nim.substring(3, 5);
         switch (prodi){
             case "85-100" -> System.out.println("A");
             case "80-84" -> System.out.println("A-");
             case "75-79" -> System.out.println("B+");
             case "70-74" -> System.out.println("B");
             case "65-69" -> System.out.println("B-");
             case "60-64" -> System.out.println("C+");
             case "55-59" -> System.out.println("C");
             case "50=54" -> System.out.println("C-");
             case "45-49" -> System.out.println("D");
             case "0-44" -> System.out.println("E");
             default -> System.out.println("Masukkkan prodi salah");
         }  
             
                 
    }
}
