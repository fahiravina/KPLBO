/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author Vina
 */
public class Pemain {

    //Atribut class Pemain
    private String nama;
    private String noPunggung;

    //Method Setter Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoPunggung() {
        return noPunggung;
    }

    public void setNoPunggung(String noPunggung) {
        this.noPunggung = noPunggung;
    }
    
    

    //Method I/O
    @Override
    public String toString() {
        return nama + "#" + noPunggung;

    }

}
