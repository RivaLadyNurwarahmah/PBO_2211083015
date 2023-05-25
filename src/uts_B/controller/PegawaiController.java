/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_B.controller;
import uts_B.view.FormPegawai;
import uts_B.model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class PegawaiController {
    private FormPegawai formPegawai;
    private PegawaiDao pegawaiDao;
    private Pegawai pegawai;
    
    public PegawaiController(FormPegawai formPegawai){
        this.formPegawai = formPegawai;
        pegawaiDao = new PegawaiDaoImpl();
    }
    
    public void bersihForm(){
        formPegawai.getTxtNip().setText("");
        formPegawai.getTxtNama().setText("");
        formPegawai.getTxtAlamat().setText("");
    }
    
    public void savePegawai(){
        pegawai = new Pegawai();
        pegawai.setNip(formPegawai.getTxtNip().getText());
        pegawai.setNama(formPegawai.getTxtNama().getText());
        pegawai.setAlamat(formPegawai.getTxtAlamat().getText());
        pegawaiDao.save(pegawai);
        javax.swing.JOptionPane.showMessageDialog(formPegawai, "Entri OK");
    }
    
    public void getPegawai(){
        int index = formPegawai.getTblPegawai().getSelectedRow();
        pegawai = pegawaiDao.getPegawai(index);
        if(pegawai != null){
            formPegawai.getTxtNip().setText(pegawai.getNip());
            formPegawai.getTxtNama().setText(pegawai.getNama());
            formPegawai.getTxtAlamat().setText(pegawai.getAlamat());
        }
    }
    
    public void updatePegawai(){
        int index = formPegawai.getTblPegawai().getSelectedRow();
        pegawai.setNip(formPegawai.getTxtNip().getText());
        pegawai.setNama(formPegawai.getTxtNama().getText());
        pegawai.setAlamat(formPegawai.getTxtAlamat().getText());
        pegawaiDao.update(index,pegawai);
        javax.swing.JOptionPane.showMessageDialog(formPegawai, "Update OK");
    }
    
    public void deletePegawai(){
        int index = formPegawai.getTblPegawai().getSelectedRow();
        pegawaiDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPegawai, "Delete OK");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formPegawai.getTblPegawai().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Pegawai> list = pegawaiDao.getAll();
        for(Pegawai pegawai : list){
            Object[] data = {
                pegawai.getNip(),
                pegawai.getNama(),
                pegawai.getAlamat()
            };
            tabelModel.addRow(data);
        }
    }
}