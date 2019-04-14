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
public class OrderTableModel extends AbstractTableModel{
    
    /*** Nama Kolom ***/
    private final String HEADER[]={"Tanggal","No Invoice","Jumlah Barang","Total Harga"};
    List<Order> dataOrder=new ArrayList<Order>();
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
        Order order=dataOrder.get(i);
        
        switch(i1){
            case 0: return order.getTanggal();
            case 1: return order.getInvoice();
            case 2: return order.getJumlah_barang();
            case 3: return order.getTotal_harga_jual();
            default: return null;
        }
    }
 
      
    /*** Memasukkan data awal dari database ke tabel model
     * @param order ***/
    public OrderTableModel(List<Order> order){
        this.dataOrder=order;
    }
    
    /*** Menambahkan sebuah data ke tabel model  ***/
//    public void saveMahasiswa(Mahasiswa mahasiswa){
//        mahasiswas.add(mahasiswa);
//        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
//    }
    
    /*** Melakukan perubahan data yang ada pada tabel model ***/
//    public void updateMahasiswa(int index, Mahasiswa mahasiswa){
//        mahasiswas.set(index, mahasiswa);
//        fireTableRowsUpdated(index, index);
//    }
    
    /*** Menghapus data pada tabel model
     * @param index ***/
    public void deleteObat(int index){
//        if(con.deleteObatMasuk(dataOrder.get(index).getID(), dataOrder.get(index).getKode())){
//            dataOrder.remove(index);
//            fireTableRowsDeleted(index, index);
//        }else{
//            JOptionPane.showMessageDialog(null, "Data gagal di hapus","Peringatan",JOptionPane.INFORMATION_MESSAGE);
//        }
    }
    
    /*** Mendapatkan data pada tabel model
     * @param index
     * @return  ***/
    public Order getOrder(int index){
        return dataOrder.get(index);
    }
    
    /*** Mendapatkan nama kolom
     * @param column
     * @return  ***/
    @Override
    public String getColumnName(int column){
        return HEADER[column];
    }
    
}
