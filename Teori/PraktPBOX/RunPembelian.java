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
public class RunPembelian {
    public static void main(String[] args) {
        Customer pembeli = new Customer();
        HandBag tas = new HandBag();
        Pembelian order = new Pembelian();
        
        pembeli.setID(123);
        pembeli.setNama("Roni Kurniawan");
        pembeli.setAlamat("Kartasura");
        pembeli.setOngkir(10000);
        tas.setMerk("Eiger");
        tas.setHargaTas(400000);
        tas.setBanyakTas(10);
        
        order.pembelian(pembeli, tas);
        order.tampilkanDataPembeli();
    }
}
