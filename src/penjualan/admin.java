/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author Lenovo
 */
public class admin{
    private String kd_admin;
    private String email_admin;
    private String pw_admin;
    private String nama_admin;
    
// Constructor
 public admin (String kd_admin, String email_admin, String pw_admin, String nama_admin) {
     this.kd_admin = kd_admin;
     this.email_admin= email_admin;
     this.pw_admin = pw_admin;
     this.nama_admin= nama_admin;
 }
 
 // Getter and Setter for kd_admin
    public String getkd_admin() {
        return kd_admin;
    }

    public void setkd_admin(String kd_admin) {
        this.kd_admin = kd_admin;
    }
    
 // Getter and Setter for email_admin
    public String getemail_admin() {
        return email_admin;
    }

    public void setemail_admin(String email_admin) {
        this.email_admin = email_admin;
    }
    
// Getter and Setter for pw_admin
    public String getpw_admin() {
        return pw_admin;
    }

    public void setpw_admin(String pw_admin) {
        this.pw_admin = pw_admin;
    }
    
// Getter and Setter for nama_admin
    public String getnama_admin() {
        return nama_admin;
    }

    public void setnama_admin(String nama_admin) {
        this.nama_admin = nama_admin;
    }    
}
