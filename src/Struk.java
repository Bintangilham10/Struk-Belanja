
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class Struk {
    //deklarasi
    private String kode, nama;
    private int harga, jumlah, uang;
    private double diskon;
    private final Scanner input;
    
    public Struk(){
        this.input = new Scanner(System.in);   
    }
    
    //Getter & Setter
    public String getKode(){
        return kode;
    }
    public void setKode(String kode){
        this.kode = kode;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getHarga(){
        return harga;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public int getJumlah(){
        return jumlah;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public int getUang(){
        return uang;
    }
    public void setUang(int uang){
        this.uang = uang;
    }
    public double getDiskon(){
        return diskon;
    }
    public void setDiskon(double diskon){
        this.diskon = diskon;
    }
    
    //proses
    public int total(){
        return this.getHarga()*this.getJumlah(); 
    }
    public double diskon(){
        return this.getDiskon()*this.total();
    }
    public int bayar(){
        return(int) (this.total()-this.diskon());
    }
    public int kembali(){
        return this.getUang()-this.bayar();
    }
    public Scanner inputData(){
        return this.input;
    }
}
