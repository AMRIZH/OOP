/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amriz
 */
public class Kucing {
    String nama;
    String jenis;
    int berat;
    
    void kasihNama(String namaKucing) {
        nama = namaKucing;
    }
    
    void getJenis(String jenisKucing) {
        jenis = jenisKucing;
    }
    
    void getBerat(int beratKucing) {
        berat = beratKucing;
    }
    
    void kucingKepo() {
        System.out.println(
        "Nama kucing ku adalah " + nama + " dia berjenis " + jenis + " dia beratnya " + berat + " gram.");
    }
}
