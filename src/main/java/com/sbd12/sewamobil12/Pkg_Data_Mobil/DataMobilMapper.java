/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbd12.sewamobil12.Pkg_Data_Mobil;

import com.sbd12.sewamobil.Pkg_Merk_Mobil.MerkMobil;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author resas
 */
public class DataMobilMapper implements RowMapper<DataMobil>{
    @Override
   public DataMobil mapRow(ResultSet rs, int rowNum) throws SQLException {
      DataMobil dataMobil = new DataMobil();
      dataMobil.setNo_pol(rs.getString("no_pol"));
      dataMobil.setId_merk_mobil(rs.getString("id_merk_mobil"));
      dataMobil.setId_owner(rs.getString("id_owner"));
      dataMobil.setNama_mobil(rs.getString("nama_mobil"));
      dataMobil.setNamaow(rs.getString("nama_ow"));
  
      
      
      
      return dataMobil;
   }
    
}
