import java.util.Scanner;
public class sulit1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Meminta jumlah siswa dari pengguna
            System.out.print("Masukkan jumlah siswa: ");
            int jumlahSiswa = scanner.nextInt();
    
            // Validasi jumlah siswa
            if (jumlahSiswa <= 0) {
                System.out.println("Jumlah siswa harus lebih dari 0.");
                return;
            }
    
            // Array untuk menyimpan nilai-nilai siswa
            double[] nilaiSiswa = new double[jumlahSiswa];
            double totalNilai = 0;
    
            // Input nilai untuk setiap siswa
            for (int i = 0; i < jumlahSiswa; i++) {
                System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
                double nilai = scanner.nextDouble();
    
                // Validasi nilai (misalnya 0-100)
                while (nilai < 0 || nilai > 100) {
                    System.out.print("Nilai tidak valid! Masukkan nilai antara 0 dan 100: ");
                    nilai = scanner.nextDouble();
                }
    
                nilaiSiswa[i] = nilai;
                totalNilai += nilai;
            }
    
            // Menghitung rata-rata nilai
            double rataRata = totalNilai / jumlahSiswa;
    
            // Menampilkan rata-rata nilai
            System.out.printf("Rata-rata nilai seluruh siswa adalah: " + rataRata);
    
            // Menutup Scanner
            scanner.close();
        }
    }

