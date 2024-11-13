import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;


        System.out.println("=======================================");
        System.out.println("         Kalkulator Zakat Maal");
        System.out.println("=======================================");
        System.out.print("Masukkan Nama Penerima: ");
        String namaPenerima = input.nextLine();
        System.out.println("=======================================");
        System.out.println("Penerima " + namaPenerima);
        
        

        

        do {
            System.out.println("=======================================");
            System.out.print("Masukkan Nama Muzaki: ");
            String namaMuzaki = input.nextLine();
            System.out.print("Masukkan Jumlah Harta: Rp.");
            double jumlahUang = input.nextDouble();
            input.nextLine(); 

            Muzaki muzaki = new Muzaki(namaMuzaki, jumlahUang);
            double zakat = muzaki.hitungZakat();

            if (zakat > 0) {
                System.out.println("Hasil Zakat: Rp." + String.format("%,.0f", zakat));
                Penerima penerima = new Penerima(namaPenerima, zakat);
                System.out.println("Zakat sebesar Rp." + String.format("%,.0f", penerima.getZakatDiterima()) + " diberikan kepada " + penerima.getNama());
                
            } else {
                System.out.println("Anda tidak wajib membayar zakat.");
            }

            System.out.println("=========================================");
            System.out.println("1. Hitung lagi");
            System.out.println("2. Selesai");
            System.out.print("Masukan Pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine();

        } while (pilihan == 1);

        System.out.println(" ");
        System.out.println("=============== BATAS SUCI ===============");
        System.out.println(" ");
        System.out.println("            PROGRAM CREATED BY");
        System.out.println("          MUHAMMAD TAUFIK HIDAYAT");
        System.out.println("                 23533739");
        System.out.println(" ");
    }
}
