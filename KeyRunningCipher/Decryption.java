package KeyRunningCipher;

public class Decryption {
    private static char shift(char ch, char keyChar) {
        int keyOffset;
        int offset;
        if(Character.isUpperCase(keyChar)){
            keyOffset = keyChar - 'A';
            offset = 'A';
        }
        else{
            keyOffset = keyChar - 'a';
            offset = 'a';
        }

        int shifted = (ch - offset + keyOffset) % 26;
        if (shifted < 0) {
            shifted = shifted + 26;
        }
        return (char) (shifted + offset + 1);
    }

    public static String decrypt(String cipherText, String key) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < cipherText.length(); i++) {
            char ch = cipherText.charAt(i);
            char keyChar = key.charAt(i % key.length());

            if (Character.isLetter(ch)) {
                int shiftValue;
                if (Character.isUpperCase(ch)) {
                    shiftValue = ((26 - 1 - (keyChar - 'A')) % 26) - 1;
                } else {
                    shiftValue = ((26 - 1 - (keyChar - 'a')) % 26) - 1;
                }
                decryptedText.append(shift(ch, (char) ('a' + shiftValue)));
            } else {
                decryptedText.append(ch);
            }
        }
        return decryptedText.toString();
    }

}