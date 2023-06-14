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
public class dataKategori {
    private ArrayList<Integer> id_kategori;
    private ArrayList<String> nama_kategori;
    
    public dataKategori(){
    id_kategori = new ArrayList<Integer>();
    nama_kategori = new ArrayList<String>();
    }
    
    public void insertIdkategori(Integer isi){
        this.id_kategori.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdkategori(){
        return this.id_kategori;
    }
    
    public void insertNamakategori(String isi){
        this.nama_kategori.add(isi);
    }
    
    public ArrayList<String> getRecordNamakategori(){
        return this.nama_kategori;
    }
}
