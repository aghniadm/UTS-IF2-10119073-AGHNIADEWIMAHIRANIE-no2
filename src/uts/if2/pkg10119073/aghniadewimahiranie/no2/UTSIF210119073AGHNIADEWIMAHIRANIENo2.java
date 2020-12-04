package uts.if2.pkg10119073.aghniadewimahiranie.no2;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 *
 */
public class UTSIF210119073AGHNIADEWIMAHIRANIENo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukan Saldo Awal : ");
        int awal = scan.nextInt();
       
        Tabungan tab = new Tabungan(awal);
        System.out.print("Jumlah uang yang diambil : ");
        int ambil = scan.nextInt();
        System.out.println("Saldo Anda Sekarang : "+ tab.ambilUang(ambil));
    }

}
