/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady.dao;

import lady.model.Anggota;
import java.util.List;
/**
 *
 * @author User
 */
public interface AnggotaDao {
    void insert (Anggota anggota) throws Exception;
    void update (Anggota anggota) throws Exception;
    void delete (Anggota anggota) throws Exception;
    Anggota getAnggota (String kodeanggota) throws Exception;
    List <Anggota> getAll() throws Exception;
}
