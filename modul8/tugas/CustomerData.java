package modul8.tugas;
import java.sql.Date;

public class CustomerData {
  private String name;
  private Date ttl;
  private String address;
  private String job;
  private double gaji;

  public CustomerData(String name, String address, String job){
    this.name = name;
    this.address = address;
    this.job = job;
    System.out.println("The customer "+name+" live in "+address+" and work as "+job);
  }

  public CustomerData(String name, double gaji){
    this.name = name;
    this.gaji = gaji;
    System.out.println("The customer "+name+" has salary of Rp."+gaji);
  }

  public CustomerData(String name, String job, double gaji){
    this.name = name;
    this.job = job;
    this.gaji = gaji;
    System.out.println("The customer "+name+" is a "+job+" with salary of Rp."+gaji);
  }

  public static void main(String[] args) {
    CustomerData c1 = new CustomerData("Ahmad", "Jakarta", "Engineer");
    CustomerData c2 = new CustomerData("Budi", "Surabaya", "Doctor");
    CustomerData c3 = new CustomerData("Cici", 5000000);
    CustomerData c4 = new CustomerData("Dedi", "Salesman", 6000000);
    CustomerData c5 = new CustomerData("mahmud", 50000);
    CustomerData c6 = new CustomerData("Pandu", "Bandung", "Policeman");
    CustomerData c7 = new CustomerData("Tiara", "Malang", "Teller");
    CustomerData c8 = new CustomerData("Rendy", 6000000);
    CustomerData c9 = new CustomerData("Zoro", 4000000);
    CustomerData c10 = new CustomerData("Luffy", "pirate", 1200000);
  }
}
