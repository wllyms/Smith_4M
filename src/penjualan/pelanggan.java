/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author Lenovo
 */
public class pelanggan {
    private int id_pelanggan;
    private String nama_pelanggan;
    private String email_pelanggan;
    private String hp_pelanggang;
    private String alamat;


// Constructor
 public pelanggan (int id_pelanggan, String nama_pelanggan, String email_pelanggan, String hp_pelanggan, String alamat ) {
     this.id_pelanggan = id_pelanggan;
     this.nama_pelanggan = nama_pelanggan;
     this.email_pelanggan = email_pelanggan;
     this.hp_pelanggang = hp_pelanggan;
     this.alamat = alamat;
 }
    
 // Getter and Setter for id_pelanggan
    public int getid_pelanggan() {
        return id_pelanggan;
    }

    public void setid_pelanggan(int id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }
    
    // Getter and Setter for nama_pelanggan
    public String getnama_pelanggan() {
        return nama_pelanggan;
    }

    public void setnama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }
    
    // Getter and Setter for nama_pelanggan
    public String getemail_pelanggan() {
        return email_pelanggan;
    }

    public void setemail_pelanggan(String email_pelanggan) {
        this.email_pelanggan = email_pelanggan;
    }

    // Getter and Setter for hp_pelanggang
    public String gethp_pelanggang() {
        return hp_pelanggang;
    }

    public void sethp_pelanggang(String hp_pelanggang) {
        this.hp_pelanggang = hp_pelanggang;
    }
    
    // Getter and Setter for alamat
    public String getalamat() {
        return alamat;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }
}