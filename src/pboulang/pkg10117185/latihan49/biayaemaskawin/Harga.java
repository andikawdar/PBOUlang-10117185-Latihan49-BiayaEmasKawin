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
public class Harga {
    //Atribute
    private double berat;
    private double harga;

    //Function
    public Harga(){} 
    
    public double totalHarga(){
        double total;
            total = getHarga()*getBerat();
        return total;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}
