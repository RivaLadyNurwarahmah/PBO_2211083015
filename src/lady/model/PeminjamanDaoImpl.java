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
public class PeminjamanDaoImpl implements PeminjamanDao {
    List<Peminjaman> data = new ArrayList<>();
    
    public PeminjamanDaoImpl(){
        data.add(new Peminjaman("2211083015","A223","1 Januari 2023","5 Januari 2023"));
        data.add(new Peminjaman("2211082020","A314","4 Januari 2023","8 Januari 2023"));
        data.add(new Peminjaman("2211083014","A712","11 Januari 2023","15 Januari 2023"));
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
