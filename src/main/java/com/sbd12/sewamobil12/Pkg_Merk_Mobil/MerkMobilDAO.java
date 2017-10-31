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
import javax.swing.JComboBox;
import org.springframework.stereotype.Repository;

public interface MerkMobilDAO {
   /** 
      * This is the method to be used to initialize
      * database resources ie. connection.
     * @param ds
   */
   public void setDataSource(DataSource ds);
   
   /** 
      * This is the method to be used to create
      * a record in the Student table.
     * @param name
     * @param age
   */
   public void create(String id_merk_mobil, String id_produsen_mobil, String id_jenis_mobil, String nama_mobil );
   public MerkMobil getId(Integer id);
   
   /** 
     * This is the method to be used to list down
     * all the records from the Student table.
     * @return 
   */
   public List<MerkMobil> listSemua();
   public void combo_box(JComboBox Combo);
}