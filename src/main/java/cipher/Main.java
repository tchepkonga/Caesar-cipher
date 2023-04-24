package cipher;

public class Main {
    public static void main(String[] args) {
        String message = "MANCHESTER UNITED";
        int key = 5;

        String encrypted = CaesarCipher.encrypt(message, key);
        String decrypted = CaesarCipher.decrypt(encrypted, key);

        System.out.println("Original message: " + message);
        System.out.println("Encrypted message: " + encrypted);
        System.out.println("Decrypted message: " + decrypted);
    }
}
