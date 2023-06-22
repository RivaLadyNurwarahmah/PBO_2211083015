/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import lady.model.Peminjaman;

/**
 *
 * @author User
 */
public class PeminjamanDaoImpl implements PeminjamanDao{
       private Connection connection;
    
    public PeminjamanDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    public void insert (Peminjaman peminjaman) throws Exception{
        String sql = "insert into peminjaman values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getAnggota());
        ps.setString(2, peminjaman.getKodebuku());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.setString(4, peminjaman.getTglkembali());
        ps.executeUpdate();
        ps.close();
    }
    
    public void update (Peminjaman peminjaman) throws Exception {
        String sql = "UPDATE peminjaman SET namaanggota = ?, alamat = ?, jeniskelamin = ? "
                + "WHERE kodeanggota = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getNamaanggota());
        ps.setString(2, peminjaman.getAlamat());
        ps.setString(3, peminjaman.getJeniskelamin());
        ps.setString(4, peminjaman.getKodeanggota());
        ps.executeUpdate();
    }
    
    public void delete(Anggota anggota) throws Exception{
        String sql = "DELETE FROM anggota WHERE kodeanggota =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anggota.getKodeanggota());
        ps.executeUpdate();
        ps.close();
    }
    
    public Anggota getAnggota(String kodeanggota) throws Exception{
        String sql = "Select * FROM anggota WHERE kodeanggota =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeanggota);
        ResultSet rs = ps.executeQuery();
        Anggota anggota = null;
        if(rs.next()){
            anggota = new Anggota();
            anggota.setKodeanggota(rs.getString(1));
            anggota.setNamaanggota(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJeniskelamin(rs.getString(4));
        }
        return anggota;
    }
    
    public List<Anggota> getAll() throws Exception{
        String sql = "Select * FROM anggota";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Anggota anggota;
        List<Anggota> list = new ArrayList<>();
        while(rs.next()){
            anggota = new Anggota();
            anggota.setKodeanggota(rs.getString(1));
            anggota.setNamaanggota(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJeniskelamin(rs.getString(4));
            list.add(anggota);
        }
        return list;
    }
}