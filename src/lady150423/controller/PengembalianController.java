/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady150423.controller;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import lady150423.model.*;
import lady150423.view.*;
/**
 *
 * @author User
 */
public class PengembalianController {
    private Peminjaman peminjaman;
    private PeminjamanDaoImpl peminjamanDao;
    
    private Pengembalian pengembalian;
    private PengembalianDao pengembalianDao;
    private FormPeminjaman formPeminjaman;
    
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    
    public PengembalianController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
        pengembalianDao = new PengembalianDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
    }
          
    public void bersihForm(){
        formPeminjaman.getTxttglPinjam().setText("");
        formPeminjaman.getTxttglKembali().setText("");
        formPeminjaman.getTxttglDikembalikan().setText("");
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
    
    public void save(){
        peminjaman = new Peminjaman();
        peminjaman .setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.settglPinjam(formPeminjaman.getTxttglPinjam().getText());
        peminjaman.settglKembali(formPeminjaman.getTxttglKembali().getText());
        peminjamanDao.save(peminjaman);
        
        pengembalian = new Pengembalian();
        pengembalian.setTgldikembalikan(formPeminjaman.getTxttglDikembalikan().getText());
        pengembalian.setTerlambat(formPeminjaman.getTxttglKembali().getText());
        pengembalian.setDenda();
        pengembalianDao.save(pengembalian);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Entri OK");
    }
    
    public void get(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            formPeminjaman.getCboAnggota().setSelectedItem(peminjaman.getAnggota().getNobp());
            formPeminjaman.getCboBuku().setSelectedItem(peminjaman.getBuku().getkodeBuku());
            formPeminjaman.getTxttglPinjam().setText(peminjaman.gettglPinjam());
            formPeminjaman.getTxttglKembali().setText(peminjaman.gettglKembali());
        }

        pengembalian = pengembalianDao.getPengembalian(index);
        if(pengembalian != null){
            formPeminjaman.getTxttglDikembalikan().setText(pengembalian.getTgldikembalikan());
        }
    }
    
    public void update(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.settglPinjam(formPeminjaman.getTxttglPinjam().getText());
        peminjaman.settglKembali(formPeminjaman.getTxttglKembali().getText());
        peminjamanDao.update(index,peminjaman);
        
        pengembalian.setTgldikembalikan(formPeminjaman.getTxttglDikembalikan().getText());
        pengembalian.setTerlambat(formPeminjaman.getTxttglKembali().getText());
        pengembalian.setDenda();
        pengembalianDao.update(index,pengembalian);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Update OK");
    }
    
    public void delete(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        pengembalianDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Delete OK");
    }
    
    public void kembalikan(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        
        pengembalian.setTgldikembalikan(formPeminjaman.getTxttglDikembalikan().getText());
        pengembalian.setTerlambat(formPeminjaman.getTxttglKembali().getText());
        pengembalian.setDenda();
        pengembalianDao.update(index,pengembalian);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Buku Dikembalikan");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        
        java.util.List<Peminjaman> listPeminjaman = peminjamanDao.getAll();
        java.util.List<Pengembalian> listPengembalian = pengembalianDao.getAll();
        
        List<Object[]> dataGabungan = new ArrayList<>();
        for (int i = 0; i < listPeminjaman.size(); i++) {
            Peminjaman peminjaman = listPeminjaman.get(i);
            Pengembalian pengembalian = null;
            if (i < listPengembalian.size()) {
                pengembalian = listPengembalian.get(i);
            }
            Object[] data = {
                peminjaman.getAnggota().getNobp(),
                peminjaman.getAnggota().getNama(),
                peminjaman.getBuku().getkodeBuku(),
                peminjaman.gettglPinjam(),
                peminjaman.gettglKembali(),
                (pengembalian == null) ? "" : pengembalian.getTgldikembalikan(),
                (pengembalian == null) ? "" : pengembalian.getTerlambat(),
                (pengembalian == null) ? "" : pengembalian.getDenda()
            };
            dataGabungan.add(data);
        }
        // Menambahkan data ke dalam tabel
        for (Object[] data : dataGabungan) {
            tabelModel.addRow(data);
        }
    }
}