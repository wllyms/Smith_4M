/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class transaksi {
    
    private String notrans;
    private String kd_admin;
    private String tgl_trans;
    private int id_pelanggan;
    private int total_byr;
    
    // Constructor
 public transaksi (String notrans, String kd_admin, String tgl_trans, int id_pelanggan, int total_byr) {
     this.notrans= notrans;
     this.kd_admin = kd_admin;
     this.tgl_trans = tgl_trans;
     this.id_pelanggan= id_pelanggan;
     this.total_byr = total_byr;
 }
 
 // Getter and Setter for notrans
    public String getnotrans() {
        return notrans;
    }

    public void setnotrans(String notrans) {
        this.notrans = notrans;
    }
    
    // Getter and Setter for kd_admin
    public String getkd_admin() {
        return kd_admin;
    }

    public void setkd_admin(String kd_admin) {
        this.kd_admin = kd_admin;
    }
    
    // Getter and Setter for tgl_trans
    public String gettgl_trans() {
        return tgl_trans;
    }

    public void settgl_trans(String tgl_trans) {
        this.tgl_trans = tgl_trans;
    }
    
    // Getter and Setter for id_pelanggan
    public int getid_pelanggan() {
        return id_pelanggan;
    }

    public void setid_pelanggan(int id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }
    
    // Getter and Setter for total_byr
    public int gettotal_byr() {
        return total_byr;
    }

    public void settotal_byr(int total_byr) {
        this.total_byr = total_byr;
    }
}
    

