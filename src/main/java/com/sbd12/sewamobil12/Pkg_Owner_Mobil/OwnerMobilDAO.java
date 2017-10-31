/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbd12.sewamobil12.Pkg_Owner_Mobil;

import javax.sql.DataSource;
import java.util.List;

/**
 *
 * @author resas
 */
public interface OwnerMobilDAO {
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
   public void create(String name, Integer age);
   public OwnerMobil getId(Integer id);
   
   /** 
     * This is the method to be used to list down
     * all the records from the Student table.
     * @return 
   */
   public List<OwnerMobil> listSemua();

    
}
