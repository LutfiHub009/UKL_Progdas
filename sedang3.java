import java.util.Random;
import java.util.Scanner;
public class sedang3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean keepPlaying = true;

        System.out.println("Selamat datang di soal emteka");
        System.out.println("soal akan diacak. Ketik 'keluar' untuk menghentikan kuis.");

        while (keepPlaying) {
            int num1 = random.nextInt(10) + 1; // Bilangan pertama (1-10)
            int num2 = random.nextInt(10) + 1; // Bilangan kedua (1-10)
            int operator = random.nextInt(3); // Operator acak: 0=perkalian, 1=pembagian, 2=modulus
            int correctAnswer = 0;
            String question = "";

            switch (operator) {
                case 0: // Perkalian
                    correctAnswer = num1 * num2;
                    question = num1 + " * " + num2 + " = ";
                    break;
                case 1: // Pembagian
                    correctAnswer = num1 / num2;
                    num1 = correctAnswer * num2; // Pastikan hasil pembagian bulat
                    question = num1 + " / " + num2 + " = ";
                    break;
                case 2: // Modulus
                    correctAnswer = num1 % num2;
                    question = num1 + " % " + num2 + " = ";
                    break;
            }

            System.out.print("Soal: " + question);
            String userInput = scanner.next();

            if (userInput.equalsIgnoreCase("keluar")) {
                keepPlaying = false;
                System.out.println("Terima kasih telah bermain!");
            } else {
                try {
                    int userAnswer = Integer.parseInt(userInput);
                    if (userAnswer == correctAnswer) {
                        System.out.println("Benar! Jawaban Anda tepat.");
                    } else {
                        System.out.println("Salah. Jawaban yang benar adalah " + correctAnswer + ".");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Masukkan angka atau 'keluar' untuk berhenti.");
                }
            }
            System.out.println();
        }
    }
}
