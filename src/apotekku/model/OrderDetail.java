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
public class OrderDetail {
    private int ID;
    private int ID_ORDER;
    private int ID_OBAT;
    private int harga_beli;
    private int harga_jual;
    private int jumlah;
    private int total;
    private String kode;
    private String nama;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    

    public OrderDetail() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID_ORDER() {
        return ID_ORDER;
    }

    public void setID_ORDER(int ID_ORDER) {
        this.ID_ORDER = ID_ORDER;
    }

    public int getID_OBAT() {
        return ID_OBAT;
    }

    public void setID_OBAT(int ID_OBAT) {
        this.ID_OBAT = ID_OBAT;
    }

    public int getHarga_beli() {
        return harga_beli;
    }

    public void setHarga_beli(int harga_beli) {
        this.harga_beli = harga_beli;
    }

    public int getHarga_jual() {
        return harga_jual;
    }

    public void setHarga_jual(int harga_jual) {
        this.harga_jual = harga_jual;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
}
