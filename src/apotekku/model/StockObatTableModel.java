/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotekku.model;

import apotekku.DataObatView;
import apotekku.util.DBcon;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Adhyaksa57
 */
public class StockObatTableModel extends AbstractTableModel{
    
    /*** Nama Kolom ***/
    private final String HEADER[]={"No","Kode","Nama","Stock"};
    List<Obat> dataObat=new ArrayList<Obat>();
    DBcon con = new DBcon();
    
    @Override
    public int getRowCount() {
        return dataObat.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Obat obat=dataObat.get(i);
        
        switch(i1){
            case 0: return i+1;
            case 2: return obat.getNama();
            case 1: return obat.getKode();
            case 3: return obat.getStock();
            default: return null;
        }
    }
 
      
    /*** Memasukkan data awal dari database ke tabel model
     * @param obat ***/
    public StockObatTableModel(List<Obat> obat){
        this.dataObat=obat;
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
   
    /*** Mendapatkan data pada tabel model
     * @param index
     * @return  ***/
    public Obat getObat(int index){
        return dataObat.get(index);
    }
    
    /*** Mendapatkan nama kolom
     * @param column
     * @return  ***/
    @Override
    public String getColumnName(int column){
        return HEADER[column];
    }
    
}
