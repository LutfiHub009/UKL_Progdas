import java.util.Scanner;
public class sedang2 {
            // fungsi untuk menghitung volume tabung
            static void hitungVolume(double r, double t){
                double Volume = Math.PI * r * r *t;
                System.out.println("Volume tabung: "+ Volume);
            }

            // fungsi utama untuk memasukan input pengguna
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        
            System.out.println("masukan jari2 tabung: ");
            double r= input.nextDouble();
            System.out.println("masukan tinggi tabung: ");
            double t= input.nextDouble();
            hitungVolume(r, t);  //memanggil hitungvolume untuk menunjukkan hasil volume
        }
    }
    