/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudmahasiswasederhana.interfc;

import crudmahasiswasederhana.db.ConnectionHelper;
import crudmahasiswasederhana.models.Mahasiswa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class MahasiswaController implements MahasiswaInterface{
    PreparedStatement st;

    @Override
    public Mahasiswa Insert(Mahasiswa o) throws SQLException {
        st = ConnectionHelper.getConnection().prepareStatement(
            "Insert Into mahasiswa values(?,?,?)");
        st.setString(1,o.getnim());
        st.setString(2,o.getnama());
        st.setString(3,o.getalamat());
        st.executeUpdate();
        return o;
    }

    @Override
    public void update(Mahasiswa o) throws SQLException {
        st = ConnectionHelper.getConnection().prepareStatement(
            "update mahasiswa set nama=?,alamat=? where nim=?");
        st.setString(1,o.getnim());
        st.setString(2,o.getnama());
        st.setString(3,o.getalamat());
        st.executeUpdate();
    }

    @Override
    public void delete(String nim) throws SQLException {
         st = ConnectionHelper.getConnection().prepareStatement(
            "delete from mahasiswa where nim=?");
        st.setString(1,nim);
        st.executeUpdate();
    }

    @Override
    public List<Mahasiswa> getAll() throws SQLException {
        Statement st=ConnectionHelper.getConnection().createStatement();
        ResultSet rs =st.executeQuery("select * from mahasiswa");
        List<Mahasiswa> list= new ArrayList<Mahasiswa>();
        while (rs.next()){
            Mahasiswa mhs=new Mahasiswa();
            mhs.setnim(rs.getString("nim"));
            mhs.setnama(rs.getString("nama"));
            mhs.setalamat(rs.getString("alamat"));
            list.add(mhs);
        }
        return list;
    }
    
    
}
