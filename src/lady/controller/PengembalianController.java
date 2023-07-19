/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lady.db.DbHelper;
import lady.model.*;
import lady.dao.*;
import lady.view.FormPengembalian;
/**
 *
 * @author User
 */
public class PengembalianController {
    FormPengembalian formPengembalian;
    Pengembalian pengembalian;
    PengembalianDao pengembalianDao;
    PeminjamanDao peminjamanDao;
    AnggotaDao anggotaDao;
    BukuDao bukuDao;
    Connection connection;
    
    public PengembalianController(FormPengembalian formPengembalian) {
        this.formPengembalian = formPengembalian;
        try {
            connection = DbHelper.getConnection();
            pengembalianDao = new PengembalianDaoImpl(connection);
            peminjamanDao = new PeminjamanDaoImpl(connection);
            anggotaDao = new AnggotaDaoImpl(connection);
            bukuDao = new BukuDaoImpl(connection);
        } catch (SQLException ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clearForm(){
        formPengembalian.getTxtDenda().setText("");
        formPengembalian.getTxtTerlamabt().setText("");
        formPengembalian.getTxtTglDiKembalikan().setText("");
        formPengembalian.getTxtTglPinjam().setText("");
    }
    
    public void isiComboAnggota(){
        try {
            formPengembalian.getCbokodeAnggota().removeAllItems();
            List<Anggota> list = anggotaDao.getAll();
            for(Anggota anggota : list){
                formPengembalian.getCbokodeAnggota()
                        .addItem(anggota.getKodeanggota()+"-"+anggota.getNamaanggota());
            }
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void isiComboBuku(){
        try {
            formPengembalian.getCbokodeBuku().removeAllItems();
            List<Buku> list = bukuDao.getAll();
            for(Buku buku : list){
                formPengembalian.getCbokodeBuku()
                        .addItem(buku.getKodebuku()+"-"+buku.getJudulbuku());
            }
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insert(){
        try {
            pengembalian = new Pengembalian();
            pengembalian.setKodeanggota(formPengembalian.getCboKodeAnggota()
                    .getSelectedItem().toString().split("-")[0]);
            pengembalian.setKodebuku(formPengembalian.getCboKodeBuku()
                    .getSelectedItem().toString().split("-")[0]);
            pengembalian.setTglpinjam(formPengembalian.getTxtTglPinjam().getText());
            pengembalian.setTgldikembalikan(formPengembalian.getTxtTglDiKembalikan().getText());
            pengembalian.setTerlambat(Integer.parseInt(formPengembalian
                    .getTxtTerlambat().getText()));
            pengembalian.setDenda(Double.parseDouble(formPengembalian.getTxtDenda().getText()));
            pengembalianDao.insert(pengembalian);
            JOptionPane.showMessageDialog(formPengembalian, "Pengembalian OK");
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getPengembalian(){
        try {
            pengembalian = new Pengembalian();
            String kodeanggota = formPengembalian.getTabelPengembalian()
                    .getValueAt(formPengembalian.getTabelPengembalian()
                            .getSelectedRow(), 0).toString();
            String kodebuku = formPengembalian.getTabelPengembalian()
                    .getValueAt(formPengembalian.getTabelPengembalian()
                            .getSelectedRow(), 2).toString();
            String tglpinjam = formPengembalian.getTabelPengembalian()
                    .getValueAt(formPengembalian.getTabelPengembalian()
                            .getSelectedRow(), 4).toString();
            
            Peminjaman peminjaman = peminjamanDao.getPeminjaman(kodeanggota, kodebuku, tglpinjam);
            Anggota anggota = anggotaDao.getAnggota(peminjaman.getAnggota().getKodeanggota());
            formPengembalian.getCbokodeAnggota()
                    .setSelectedItem(anggota.getKodeanggota()+"-"+anggota.getNamaanggota());
            
            Buku buku = bukuDao.getBuku(peminjaman.getBuku().getKodebuku());
            formPengembalian.getCbokodeBuku()
                    .setSelectedItem(buku.getKodebuku()+"-"+buku.getJudulbuku());
            
            formPengembalian.getTxtTglPinjam().setText(peminjaman.getTglpinjam());
            formPengembalian.getTxtTglDiKembalikan().setText(pengembalian.getTgldikembalikan());
            int terlambat = pengembalianDao
                    .selisihTgl(pengembalian.getTgldikembalikan(), peminjaman.getTglkembali());
            pengembalian.setTerlambat(terlambat);
            formPengembalian.getTxtTerlambat().setText(""+terlambat);
            formPengembalian.getTxtDenda().setText(""+pengembalian.getDenda());
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void tampil(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) formPengembalian.getTabelPengembalian().getModel();
            tabelModel.setRowCount(0);
            List<Pengembalian> list = pengembalianDao.getAll();
            for(Pengembalian p : list){
                Anggota anggota = anggotaDao.getAnggota(p.getKodeanggota());
                Buku buku = bukuDao.getBuku(p.getKodebuku());
                Peminjaman peminjaman = peminjamanDao.getPeminjaman(p.getKodeanggota(),
                        p.getKodebuku(), p.getTglpinjam());
                Object[] data = {
                    anggota.getKodeanggota(),
                    anggota.getNamaanggota(),
                    buku.getKodebuku(),
                    buku.getJudulbuku(),
                    p.getTglpinjam(),
                    peminjaman.getTglkembali(),
                    p.getTgldikembalikan(),
                    p.getTerlambat(),
                    p.getDenda()
                };
                tabelModel.addRow(data);
            }
        } catch (Exception ex) {
            Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
