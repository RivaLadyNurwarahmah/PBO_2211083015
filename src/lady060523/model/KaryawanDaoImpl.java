/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady060523.model;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author User
 */
public class KaryawanDaoImpl implements KaryawanDao{
    List<Karyawan> data = new ArrayList<>();
    
    public KaryawanDaoImpl(){
        data.add(new Karyawan("Aini","Yogyakarta","Y","001","2","OB",1));
        data.add(new Karyawan("Afon","Jakarta","Y","002","1","Manager",1));
    }
    
    public void save(Karyawan karyawan){
        data.add(karyawan);
    }
    
    public void update(int index, Karyawan karyawan){
        data.set(index, karyawan);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Karyawan getKaryawan(int index){
        return data.get(index);
    }
    
    public List<Karyawan> getAll(){
        return data;
    }
}