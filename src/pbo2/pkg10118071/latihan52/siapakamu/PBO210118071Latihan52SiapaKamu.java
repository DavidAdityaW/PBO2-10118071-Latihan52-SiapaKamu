/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan52.siapakamu;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menentukan
 *                     siapa kamu
 * 
 */
public class PBO210118071Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Manusia mahasiswa;
        Manusia dosen;
        
        Dosen d = new Dosen();
        Mahasiswa m = new Mahasiswa();
        
        dosen = new Dosen();
        d.setNip("41227829930");
        System.out.println("NIP DOSEN : " + d.getNip());
        dosen.siapaKamu();
        d.mengajarApa();
        
        mahasiswa = new Mahasiswa();
        m.setNim("10110269");
        System.out.println("\nNIM MAHASISWA : " + m.getNim());
        mahasiswa.siapaKamu();
        m.kelasApa();
    }
    
}
