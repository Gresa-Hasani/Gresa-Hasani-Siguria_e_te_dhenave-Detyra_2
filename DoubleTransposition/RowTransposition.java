package DoubleTransposition;

import java.util.*;

public class RowTransposition {
    
    public static String encrypt(String plaintext, String keywordCols, String keywordRows) {
        int keywordRowsLength = (int)Math.ceil((double)plaintext.length() / keywordCols.length()); 
        
        char[][] matrix = new char[keywordRowsLength][keywordCols.length()];
        
        int index = 0;
        for (int i = 0; i < keywordRowsLength; i++) {
            for (int j = 0; j < keywordCols.length(); j++) {
                if (index < plaintext.length()) {
                    matrix[i][j] = plaintext.charAt(index);
                    index++;
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }
        
        char[] keywordRowsArray = keywordRows.toCharArray();
        Arrays.sort(keywordRowsArray);
        String sortedKeywordRows = new String(keywordRowsArray);
        
        StringBuilder encryptedText = new StringBuilder();
        
        for (int i = 0; i < keywordRows.length(); i++) {
            int row = keywordRows.indexOf(sortedKeywordRows.charAt(i));
            for (int j = 0; j < keywordCols.length(); j++) {
                encryptedText.append(matrix[row][j]);
            }
        }

        return encryptedText.toString();
    }

    public static String decrypt(String encryptedText, String keywordCols, String keywordRows) {
        int keywordColsLength = keywordCols.length();
        int keywordRowsLength = (int)Math.ceil((double)encryptedText.length() / keywordColsLength); 

        char[][] matrix = new char[keywordRowsLength][keywordColsLength];

        char[] keywordRowsArray = keywordRows.toCharArray();
        Arrays.sort(keywordRowsArray);
        String sortedKeywordRows = new String(keywordRowsArray);

        int index = 0;
        for (int i = 0; i < sortedKeywordRows.length(); i++) {
            int row = keywordRows.indexOf(sortedKeywordRows.charAt(i));
            for (int j = 0; j < keywordColsLength; j++) {
                matrix[row][j] = encryptedText.charAt(index);
                index++;
            }
        }

        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < keywordRowsLength; i++) {
            for (int j = 0; j < keywordColsLength; j++) {
                decryptedText.append(matrix[i][j]);
            }
        }

        return decryptedText.toString();
    }
}
