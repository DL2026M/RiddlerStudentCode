/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: David Lutch
 */
// TODO: Complete the decryptOne() function.
public class Riddler { ;
    public String decryptOne(String encrypted) {
        String decrypted = "";
        // Runs through every letter in the encrypted message
        for (int i = 0; i < encrypted.length(); i++) {
            char c = encrypted.charAt(i);
            // Checks for punctuations in the message
            if (!Character.isAlphabetic(encrypted.charAt(i))) {
                decrypted += encrypted.charAt(i);
            }
            else if (Character.isUpperCase(encrypted.charAt(i))) {
                // Goes 9 letters to the right in the alphabet
                char p = (char) (((int) c + 9 - 'A') % 26 + 'A');
                decrypted += p;
            }
            else if (Character.isLowerCase(encrypted.charAt(i))) {
                char p = (char) (((int) c + 9 - 'a') % 26 + 'a');
                    decrypted += p;
            }
        }
        return decrypted;
    }
    // TODO: Complete the decryptTwo() function.
    public String decryptTwo(String encrypted) {
        String decrypted = "";
        // Getting rid of all the spaces
        String[] numbers = encrypted.split(" ");
        for (String number : numbers) {
            // Turning the string into an int
            char c = (char) Integer.parseInt(number);
            decrypted += c;
        }
        return decrypted;
    }
    // TODO: Complete the decryptThree() function.
    public String decryptThree(String encrypted) {
        String decrypted = "";
        // Moves in increments of 8
        for (int i = 0; i < encrypted.length(); i += 8) {
            String number = encrypted.substring(i, i + 8);
            // Turns binary base 2 system into an int
            char c = (char) Integer.parseInt(number, 2);
            decrypted += c;
        }
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
