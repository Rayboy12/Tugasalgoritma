/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.percabangan;

import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class PERCABANGAN {

    public static void main(String[] args) {
           Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan Angka =");
        int angka = masukan.nextInt();
        if (angka%2==0) {
            if (angka>10) {
                System.out.println("Bilangan Genap dan"); 
            }
                System.out.println("BIlangan Genap");
        }   else {
            System.out.println("Bilangan Ganjil");
        }
                
        String hasil = angka%2==0? "Bilangan Genap":"Bilangan Ganjil";
        System.out.println(hasil);
                 
               
                
                
                
                
                
        
    
                }     
                
    }
  

    

