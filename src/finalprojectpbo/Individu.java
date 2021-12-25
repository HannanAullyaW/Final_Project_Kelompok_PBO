package finalprojectpbo;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;

import java.util.ArrayList;

public class Individu extends Nasabah {
    private LongProperty nik;
    private LongProperty npwp;

    public Individu(Integer id, String nama, String alamat, Long nik, Long npwp, ArrayList<Rekening> rekening) {
        super(id, nama, alamat,rekening);
        this.nik = new SimpleLongProperty(nik);
        this.npwp = new SimpleLongProperty(npwp);
    }

    public Individu(Integer id, String nama, String alamat, Long nik, Long npwp, Rekening rekenings) {
        super(id, nama, alamat, rekenings);
        this.nik = new SimpleLongProperty(nik);
        this.npwp = new SimpleLongProperty(npwp);
    }

    public Long getNik() {
        return nik.get();
    }

    public LongProperty nikProperty() {
        return nik;
    }

    public void setNik(long nik) {
        this.nik.set(nik);
    }

    public Long getNpwp() {
        return npwp.get();
    }

    public LongProperty npwpProperty() {
        return npwp;
    }

    public void setNpwp(long npwp) {
        this.npwp.set(npwp);
    }

    @Override
    public void print(){
        System.out.println("nik     : " + getNik());
        System.out.println("npwp     : " + getNpwp());
        System.out.println("nama     : " + getNama());
        System.out.println("alamat   : " + getAlamat());
        System.out.println("rekening : ");
        System.out.printf("no %-10s %s\n", "no rek", "saldo");
        int i = 1;
        for (Rekening rek : rekening){
            System.out.printf("%d. %-10d %.2f\n", i, rek.getNoRekening(), rek.getSaldo());
            i++;
        }
        System.out.println();
    }
}
