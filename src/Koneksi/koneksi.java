/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;
import java.sql.*;
/**
 *
 * @author ZIDAN
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Konek");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Gagal Koneksi"+ex);
        }
        String url = "jdbc:mysql://localhost/toko_kelontong";
        try{
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Koneksi Database");
        }
        catch (SQLException ex){
            System.out.println("Gagal Koneksi Database"+ex);
        }
        return koneksi;
        
    } 
}
