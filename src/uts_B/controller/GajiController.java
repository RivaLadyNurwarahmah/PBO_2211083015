/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_B.controller;
import uts_B.view.FormGaji;
import uts_B.model.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class GajiController {
    private FormGaji formGaji;
    private GajiDao gajiDao;
    private Gaji gaji;
    
    private PegawaiDao pegawaiDao;
    
    public GajiController(FormGaji formGaji){
        this.formGaji = formGaji;
        gajiDao = new GajiDaoImpl();
        pegawaiDao = new PegawaiDaoImpl();
    }
          
    public void bersihForm(){
        formGaji.getTxtGolongan().setText("");
        formGaji.getTxtTanggal().setText("");
        formGaji.getTxtGapok().setText("");
        formGaji.getTxttunj_anak().setText("");
        formGaji.getTxttunj_Istri().setText("");
    }
    
    public void isiCombo(){
        List<Pegawai> listPegawai = pegawaiDao.getAll();
        formGaji.getCboPegawai().removeAllItems();
    
        //list anggota
        for(Pegawai pegawai : listPegawai){
            formGaji.getCboPegawai().addItem(pegawai.getNip());
        }
    }
    
    public void saveGaji(){
        gaji = new Gaji();
        gaji .setAnggota(gajiDao.getAnggota(formGaji.getCboPegawai().getSelectedIndex()));
        gaji.setNip(formGaji.getTxtNip().getText());
        gaji.setNama(formGaji.getTxtNama().getText());
        gajiDao.save(gaji);
        javax.swing.JOptionPane.showMessageDialog(formGaji, "Entri OK");
    }
    
    public void getGaji(){
        int index = formGaji.getTblGaji().getSelectedRow();
        gaji = gajiDao.getGaji(index);
        if(gaji != null){
            formGaji.getCboPegawai().setSelectedItem(peminjaman.getAnggota().getNobp());
            formGaji.getTxtNip().setText(gaji.getNip());
            formGaji.getTxtNama().setText(gaji.getNip());
        }
    }
    
    public void updateGaji(){
        int index = formGaji.getTblGaji().getSelectedRow();
        gaji.setGaji(
                gajiDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(
                bukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.settglPinjam(formPeminjaman.getTxttglPinjam().getText());
        peminjaman.settglKembali(formPeminjaman.getTxttglKembali().getText());
        peminjamanDao.update(index,peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Update OK");
    }
    
    public void deletePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Delete OK");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAll();
        for(Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getAnggota(),
                peminjaman.getBuku(),
                peminjaman.gettglPinjam(),
                peminjaman.gettglKembali()
            };
            tabelModel.addRow(data);
        }
    }
}

}
