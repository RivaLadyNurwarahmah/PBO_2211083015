/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_B.model;
import java.util.List;
/**
 *
 * @author User
 */
public interface PegawaiDao {
    void save(Pegawai pegawai);
    void update(int index, Pegawai pegawai);
    void delete(int index);
    Pegawai getPegawai(int index);
    List<Pegawai> getAll();
}
