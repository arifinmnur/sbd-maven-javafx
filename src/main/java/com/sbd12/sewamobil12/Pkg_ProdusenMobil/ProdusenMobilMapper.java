package com.sbd12.sewamobil12.Pkg_ProdusenMobil;

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

public class ProdusenMobilMapper implements RowMapper<ProdusenMobil> {

    /**
     *
     * @param rs
     * @param rowNum
     * @return
     * @throws SQLException
     */
    @Override
   public ProdusenMobil mapRow(ResultSet rs, int rowNum) throws SQLException {
      ProdusenMobil produsen = new ProdusenMobil();
      produsen.setId_produsen(rs.getString("id_produsen_mobil"));
      produsen.setNama_produsen(rs.getString("nama_produsen"));
      return produsen;
   }
}