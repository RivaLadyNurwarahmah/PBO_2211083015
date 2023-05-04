/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady.model;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class PengembalianDaoImpl {
    List<Pengembalian> data = new ArrayList<>();
    
    public PengembalianDaoImpl(){
        PeminjamanDao daoPeminjaman = new PeminjamanDaoImpl();
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(0),"1 Januari 2023","5 Januari 2023"));
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(0),"4 Januari 2023","8 Januari 2023"));
    }
    
    public void save(Pengembalian pengembalian){
        data.add(pengembalian);
    }
    
    public void update(int index, Pengembalian pengembalian){
        data.set(index, pengembalian);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Pengembalian getPengembalian(int index){
        return data.get(index);
    }
    
    public List<Pengembalian> getAll(){
        return data;
    }
}