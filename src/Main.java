/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objek baru Struk
        Struk buy = new Struk();
   
        System.out.print("Kode Barang         : ");
        buy.setKode(buy.inputData().nextLine());
        System.out.print("Nama Barang         : ");
        buy.setNama(buy.inputData().nextLine());
        System.out.print("Harga Satuan Barang : Rp.");
        buy.setHarga(buy.inputData().nextInt());
        System.out.print("Jumlah Barang       : ");
        buy.setJumlah(buy.inputData().nextInt());
        System.out.print("Diskon Barang       : ");
        buy.setDiskon(buy.inputData().nextDouble());
        System.out.println("");
        //output
        System.out.println("===========================================");
        System.out.println("           TOKO SURYA TENGGARA             ");
        System.out.println("===========================================");
        System.out.println("Kode Barang         : "+buy.getKode());
        System.out.println("Nama Barang         : "+buy.getNama());
        System.out.println("Harga Satuan        : Rp."+buy.getHarga());
        System.out.println("JUmlah Barang       : "+buy.getJumlah());
        System.out.println("Diskon              : "+buy.getDiskon());
        System.out.println("Total Harga         : "+buy.total());
        System.out.println("Total Diskon        : "+buy.diskon());
        System.out.println("Total Pembayaran    : Rp."+buy.bayar());
        
        System.out.print("Jumlah Uang       : Rp.");
        buy.setUang(buy.inputData().nextInt());

        //while perulangan membuat lebih 1 statement
        while(buy.bayar()>buy.getUang()){
             System.out.println("Maaf Uang Anda Kurang");
             System.out.print("Masukkan Uang Kembali : Rp.");
             buy.setUang(buy.inputData().nextInt());
        } 
        System.out.println("Uang kembalian : Rp."+buy.kembali());
        System.out.println("===========================================");
        System.out.println("               Terima Kasih                ");
        System.out.println("===========================================");
    }

}
