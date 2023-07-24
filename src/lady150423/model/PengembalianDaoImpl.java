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
public class PengembalianDaoImpl implements PengembalianDao{
    List<Pengembalian> data = new ArrayList<>();
    
    public PengembalianDaoImpl(){
        PeminjamanDaoImpl daoPeminjaman = new PeminjamanDaoImpl();
        data.add(new Pengembalian(daoPeminjaman.getPeminjaman(0).gettglKembali(),"15/11/2023"));
        data.add(new Pengembalian("",""));
    }
    
    @Override
    public void save(Pengembalian pengembalian){
        data.add(pengembalian);
    }
    
    @Override
    public void update(int index, Pengembalian pengembalian){
        data.set(index, pengembalian);
    }
    
    @Override
    public void delete(int index){
        data.remove(index);
    }
    
    @Override
    public Pengembalian getPengembalian(int index){
        return data.get(index);
    }
    
    @Override
    public List<Pengembalian> getAll(){
        return data;
    }
}