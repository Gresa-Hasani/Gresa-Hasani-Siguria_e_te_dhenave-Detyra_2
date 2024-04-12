package KeyRunningCipher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the plaintext: ");
        String plaintext = scanner.nextLine();

        System.out.println("Enter the key: ");
        String key = scanner.nextLine();

        String encryptedText = Encryption.encrypt(plaintext, key);
        System.out.println("Encrypted text: " + encryptedText);

        String decryptedText = Decryption.decrypt(encryptedText, key);
        System.out.println("Decrypted text: " + decryptedText);

        scanner.close();
    }
}

