/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan39.nilaiterbesarterkecil;

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
public class nilaiMahasiswa {
    private String petugas;
    private int mhs;
    private int nilai;
    private int max;
    private int min;
    private int mahasiswa[];

    public void set_ptgs(String petugas) {
        this.petugas = petugas;
    }

    public String get_ptgs() {
        return petugas;
    }

    public void set_mhs(int mhs) {
        this.mhs = mhs;
        this.mahasiswa = new int[mhs];
    }

    public int get_mhs() {
        return mhs;
    }

    public void set_nilai(int nilai) {
        this.nilai = nilai;
    }

    public void set_nmhs(int i) {
        this.mahasiswa[i - 1] = nilai;
    }

    public int get_nmhs(int i) {
        return mahasiswa[i - 1];
    }

    public void set_max_min(int max, int min) {
        this.max = mahasiswa[max];
        this.min = mahasiswa[min];
    }

    public void get_max_min(int i) {
        if (mahasiswa[i - 1] > max) {
            max = mahasiswa[i - 1];
        } else if (mahasiswa[i - 1] < min) {
            min = mahasiswa[i - 1];
        }
    }
    
    public int get_max() {
        return max;
    }
    
    public int get_min() {
        return min;
    }
    
}
