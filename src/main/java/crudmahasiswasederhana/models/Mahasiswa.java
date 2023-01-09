/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudmahasiswasederhana.models;

/**
 *
 * @author user
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    
    public Mahasiswa(){
        
    }
    public Mahasiswa(String nim,String nama,String alamat){
        this.nama =nim;
        this.nama=nama;
        this.alamat=alamat;
    }
    public String getnim(){
        return nim;
    }
    public String getnama(){
        return nama;
    }
    public String getalamat(){
        return alamat;
    }
    public void setnim(String nim){
        this.nim=nim;
    }
    public void setnama(String nama){
        this.nama=nama;
    }
    public void setalamat(String alamat){
        this.alamat=alamat;
    }
}
