
package com.sbd12.sewamobil12.Pkg_Owner_Mobil;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author resas
 */
public class OwnerMobilMapper implements RowMapper<OwnerMobil>{
     /**
     *
     * @param rs
     * @param rowNum
     * @return
     * @throws SQLException
     */
    @Override
   public OwnerMobil mapRow(ResultSet rs, int rowNum) throws SQLException {
      OwnerMobil owner = new OwnerMobil();
      owner.setId_owner(rs.getString("id_owner"));
      owner.setNo_ktp_ow(rs.getString("no_ktp_ow"));
      owner.setNama_ow(rs.getString("nama_ow"));
      owner.setJenis_Kelamin(rs.getString("jenis_kelamin_ow"));
      owner.setAlamat_ow(rs.getString("alamat_ow"));
      owner.setNo_ktp_ow(rs.getString("no_telepon_ow"));
      return owner;
   }
    
}
