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
public class BukuDaoImpl implements BukuDao{
    List<Buku> data = new ArrayList<>();
    
    public BukuDaoImpl(){
        data.add(new Buku("2152023","Bumi","Tereliye","Andalas","2017"));
        data.add(new Buku("2142023","Bulan","Tereliye","Andalas","2018"));
        data.add(new Buku("2132023","Bintang","Tereliye","Andalas","2019"));
        data.add(new Buku("2122023","Matahari","Tereliye","Andalas","2019"));
    }
    
    public void save(Buku buku){
        data.add(buku);
    }
    
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku> getAll(){
        return data;
    }
}