// membuat perulangan aku anak moklet,anak wikusama,anak angkatan 33
public class Mudah3 {
    public static void main(String[] args) {
        for (int i = 50; i >= 1; i--) { // Perulangan dari 50 ke 1
            if (i == 1) {
                System.out.println(i + ". saya senang");
            }
            else if (i % 3 == 0) {
                System.out.println(i + ". saya anak angkatan 33");
            } else if (i % 3 == 2) {
                System.out.println(i + ". saya anak moklet");
            } else {
                System.out.println(i + ". saya anak wikusama");
            } 
        }
    }
}
