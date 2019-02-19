/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Membuat Program Nilai Mahasiswa
 *  
 */
public class PBO3ULANG10116049Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    private static double quiz,uts,uas,NA;
    private static String index;
    private static String keterangan;
    
    
    public static void main(String[] args) {
        
       Scanner baca = new Scanner(System.in);
       Mahasiswa objMahasiswa = new Mahasiswa();
       
       System.out.print("QUIZ : ");
       quiz = baca.nextDouble();
       System.out.print("UTS  : ");
       uts = baca.nextDouble();
       System.out.print("UAS  : ");
       uas = baca.nextDouble();
       System.out.println("");
       System.out.print("Nilai Akhir : " + objMahasiswa.NA(quiz, uts, uas));
       System.out.println("");
       System.out.println("");
       System.out.println("Index : " + objMahasiswa.aturanIndex(index));
       objMahasiswa.aturanKeterangan(keterangan);
       
      }
    
}
