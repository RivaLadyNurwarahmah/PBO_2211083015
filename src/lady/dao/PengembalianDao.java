/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady.dao;

import java.util.List;
import lady.model.Pengembalian;

/**
 *
 * @author User
 */
public interface PengembalianDao {
    void insert (Pengembalian pengembalian) throws Exception;
    
    void update (Pengembalian pengembalian) throws Exception;
    
    void delete (Pengembalian pengembalian) throws Exception;
    
    Pengembalian getPengembalian(String kodeanggota, String kodebuku, String tglpinjam) throws Exception;
    
    List<Pengembalian> getAll() throws Exception;
    
    int selisihTgl(String tgl1, String tgl2) throws Exception;
    
    List<Pengembalian> cari(String kode, String cari) throws Exception;
}
