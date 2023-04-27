/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady.controller;
import lady.view.FormPeminjaman;
import lady.model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
    }
    
    public void bersihForm(){
        formPeminjaman.getTxtNobp().setText("");
        formPeminjaman.getTxtkodeBuku().setText("");
        formPeminjaman.getTxttglPinjam().setText("");
        formPeminjaman.getTxttglKembali().setText("");
    }
    
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setNobp(formPeminjaman.getTxtNobp().getText());
        peminjaman.setkodeBuku(formPeminjaman.getTxtkodeBuku().getText());
        peminjaman.settglPinjam(formPeminjaman.getTxttglPinjam().getText());
        peminjaman.settglKembali(formPeminjaman.getTxttglKembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Entri OK");
    }
    
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            formPeminjaman.getTxtNobp().setText(peminjaman.getNobp());
            formPeminjaman.getTxtkodeBuku().setText(peminjaman.getkodeBuku());
            formPeminjaman.getTxttglPinjam().setText(peminjaman.gettglPinjam());
            formPeminjaman.getTxttglKembali().setText(peminjaman.gettglKembali());
        }
    }
    
    public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setNobp(formPeminjaman.getTxtNobp().getText());
        peminjaman.setkodeBuku(formPeminjaman.getTxtkodeBuku().getText());
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
                peminjaman.getNobp(),
                peminjaman.getkodeBuku(),
                peminjaman.gettglPinjam(),
                peminjaman.gettglKembali()
            };
            tabelModel.addRow(data);
        }
    }
}
