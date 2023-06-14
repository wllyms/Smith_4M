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
public class dataDetail {
    private ArrayList<Integer> notrans;
    private ArrayList<Integer> id_produk;
    private ArrayList<Integer> harga;
    private ArrayList<Integer> jml_beli;
    private ArrayList<String> subtotal;
    
    
    public dataDetail(){
    
    notrans = new ArrayList<Integer>();
    id_produk = new ArrayList<Integer>();
    harga = new ArrayList<Integer>();
    jml_beli = new ArrayList<Integer>();
    subtotal = new ArrayList<String>();
    
    }// Konstruct
    
    public void insertNotrans(Integer isi){
        this.notrans.add(isi);
    }
    
    public ArrayList<Integer> getRecordNotrans(){
        return this.notrans;
    }
    
    public void insertIdproduk(Integer isi){
        this.id_produk.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdproduk(){
        return this.id_produk;
    }
    
    public void insertHarga(Integer isi){
        this.harga.add(isi);
    }
    
    public ArrayList<Integer> getRecordHarga(){
        return this.harga;
    }
    
    public void insertJmlbeli(Integer isi){
        this.jml_beli.add(isi);
    }
    
    public ArrayList<Integer> getRecordJmlbeli(){
        return this.jml_beli;
    }
    
    public void insertSubtotal(String isi){
        this.subtotal.add(isi);
    }
    
    public ArrayList<String> getRecordSubtotal(){
        return this.subtotal;
    }
      
}

