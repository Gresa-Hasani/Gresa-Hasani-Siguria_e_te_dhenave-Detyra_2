package DoubleTransposition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Merr plaintext nga useri
        System.out.print("Shkruaj plaintext-in: ");
        String plaintext = input.nextLine().toLowerCase().replaceAll("\\s+", ""); // Hiq hapësirat dhe shndërro në lowercase

        // Merr keywordCols nga useri
        System.out.print("Shkruaj keywordCols-in: ");
        String keywordCols = input.nextLine().toLowerCase();

        // Përcakto gjatësinë e keywordRows
        int keywordRowsLength = (int)Math.ceil((double)plaintext.length() / keywordCols.length());
        System.out.println("Gjatësia e pritshme e keywordRows është: " + keywordRowsLength);

        // Merr keywordRows nga useri
        System.out.print("Shkruaj keywordRows-in: ");
        String keywordRows = input.nextLine().toLowerCase();

        // Enkripto plaintext-in
        String encryptedText1 = RowTransposition.encrypt(plaintext,keywordCols,keywordRows);
        System.out.println("Teksti i enkriptuar me Row Transposition: " + encryptedText1);

        String encryptedText2 = ColumnarTransposition.encrypt(encryptedText1,keywordCols);
        System.out.println("Teksti i enkriptuar me Columnar Transposition: " + encryptedText2);

        String decryptedText1 = ColumnarTransposition.decrypt(encryptedText2, keywordCols);
        System.out.println("Teksti i dekriptuar me Columnar Transposition: " + decryptedText1);

        String decryptedText2 = RowTransposition.decrypt(decryptedText1, keywordCols, keywordRows);
        System.out.println("Teksti i dekriptuar me Row Transposition: " + decryptedText2);

        input.close();
    }

}
