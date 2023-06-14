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
public class dataJurnal {
    private ArrayList<Integer> id_jurnal;
    private ArrayList<Integer> debit;
    private ArrayList<Integer> kredit;
    private ArrayList<String> notrans;
    private ArrayList<String> no_ref;
    private ArrayList<String> tgl_jurnal;
    
    public dataJurnal(){
    
    id_jurnal = new ArrayList<Integer>();
    debit = new ArrayList<Integer>();
    kredit = new ArrayList<Integer>();
    notrans = new ArrayList<String>();
    no_ref = new ArrayList<String>();
    tgl_jurnal = new ArrayList<String>();
    
    }// Konstruct
    
    public void insertIdjurnal(Integer isi){
        this.id_jurnal.add(isi);
    }
    
    public ArrayList<Integer> getRecordIdjurnal(){
        return this.id_jurnal;
    }
    
    public void insertDebit(Integer isi){
        this.debit.add(isi);
    }
    
    public ArrayList<Integer> getRecordDebit(){
        return this.debit;
    }
    
    public void insertKredit(Integer isi){
        this.kredit.add(isi);
    }
    
    public ArrayList<Integer> getRecordKredit(){
        return this.kredit;
    }
    
    public void insertNotrans(String isi){
        this.notrans.add(isi);
    }
    
    public ArrayList<String> getRecordNotrans(){
        return this.notrans;
    }
    
    public void insertNoref(String isi){
        this.no_ref.add(isi);
    }
    
    public ArrayList<String> getRecordNoref(){
        return this.no_ref;
    }
    
    public void insertTgljurnal(String isi){
        this.tgl_jurnal.add(isi);
    }
    
    public ArrayList<String> getRecordTgljurnal(){
        return this.tgl_jurnal;
    }
   
}

