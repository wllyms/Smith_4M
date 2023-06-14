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
public class dataAdmin {
    private ArrayList<String> kd_admin;
    private ArrayList<String> email_admin;
    private ArrayList<String> pw_admin;
    private ArrayList<String> nama_admin;
    
    public dataAdmin(){
    
    kd_admin = new ArrayList<String>();
    email_admin = new ArrayList<String>();
    pw_admin = new ArrayList<String>();
    nama_admin = new ArrayList<String>();
    
    }// Konstruct
    
    public void insertKdadmin(String isi){
        this.kd_admin.add(isi);
    }
    
    public ArrayList<String> getRecordKdadmin(){
        return this.kd_admin;
    }
    
    public void insertEmailadmin(String isi){
        this.email_admin.add(isi);
    }
    
    public ArrayList<String> getRecordEmailadmin(){
        return this.email_admin;
    }
    
    public void insertPwadmin(String isi){
        this.pw_admin.add(isi);
    }
    
    public ArrayList<String> getRecordPwadmin(){
        return this.pw_admin;
    }
    
    public void insertNamaadmin(String isi){
        this.nama_admin.add(isi);
    }
    
    public ArrayList<String> getRecordNamaadmin(){
        return this.nama_admin;
    }
   
}
