/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady.db;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import lady.dao.AnggotaDao;
import lady.dao.AnggotaDaoImpl;
import lady.model.Anggota;

/**
 *
 * @author User
 */
public class DbHelper {
    private static Connection connection;
    public static Connection getConnection() throws SQLException {
        if(connection==null){
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost/pbo_2211083015");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
    }
    
    public static void main(String[] args){
        try {
            connection = DbHelper.getConnection();
            AnggotaDao dao = new AnggotaDaoImpl(connection);
            Anggota anggota = new Anggota("A002","Riva","Batusangkar","P");
            dao.insert(anggota);
            JOptionPane.showMessageDialog(null, "Entri data OK");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}