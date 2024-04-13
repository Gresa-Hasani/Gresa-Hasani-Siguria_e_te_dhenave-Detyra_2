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

public static String decrypt(String cipherText, String keywordCols) {
        String decryptedText = "";
        int gjatesiaKeyword = keywordCols.length();
        int gjatesiaCipherText = cipherText.length();
        int rreshtat = (int) Math.ceil((double) gjatesiaCipherText / gjatesiaKeyword);
        char[][] matrica = new char[rreshtat][gjatesiaKeyword];

        // Sort the key and store the sorted indices
        char[] sortedKeyword = keywordCols.toCharArray();
        Arrays.sort(sortedKeyword);
        int[] sortedIndexes = new int[gjatesiaKeyword];
        for (int i = 0; i < gjatesiaKeyword; i++) {
            sortedIndexes[i] = keywordCols.indexOf(sortedKeyword[i]);
        }

        // Populate the grid with ciphertext using sorted key order
        int index = 0;
        for (int j = 0; j < gjatesiaKeyword; j++) {
            int column = sortedIndexes[j];
            for (int i = 0; i < rreshtat; i++) {
                if (index < gjatesiaCipherText) {
                    matrica[i][column] = cipherText.charAt(index++);
                } else {
                    matrica[i][column] = ' ';
                }
            }
        }

        // Create the plaintext from the grid
        for (int i = 0; i < rreshtat; i++) {
            for (int j = 0; j < gjatesiaKeyword; j++) {
                decryptedText += matrica[i][j];
            }
        }

        // Remove trailing spaces from the plaintext
        return decryptedText.replaceAll("\\s+$", "");
    }