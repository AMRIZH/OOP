/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktPBOX;

/**
 *
 * @author buy_comp
 */
public class Customer {
    private int ID;
    private String Nama;
    private String Alamat;
    private int Ongkir;
    public void setID(int ID){
        this.ID = ID;
    }
    public int getID(){
        return ID;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public String getNama(){
        return Nama;
    }
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    public String getAlamat(){
        return Alamat;
    }
    public void setOngkir(int Ongkir){
        this.Ongkir = Ongkir;
    }
    public int getOngkir(){
        return Ongkir;
    }
}
