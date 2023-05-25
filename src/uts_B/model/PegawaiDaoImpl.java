/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_B.model;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author User
 */
public class PegawaiDaoImpl implements PegawaiDao{
    List<Pegawai> data = new ArrayList<>();
    
    public PegawaiDaoImpl(){
        data.add(new Pegawai("19802021","Ali", "Padang"));
        data.add(new Pegawai("19842023","Deni", "Padang Panjang"));
        data.add(new Pegawai("19832922","Ani", "Bukittinggi"));
    }
    
    public void save(Pegawai pegawai){
        data.add(pegawai);
    }
    
    public void update(int index, Pegawai pegawai){
        data.set(index, pegawai);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Pegawai getPegawai(int index){
        return data.get(index);
    }
    
    public List<Pegawai> getAll(){
        return data;
    }
}
