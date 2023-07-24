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
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(0),"01/11/2023","05/11/2023"));
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(1),"11/11/2023","15/11/2023"));
    }
    
    @Override
    public void save(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    
    @Override
    public void update(int index, Peminjaman peminjaman){
        data.set(index, peminjaman);
    }
    
    @Override
    public void delete(int index){
        data.remove(index);
    }
    
    @Override
    public Peminjaman getPeminjaman(int index){
        return data.get(index);
    }
    
    @Override
    public List<Peminjaman> getAll(){
        return data;
    }
}