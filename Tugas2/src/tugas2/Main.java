package tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan, ulang = 1;
        do{
            System.out.println("\nMENU UTAMA");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("3. Exit");
            System.out.print("Pilih \t : ");
            pilihan = input.nextInt();

            switch(pilihan){
                case 1:
                {
                    int panjang, lebar, tinggi;
                    System.out.print("Input Panjang\t:");
                    panjang = input.nextInt();
                    System.out.print("Input Lebar\t:");
                    lebar = input.nextInt();
                    System.out.print("Input Tinggi\t:");
                    tinggi = input.nextInt();
                    Balok balok = new Balok(tinggi, panjang, lebar);
                    System.out.println("Luas Persegi Panjang\t\t= " + balok.luas());
                    System.out.println("Keliling Persegi Panjang\t= " + balok.keliling());
                    System.out.println("Volume Balok\t\t\t= " + balok.volume());
                    System.out.println("Luas Permukaan Balok\t\t= " + balok.luasPermukaan());
                    break;
                }
                case 2:
                {
                    int tinggi, jariJari;
                    System.out.print("Input Tinggi\t:");
                    tinggi = input.nextInt();
                    System.out.print("Input Jari Jari\t:");
                    jariJari = input.nextInt();
                    Tabung tabung = new Tabung(tinggi, jariJari);
                    System.out.println("Luas Lingkaran\t\t= " + tabung.luas());
                    System.out.println("Keliling Lingkaran\t= " + tabung.keliling());
                    System.out.println("Volume Tabung\t\t= " + tabung.volume());
                    System.out.println("Luas Permukaan Tabung\t= " + tabung.luasPermukaan());
                    break;
                }
                case 3:
                    ulang = 0;
                    break;
                default:
                    System.out.println("\nOpsi tidak ada, silahkan coba lagi!\n");
            }
            if(ulang != 0){
                System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
                ulang = input.nextInt();
            }
        } while(ulang != 0);
    }
}