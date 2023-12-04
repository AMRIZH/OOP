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
public class Pembelian {
    HandBag pesanTas;
    Customer member;
    void pembelian(Customer anggota,HandBag Tas){
        member = anggota;
        pesanTas = Tas;
    }
    void tampilkanDataPembeli(){
        System.out.println("Data Pembeli HandBag");
        System.out.println("ID : "+member.getID());
        System.out.println("Nama : "+member.getNama());
        System.out.println("Alamat : "+member.getAlamat());
        System.out.println("Ongkir : "+member.getOngkir());
        System.out.println("Merk : "+pesanTas.getMerk());
        System.out.println("Harga : "+pesanTas.getHargaTas());
        System.out.println("Jumlah : "+pesanTas.getBanyakTas());
    }
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
