/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan20_targetsaldotabungan;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Membuat Program Target Saldo Tabungan
 */
public class PBO3_10117109_Latihan20_TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int saldoA;
        int saldoT;
        int i;
        int bunga;
        int jumlahBunga;
    
        saldoA = 3500000;
        bunga  = 8;
        saldoT = 6000000; 
        
        i=1;
        while (saldoA <= saldoT) {
            jumlahBunga = saldoA*bunga/100;
            saldoA += jumlahBunga;
            
            String mataUang = String.format("Rp.%,3d", saldoA).replaceAll(","
                    + "", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
        }
            
           
        }
        
        
        
        
        
    }
    

