public class sulit3 {
    public static void main(String[] args) {
        // Contoh array
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5};

        // Array untuk menyimpan frekuensi
        int[] freq = new int[array.length];

        // Loop untuk menghitung frekuensi setiap elemen
        for (int i = 0; i < array.length; i++) {
            // Mengecek apakah elemen sudah dihitung
            if (freq[i] == 0) {
                int count = 1; // Hitung 1 untuk elemen tersebut
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++; // Menambah frekuensi jika elemen yang sama ditemukan
                        freq[j] = -1; // Tandai elemen yang sudah dihitung
                    }
                }
                // Menampilkan hasil frekuensi elemen
                System.out.println(array[i] + " muncul sebanyak " + count + " kali.");
            }
        }
    }
    }

