/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady.dao;

import lady.model.Peminjaman;
import java.util.List;

/**
 *
 * @author User
 */
public interface PeminjamanDao {
    void insert (Peminjaman peminjaman) throws Exception;
    
    void update (Peminjaman peminjaman) throws Exception;
    
    void delete (Peminjaman peminjaman) throws Exception;
    
    Peminjaman getPeminjaman (String kodeanggota, String kodebuku, String tglpinjam) throws Exception;
    
    List <Peminjaman> getAll() throws Exception;
}