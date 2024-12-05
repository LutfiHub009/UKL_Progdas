import java.util.Scanner;
public class Mudah1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // menyimpan ketentuan harga,jarak dan volume
        int jarak = 10;
        int harga1= 4250;   int harga2 = 6000; int harga3= 50000;
        int volume = 100;

        
        // input berat barang dan jarak tempuh
        System.out.println("masukan berat paket: ");
        int BerPaket = input.nextInt();
        System.out.println("masukan jarak tempuh: ");
        int JarTem = input.nextInt();

        // input Volume barang
        System.out.println("masukan tinggi barang: ");
        int t = input.nextInt();
        System.out.println("masukan lebar barang: ");
        int l = input.nextInt();
        System.out.println("masukan panjang barang: ");
        int p = input.nextInt();


        // menghitung volume barang
        int vBarang = p*l*t;

        // percabangan ketentuan yang diminta
        if(JarTem <= jarak){
            int hasil = harga1* BerPaket;
            System.out.println("");
            if(vBarang > volume){
                int hasilFinal = hasil + harga3;
                System.out.println("total biaya Rp. " +hasilFinal);
            }else{
                System.out.println("total biaya Rp. " +hasil);
            }
        }else if(JarTem > jarak){
            int hasil2 = harga2* BerPaket;
            if(vBarang > volume){
                int hasilFinal = hasil2 + harga3;
                System.out.println("total biaya Rp. " +hasilFinal);
            }else{
                System.out.println("total biaya Rp. " +hasil2);
            }
        }

    }
}
