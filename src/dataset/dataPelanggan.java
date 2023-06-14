/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class dataPelanggan {
    private ArrayList<Integer> id_pelanggan;
    private ArrayList<String> nama_pelanggan;
    private ArrayList<String> email_pelanggan;
    private ArrayList<String> hp_pelanggan;
    private ArrayList<String> alamat;
    
    
    public dataPelanggan(){
    
    id_pelanggan = new ArrayList<Integer>();
    nama_pelanggan = new ArrayList<String>();
    email_pelanggan = new ArrayList<String>();
    hp_pelanggan = new ArrayList<String>();
    alamat = new ArrayList<String>();
    
    
    }// Konstruct
    
    public void insertIdpelanggan(Integer isi){
        this.id_pelanggan.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdpelanggan(){
        return this.id_pelanggan;
    }
    
    public void insertNamapelanggan(String isi){
        this.nama_pelanggan.add(isi);
    }
    
    public ArrayList<String> getRecordNamapelanggan(){
        return this.nama_pelanggan;
    }
    
    public void insertEmailpelanggan(String isi){
        this.email_pelanggan.add(isi);
    }
    
    public ArrayList<String> getRecordEmailpelanggan(){
        return this.email_pelanggan;
    }
    
    public void insertHppelanggan(String isi){
        this.hp_pelanggan.add(isi);
    }
    
    public ArrayList<String> getRecordHppelanggan(){
        return this.hp_pelanggan;
    }
    
    public void insertAlamat(String isi){
        this.alamat.add(isi);
    }
    
    public ArrayList<String> getRecordAlamat(){
        return this.alamat;
    }
    
      
}

