/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotekku.model;

/**
 *
 * @author Adhyaksa57
 */
public class ObatMasuk extends Obat{

    public ObatMasuk() {
    }
    
    private String tanggal;
    private int jumlah;
    private String input_oleh;
    private String ket;

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getInput_oleh() {
        return input_oleh;
    }

    public void setInput_oleh(String input_oleh) {
        this.input_oleh = input_oleh;
    }
    
    
    
    
}
