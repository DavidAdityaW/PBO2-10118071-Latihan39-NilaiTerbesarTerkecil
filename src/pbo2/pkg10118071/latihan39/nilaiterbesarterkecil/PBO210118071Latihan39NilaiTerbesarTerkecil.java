/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan39.nilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menentukkan
 *                     nilai terbesar dan terkecil
 * 
 */
public class PBO210118071Latihan39NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        nilaiMahasiswa nilaimhs = new nilaiMahasiswa();

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan nama petugas \t\t: ");
        nilaimhs.set_ptgs(input.next());
        System.out.print("Masukkan banyaknya mahasiswa \t: ");
        nilaimhs.set_mhs(input.nextInt());

        for (int i = 1; i <= nilaimhs.get_mhs(); i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + i + " = ");
            nilaimhs.set_nilai(input.nextInt());
            nilaimhs.set_nmhs(i);
        }

        System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        nilaimhs.set_max_min(0, 0);

        for (int i = 1; i <= nilaimhs.get_mhs(); i++) {
            System.out.println("Nilai Mahasiswa Ke-" + i + " = " + nilaimhs.get_nmhs(i));
            nilaimhs.get_max_min(i);
        }
        
        System.out.println("");
        System.out.println("Nilai Terbesar adalah " + nilaimhs.get_max());
        System.out.println("Nilai Terkecil adalah " + nilaimhs.get_min());
        System.out.println("\nPetugas : " + nilaimhs.get_ptgs());
    }
    
}
