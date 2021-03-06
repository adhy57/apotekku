/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotekku.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adhyaksa57
 */
public class Order {
    private int ID;
    private String invoice;
    private String tanggal;
    private int jumlah_barang;
    private int total_harga_beli;
    private int total_harga_jual;
    private int total_bayar;
    private List<OrderDetail> orderDetail = new ArrayList<>();

    public List<OrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetail> orderDetail) {
        this.orderDetail = orderDetail;
    }

    public int getTotal_bayar() {
        return total_bayar;
    }

    public void setTotal_bayar(int total_bayar) {
        this.total_bayar = total_bayar;
    }

    public Order() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getJumlah_barang() {
        System.out.println("orderDetail.size() : "+orderDetail.size());
        if (orderDetail.size()>0) {
            return orderDetail.size();
        }
        return jumlah_barang;
    }

    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    public int getTotal_harga_beli() {
        return total_harga_beli;
    }

    public void setTotal_harga_beli(int total_harga_beli) {
        this.total_harga_beli = total_harga_beli;
    }

    public int getTotal_harga_jual() {
        return total_harga_jual;
    }

    public void setTotal_harga_jual(int total_harga_jual) {
        this.total_harga_jual = total_harga_jual;
    }
    
    
}
