/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudmahasiswasederhana.interfc;

import crudmahasiswasederhana.models.Mahasiswa;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author user
 */
public interface MahasiswaInterface {
    Mahasiswa Insert(Mahasiswa o)throws SQLException;
    
    void update (Mahasiswa o) throws SQLException;
    
    void delete (String nim)throws SQLException;
    
    List<Mahasiswa> getAll()throws SQLException;
}
