package com.sbd12.sewamobil12.Pkg_Merk_Mobil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ArieDZ_2
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class MerkMobilMapper implements RowMapper<MerkMobil> {
   @Override
   public MerkMobil mapRow(ResultSet rs, int rowNum) throws SQLException {
      MerkMobil merkMobil = new MerkMobil();
      merkMobil.setId_merk_mobil(rs.getString("id_Merk_mobil"));
      merkMobil.setId_produsen_mobil(rs.getString("id_produsen_mobil"));
      merkMobil.setId_jenis(rs.getString("id_jenis_mobil"));
      merkMobil.setNama_Merk_Mobil(rs.getString("nama_mobil"));
      merkMobil.setNama_produsen_mobil(rs.getString("nama_produsen"));
      merkMobil.setNama_jenis(rs.getString("nama_jenis"));
      
      
      
      return merkMobil;
   }
}