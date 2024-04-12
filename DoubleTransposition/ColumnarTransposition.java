package DoubleTransposition;

import java.util.Arrays;
public class ColumnarTransposition {

    // Encryption function
    public static String encrypt(String plaintext, String keywordCols) {
        keywordCols = keywordCols.replaceAll("\\s+", "").toUpperCase();

        int rreshtat = (int) Math.ceil((double) plaintext.length() / keywordCols.length());
        char[][] matrica = new char[rreshtat][keywordCols.length()];
        int index = 0;

        for (int i = 0; i < rreshtat; i++) {
            for (int j = 0; j < keywordCols.length(); j++) {
                if (index < plaintext.length()) {
                    matrica[i][j] = plaintext.charAt(index++);
                } else {
                    matrica[i][j] = ' ';
                }
            }
        }

        char[] sortedKeyword = keywordCols.toCharArray();
        Arrays.sort(sortedKeyword);
        int[] sortedIndexes = new int[keywordCols.length()];
        for (int i = 0; i < keywordCols.length(); i++) {
            sortedIndexes[i] = keywordCols.indexOf(sortedKeyword[i]);
        }

        StringBuilder ciphertext = new StringBuilder();
        for (int j = 0; j < keywordCols.length(); j++) {
            int col = sortedIndexes[j];
            for (int i = 0; i < rreshtat; i++) {
                ciphertext.append(matrica[i][col]);
            }
        }

        return ciphertext.toString();
    }
}