/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_B.model;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class GajiDaoImpl {
    List<Gaji> data = new ArrayList<>();
    
    public GajiDaoImpl(){
        PegawaiDao daoPegawai = new PegawaiDaoImpl();
        data.add(new Gaji(daoPegawai.getPegawai(0),"IIIA","1 Januari 2023","1.000.000","50.000","50.000"));
        data.add(new Gaji(daoPegawai.getPegawai(0),"IIIB","5 Januari 2023","2.000.000","100.000","100.000"));
        data.add(new Gaji(daoPegawai.getPegawai(0),"IIIC","9 Januari 2023","3.000.000","150.000","150.000"));
    }
    
    public void save(Gaji gaji){
        data.add(gaji);
    }
    
    public void update(int index, Gaji gaji){
        data.set(index, gaji);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Gaji getGaji(int index){
        return data.get(index);
    }
    
    public List<Gaji> getAll(){
        return data;
    }
}