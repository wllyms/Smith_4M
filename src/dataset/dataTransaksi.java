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
public class dataTransaksi {
    private ArrayList<String> notrans;
    private ArrayList<String> kd_admin;
    private ArrayList<String> tgl_trans;
    private ArrayList<Integer> id_pelanggan;
    private ArrayList<Integer> total_byr;
    
    
    public dataTransaksi(){
    
    notrans = new ArrayList<String>();
    kd_admin = new ArrayList<String>();
    tgl_trans = new ArrayList<String>();
    id_pelanggan = new ArrayList<Integer>();
    total_byr = new ArrayList<Integer>();
    
    }// Konstruct
    
    public void insertNotrans(String isi){
        this.notrans.add(isi);
    }
    
    public ArrayList<String> getRecordNotrans(){
        return this.notrans;
    }
    
    public void insertKdadmin(String isi){
        this.kd_admin.add(isi);
    }
    
    public ArrayList<String> getRecordKdadmin(){
        return this.kd_admin;
    }
    
    public void insertTgltrans(String isi){
        this.tgl_trans.add(isi);
    }
    
    public ArrayList<String> getRecordTgltrans(){
        return this.tgl_trans;
    }
    
    public void insertIdpelanggan(Integer isi){
        this.id_pelanggan.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdpelanggan(){
        return this.id_pelanggan;
    }
    
    public void insertTotalbayar(Integer isi){
        this.total_byr.add(isi);
    }
    
    public ArrayList<Integer> getRecordTotalbayar(){
        return this.total_byr;
    }
      
}

