/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotekku.model;

import apotekku.util.DBcon;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Adhyaksa57
 */
public class OrderDetailTableModel extends AbstractTableModel {

    /**
     * * Nama Kolom **
     */
    private final String HEADER[] = {"Kode", "Nama", "Jumlah Barang", "Harga", "Total"};
    List<OrderDetail> dataOrder = new ArrayList<OrderDetail>();
    DBcon con = new DBcon();

    @Override
    public int getRowCount() {
        return dataOrder.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        OrderDetail order = dataOrder.get(i);

        switch (i1) {
            case 0:
                return order.getKode();
            case 1:
                return order.getNama();
            case 2:
                return order.getJumlah();
            case 3:
                return order.getHarga_jual();
            case 4:
                return order.getTotal();
            default:
                return null;
        }
    }

    /**
     * * Memasukkan data awal dari database ke tabel model
     *
     * @param order **
     */
    public OrderDetailTableModel(List<OrderDetail> order) {
        this.dataOrder = order;
    }

    /**
     * * Menambahkan sebuah data ke tabel model  **
     */
//    public void saveMahasiswa(Mahasiswa mahasiswa){
//        mahasiswas.add(mahasiswa);
//        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
//    }
    /**
     * * Melakukan perubahan data yang ada pada tabel model **
     */
//    public void updateMahasiswa(int index, Mahasiswa mahasiswa){
//        mahasiswas.set(index, mahasiswa);
//        fireTableRowsUpdated(index, index);
//    }
    /**
     * * Menghapus data pada tabel model
     *
     * @param index **
     */
    public void deleteOrder(int index) {
        dataOrder.remove(index);
        fireTableRowsDeleted(index, index);
    }

    /**
     * * Mendapatkan data pada tabel model
     *
     * @param index
     * @return  **
     */
    public OrderDetail getOrder(int index) {
        return dataOrder.get(index);
    }

    /**
     * * Mendapatkan nama kolom
     *
     * @param column
     * @return  **
     */
    @Override
    public String getColumnName(int column) {
        return HEADER[column];
    }

    public int getTotalHarga() {
        int total = 0;
        for (int i = 0; i < dataOrder.size(); i++) {
            total += dataOrder.get(i).getTotal();
        }
        return total;
    }

    public int getOrderByID(int id) {
        for (int i = 0; i < dataOrder.size(); i++) {
            if (id == dataOrder.get(i).getID_OBAT()) {
                return i;
            }
        }
        return -1;
    }
}
