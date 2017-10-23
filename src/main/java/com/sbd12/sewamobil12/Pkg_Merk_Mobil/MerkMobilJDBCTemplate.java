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

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Repository
@Component("myService")
public class MerkMobilJDBCTemplate implements MerkMobilDAO {
   @Autowired private DataSource dataSource;
   @Autowired private JdbcTemplate jdbcTemplateObject;
   
   @Autowired
   @Override
   public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }
   @Override
   public void create(String id_produsen, Integer nama_produsen) {
      /*String SQL = "insert into tbl_produsen_mobil (id_produsen_mobil, nama_produsen) values (?, ?)";
      
      jdbcTemplateObject.update( SQL, id_produsen, nama_produsen);
      System.out.println("Created Record Name = " + id_produsen + " Age = " + nama_produsen);
      return;*/
   }
   
   @Override
   public List<MerkMobil> listSemua() {
      String SQL = "select mm.*,pm.nama_produsen,jm.nama_jenis"
              + " FROM tbl_merk_mobil        AS mm "
              + " JOIN tbl_produsen_mobil    AS PM   ON mm.id_produsen_mobil=pm.id_produsen_mobil"
              + " JOIN tbl_jenis_mobil       AS jm   ON mm.id_jenis_mobil=jm.id_jenis_mobil";
      List <MerkMobil> merk_mobils = jdbcTemplateObject.query(SQL, new MerkMobilMapper());
      return merk_mobils;
   }

   @Override
    public MerkMobil getId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
