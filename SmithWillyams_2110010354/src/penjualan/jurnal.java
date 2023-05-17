/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author Lenovo
 */
public class jurnal {
    private int id_jurnal;
    private int debit;
    private int kredit;
    private String notrans;
    private String no_ref;
    private String tgl_jurnal;
    
// Constructor
 public jurnal (int id_jurnal, int debit, int kredit, String notrans, String no_ref, String tgl_jurnal) {
     this.id_jurnal =id_jurnal;
     this.debit = debit;
     this.kredit = kredit;
     this.notrans = notrans;
     this.no_ref = no_ref;
     this.tgl_jurnal= tgl_jurnal;
 }
 
 // Getter and Setter for id_jurnal
    public int getid_jurnal() {
        return id_jurnal;
    }

    public void setid_jurnal(int id_jurnal) {
        this.id_jurnal = id_jurnal;
    }
    
    // Getter and Setter for debit
    public int getdebit() {
        return debit;
    }

    public void setdebit(int debit) {
        this.debit = debit;
    }
    
    // Getter and Setter for kredit
    public int getkredit() {
        return kredit;
    }

    public void setkredit(int kredit) {
        this.kredit = kredit;
    }
    
    // Getter and Setter for notrans
    public String getnotrans() {
        return notrans;
    }

    public void setnotrans(String notrans) {
        this.notrans = notrans;
    }
    
    // Getter and Setter for no_ref
    public String getno_ref() {
        return no_ref;
    }

    public void setno_ref(String no_ref) {
        this.no_ref = no_ref;
    }
    
    // Getter and Setter for tgl_jurnal
    public String gettgl_jurnaln() {
        return tgl_jurnal;
    }

    public void settgl_jurnal(String tgl_jurnal) {
        this.tgl_jurnal = tgl_jurnal;
    }
}
