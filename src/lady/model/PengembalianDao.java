/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady.model;
import java.util.List;
/**
 *
 * @author User
 */
public interface PengembalianDao {
    void save(Pengembalian pengembalian);
    void update(int index,Pengembalian pengembalian);
    void delete(int index);
    Peminjaman getPengembalian(int index);
    List<Pengembalian> getAll();
}