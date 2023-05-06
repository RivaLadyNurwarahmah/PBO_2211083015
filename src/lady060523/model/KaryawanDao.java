/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady060523.model;
import java.util.List;
/**
 *
 * @author User
 */
public interface KaryawanDao {
    void save(Karyawan karyawan);
    void update(int index, Karyawan karyawan);
    void delete(int index);
    Karyawan getAnggota(int index);
    List<Karyawan> getAll();
}
