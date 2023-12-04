/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktPBOX;

/**
 *
 * @author byazhar
 */
public class HandBag {
    private int hargaTas;
    protected String merk;
    protected int banyakTas;
    
    public void setHargaTas(int hargaTas){
        this.hargaTas = hargaTas;
    }
    public int getHargaTas(){
        return hargaTas;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getMerk(){
        return merk;
    }
    public void setBanyakTas(int banyakTas){
        this.banyakTas = banyakTas;
    }
    public int getBanyakTas(){
        return banyakTas;
    }
}
