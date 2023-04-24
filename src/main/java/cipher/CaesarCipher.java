package cipher;


public class CaesarCipher {
    public static String encrypt(String message, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if (Character.isLetter(ch)) {
                ch = (char) (((ch - 'A' + key) % 26) + 'A');
            }

            result.append(ch);
        }

        return result.toString();
    }

    public static String decrypt(String message, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if (Character.isLetter(ch)) {
                ch = (char) (((ch - 'A' - key + 26) % 26) + 'A');
            }

            result.append(ch);
        }

        return result.toString();
    }
}
