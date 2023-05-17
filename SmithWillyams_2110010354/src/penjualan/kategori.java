/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author Lenovo
 */
public class kategori {
    
    private int id_kategori;
    private String nama_kategori;
    
// Constructor
 public kategori (int id_kategori, String nama_kategori) {
     this.id_kategori = id_kategori;
     this.nama_kategori = nama_kategori;
 } 
 
// Getter and Setter for id_kategori
    public int getid_kategori() {
        return id_kategori;
    }

    public void setid_kategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }
    
// Getter and Setter for nama_kategori
    public String getnama_kategori() {
        return nama_kategori;
    }

    public void setnama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
    
}
