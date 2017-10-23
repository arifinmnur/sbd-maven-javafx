package com.sbd12.sewamobil12.Pkg_MerkMobil;




import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ArieDZ
 */
public class MerkMobilTableModel extends AbstractTableModel{
    private List<MerkMobil> data;
    private String[] nameField={"ID Merk","Produsen","Jenis","Nama"};
    
    public void setData(List<MerkMobil> data)
    {
        this.data=data;
    }
    
    @Override
    public int getRowCount() {
      return data.size();
    }

    @Override
    public int getColumnCount() {
      return nameField.length; }

    @Override
    public Object getValueAt(int baris, int kolom) {
        
        MerkMobil kst=data.get(baris);
        switch(kolom)
        {
            case 0: return kst.getId_merk_mobil();
            case 1: return kst.getNama_produsen_mobil();
            case 2: return kst.getNama_jenis();
            case 3: return kst.getNama_Merk_Mobil();
            default : return null;
        }
    }
    @Override
    public String getColumnName(int column)
    {
        return nameField[column];
    }
    
    
}
