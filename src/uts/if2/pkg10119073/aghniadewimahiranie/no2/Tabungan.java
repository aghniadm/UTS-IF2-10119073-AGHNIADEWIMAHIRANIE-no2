
package uts.if2.pkg10119073.aghniadewimahiranie.no2;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah){
        jumlah = saldo - jumlah;
        return jumlah;
    }
}
