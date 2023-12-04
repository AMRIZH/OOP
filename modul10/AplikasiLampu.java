package modul10;

import java.util.Scanner;

public class AplikasiLampu {
  public static void main(String[] args) {
    Lampu lampu = new Lampu();
    Scanner sc = new Scanner(System.in);
    lampu.statusLampu = lampu.setSaklar(0);
    // System.out.println("Status lampu = " + lampu.statusLampu + "\nKetikkan");
    System.out.println("Ketik\n 1 untuk menyalakan lampu \n-1 untuk mematikan lampu\n 0 untuk meredupkan lampu");
  
  while (true) {
    System.out.println("\nStatus lampu = " + lampu.statusLampu);
    System.out.println("Masukkan pilihan : "); int input = sc.nextInt();

    if(input==-1){
      lampu.matikanLampu();
    } else if(input==1){
      lampu.nyalakanLampu();
    } else if(input==0){
      lampu.lampuRedup();
    } else {
      System.out.println("Keluar dari program lampu");
      break;
    }
  }
}
}
