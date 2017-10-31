/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbd12.sewamobil12.Pkg_Owner_Mobil;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 *
 * @author resas
 */
public class OwnerMobilTableModel extends AbstractTableModel{
    private List<OwnerMobil> data;
    private String[] nameField={"ID","Nama Owner","No KTP","Nama Owner",
                                "Jenis Kelamin","Alamat Owner","No Telepon"};
    
    public void setData(List<OwnerMobil> data)
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
        
        OwnerMobil kst=data.get(baris);
        switch(kolom)
        {
            case 0: return kst.getId_owner();
            case 1: return kst.getNo_ktp_ow();
            case 2: return kst.getNama_ow();
            case 3: return kst.getJenis_Kelamin();
            case 4: return kst.getAlamat_ow();
            case 5: return kst.getNo_telepon_ow();
            default : return null;
        }
    }
    @Override
    public String getColumnName(int column)
    {
        return nameField[column];
    }
    
}
