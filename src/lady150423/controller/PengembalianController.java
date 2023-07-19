/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady.controller;
import lady.view.FormPengembalian;
import lady.model.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class PengembalianController {
    public class PeminjamanController {
    private FormPengembalian formPengembalian;
    private PengembalianDao pengembalianDao;
    private Pengembalian pengembalian;
    
    private PeminjamanDao peminjamanDao;
    
    public PengembalianController(FormPengembalian formPengembalian){
        this.formPengembalian = formPengembalian;
        pengembalianDao = new PengembalianDaoImpl();
        peminjamanDao = new PengembalianDaoImpl();
    }
          
    public void bersihForm(){
        formPeminjaman.getTxttglPinjam().setText("");
        formPeminjaman.getTxttglKembali().setText("");
    }
    
    public void isiCombo(){
        List<Anggota> listAnggota = anggotaDao.getAll();
        List<Buku> listBuku = bukuDao.getAll();
        formPeminjaman.getCboAnggota().removeAllItems();
        formPeminjaman.getCboBuku().removeAllItems();
    
        //list anggota
        for(Anggota anggota : listAnggota){
            formPeminjaman.getCboAnggota().addItem(anggota.getNobp());
        }
    
        for(Buku buku : listBuku){
            formPeminjaman.getCboBuku().addItem(buku.getkodeBuku());
        }
    }
    
    public void savePeminjaman(){
        peminjaman = new Peminjamann();
        peminjaman .setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.settglPinjam(formPeminjaman.getTxttglPinjam().getText());
        peminjaman.settglKembali(formPeminjaman.getTxttglKembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Entri OK");
    }
    
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            formPeminjaman.getCboAnggota().setSelectedItem(peminjaman.getAnggota().getNobp());
            formPeminjaman.getCboBuku().setSelectedItem(peminjaman.getBuku().getkodeBuku());
            formPeminjaman.getTxttglPinjam().setText(peminjaman.gettglPinjam());
            formPeminjaman.getTxttglKembali().setText(peminjaman.gettglKembali());
        }
    }
    
    public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(
                anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
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
        java.util.List<Peminjamann> list = peminjamanDao.getAll();
        for(Peminjamann peminjaman : list){
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
