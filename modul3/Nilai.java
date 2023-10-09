/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amriz
 */
public class Nilai {
    int nilaiUTS;
    int nilaiUAS;
    int nilaiTugas;
    double nilaiTotal;
    
    //method non void
    public int setUTS(int nilaiUTS) {
        return this.nilaiUTS = nilaiUTS;
    }

    public int setUAS(int nilaiUAS) {
        return this.nilaiUAS = nilaiUAS;
    }

    public int setTugas(int nilaiTugas) {
        return this.nilaiTugas = nilaiTugas;
    }

    //method void
    public void rincianNilai(int nilaiUTS, int nilaiUAS,int nilaiTugas){
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiTugas = nilaiTugas;
        this.nilaiTotal = (nilaiTugas + nilaiUAS + nilaiUTS)/3 ;
        System.out.println("Nilai UTS : " + nilaiUTS + "\nNIlai UAS : " + nilaiUAS + "\nNilai Tugas : " + nilaiTugas);
        System.out.println("Total nilai : " + nilaiTotal + "\n ---------------------------------------");
    }
    
    public static void main (String [] args) { 
        //membuat object
        Nilai abdul = new Nilai();
        
        //memanggil method void
        abdul.rincianNilai(70, 80, 90);
        
        //memanggil method non-void
        abdul.setUAS(45);
        System.out.println("Nilai UAS : " + abdul.nilaiUAS);
        abdul.setUTS(85);
        System.out.println("Nilai UTS : " + abdul.nilaiUTS);
        abdul.setTugas(97);
        System.out.println("Nilai Tugas : " + abdul.nilaiTugas);
        System.out.println("Tota nilai : " + (abdul.nilaiUAS+abdul.nilaiUTS+abdul.nilaiTugas)/3 );

    }
    
    
}

