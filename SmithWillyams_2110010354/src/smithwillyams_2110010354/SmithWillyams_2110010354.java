/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smithwillyams_2110010354;
import penjualan.*;
/**
 *
 * @author Lenovo
 */
public class SmithWillyams_2110010354 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // Create Object From Class Konsumen
            //INPUT
            pelanggan data= new pelanggan(123, "Smith", "smth@gmail.com", "0813492091738", "Jln Sundai");
            //OUTPUT
            System.out.println("DATA KONSUMEN");
            System.out.println("=======================");
            System.out.println("ID : " +data.getid_pelanggan());
            System.out.println("Nama : " +data.getnama_pelanggan());
            System.out.println("Email " +data.getemail_pelanggan());
            System.out.println("Hp " +data.gethp_pelanggang());
            System.out.println("Alamat : " +data.getalamat());

}
    
}
    

