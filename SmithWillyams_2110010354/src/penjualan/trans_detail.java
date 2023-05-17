/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author Lenovo
 */
public class trans_detail {
    
    private int notrans;
    private int id_produk;
    private int harga;
    private int jml_beli;
    private String subtotal;
    
// Constructor
 public trans_detail (int notrans, int id_produk, int harga, int jml_beli, String subtotal) {
     this.notrans = notrans;
     this.id_produk = id_produk;
     this.harga = harga;
     this.jml_beli= jml_beli;
     this.subtotal = subtotal;
 }
 
 // Getter and Setter for notrans
    public int getnotrans() {
        return notrans;
    }

    public void setnotrans(int notrans) {
        this.notrans = notrans;
    }
    
    // Getter and Setter for id_produk
    public int getid_produk() {
        return id_produk;
    }

    public void setid_produk(int id_produk) {
        this.id_produk = id_produk;
    }
    
    // Getter and Setter for harga
    public int getharga() {
        return harga;
    }

    public void setharga(int harga) {
        this.harga = harga;
    }
    
    // Getter and Setter for jml_beli
    public int getjml_beli() {
        return jml_beli;
    }

    public void setjml_beli(int jml_beli) {
        this.jml_beli = jml_beli;
    }
    
    // Getter and Setter for subtotal
    public String getsubtotal() {
        return subtotal;
    }

    public void setsubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

}
