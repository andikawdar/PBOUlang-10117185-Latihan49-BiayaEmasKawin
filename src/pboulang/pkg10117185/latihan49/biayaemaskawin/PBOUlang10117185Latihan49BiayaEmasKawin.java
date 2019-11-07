/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan49.biayaemaskawin;

/**
 *
 * @author user
 * Nama  : Andhyka Widariyanto
 * NIM   : 10117185
 * Kelas : PBO-Ulang
 * Tugas : Latihan 49 - Biaya Emas Kawin
 */
public class PBOUlang10117185Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Harga emas = new Harga();
        emas.setBerat(15.7);
        emas.setHarga(570000);

        System.out.println("Hendi akan membeli emas kawin sebagai mahar nikahnya");
        System.out.println("dengan total seberat "+emas.getBerat()+" gram. Dan harga 1 gram emas");
        System.out.println("per bulan oktober ini adalah Rp. "+emas.getHarga()+". ");
        System.out.println("Jadi, uang yang harus dikeluarkan Hendi sebesar Rp. "+emas.totalHarga());

    }
    
}
