/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbd12.sewamobil12.Pkg_Data_Mobil;

/**
 *
 * @author resas
 */
public class DataMobil {
   private String no_pol;
   private String id_merk_mobil;
   private String id_owner;
   private String nama_mobil;
   private String nama_ow;

   public void setNo_pol(String nopol) {
      this.no_pol = nopol;
   }
   public String getNo_pol() {
      return no_pol;
   }
   public void setId_merk_mobil(String id_merk) {
      this.id_merk_mobil = id_merk;
   }
   public String getId_merk_mobil() {
      return id_merk_mobil;
   }
   public void setNama_mobil(String nama)
   {
       this.nama_mobil=nama;
   }
   public String getNama_mobil()
   {
       return nama_mobil;
   }
    public void setNamaow (String nama_owner) {
      this.nama_ow = nama_owner;
   }
    public String getNama_ow()
    {
        return nama_ow;
    }
   public void setId_owner(String id_owner) {
      this.id_owner = id_owner;
   }
   public String getId_owner() {
      return id_owner;
   }
   
   
    
    
}
