/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbd12.sewamobil12.Pkg_Owner_Mobil;

/**
 *
 * @author resas
 */
public class OwnerMobil {
   private String id_owner;
   private String no_ktp_ow;
   private String nama_ow;
   private String jenis_kelamin_ow;
   private String alamat_ow;
   private String no_telepon_ow;

   public void setId_owner(String id) {
      this.id_owner = id;
   }
   public String getId_owner() {
      return id_owner;
   }
   public void setNo_ktp_ow(String no_ktp_ow ) {
      this.no_ktp_ow = no_ktp_ow;
   }
   public String getNo_ktp_ow() {
      return no_ktp_ow;
   }
   public void setNama_ow(String nama ) {
      this.nama_ow = nama;
   }
   public String getNama_ow() {
      return nama_ow;
   }
   public void setJenis_Kelamin(String jk ) {
      this.jenis_kelamin_ow = jk;
   }
   public String getJenis_Kelamin() {
      return jenis_kelamin_ow;
   }
   public void setAlamat_ow(String alamat ) {
      this.alamat_ow = alamat;
   }
   public String getAlamat_ow() {
      return alamat_ow;
   }
   public void setNo_telepon_ow(String telp ) {
      this.no_telepon_ow = telp;
   }
   public String getNo_telepon_ow() {
      return no_telepon_ow;
   }
    
}
