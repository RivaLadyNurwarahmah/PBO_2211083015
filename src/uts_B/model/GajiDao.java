/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_B.model;
import java.util.List;
/**
 *
 * @author User
 */
public interface GajiDao {
    void save(Gaji gaji);
    void update(int index,Gaji gaji);
    void delete(int index);
    Gaji getGaji(int index);
    List<Gaji> getAll();
}