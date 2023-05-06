/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady150423.model;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class PeminjamanDaoImpl implements PeminjamanDao {
    List<Peminjaman> data = new ArrayList<>();
    
    public PeminjamanDaoImpl(){
        AnggotaDao daoAnggota = new AnggotaDaoImpl();
        BukuDao daoBuku = new BukuDaoImpl();
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(0),"1 Januari 2023","5 Januari 2023"));
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(0),"4 Januari 2023","8 Januari 2023"));
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(0),"11 Januari 2023","15 Januari 2023"));
    }
    
    public void save(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    
    public void update(int index, Peminjaman peminjaman){
        data.set(index, peminjaman);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Peminjaman getPeminjaman(int index){
        return data.get(index);
    }
    
    public List<Peminjaman> getAll(){
        return data;
    }
}