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
public class ObatKeluarTableModel extends AbstractTableModel {

    /**
     * * Nama Kolom **
     */
    private final String HEADER[] = {"Tanggal", "Kode", "Nama", "Jumlah", "Harga", "Harga Total"};
    List<ObatKeluar> dataObat = new ArrayList<ObatKeluar>();
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
        ObatKeluar obat = dataObat.get(i);

        switch (i1) {
            case 0:
                return obat.getTanggal();
            case 1:
                return obat.getKode();
            case 2:
                return obat.getNama();
            case 3:
                return obat.getJumlah();
            case 4:
                return obat.getHarga();
            case 5:
                return obat.getTotal();
            default:
                return null;
        }
    }

    /**
     * * Memasukkan data awal dari database ke tabel model
     *
     * @param obat **
     */
    public ObatKeluarTableModel(List<ObatKeluar> obat) {
        this.dataObat = obat;
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
    public void deleteObat(int index) {
//        if (con.deleteObatKeluar(dataObat.get(index).getID(), dataObat.get(index).getKode())) {
//            dataObat.remove(index);
//            fireTableRowsDeleted(index, index);
//        } else {
//            JOptionPane.showMessageDialog(null, "Data gagal di hapus", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
//        }
    }

    /**
     * * Mendapatkan data pada tabel model
     *
     * @param index
     * @return  **
     */
    public ObatKeluar getObat(int index) {
        return dataObat.get(index);
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

}
