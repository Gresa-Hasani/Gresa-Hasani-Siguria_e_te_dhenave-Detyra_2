package KeyRunningCipher;
class Encryption {
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




    public static String encrypt(String plaintext, String key) {
        StringBuilder cipherText = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            char keyChar = key.charAt(i % key.length());

            if (Character.isLetter(ch)) {
                cipherText.append(shift(ch, keyChar));
            } else {
                cipherText.append(ch);
            }
        }
        return cipherText.toString();
    }
}


