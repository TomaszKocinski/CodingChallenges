package com.company.codewars.simpleencryption;

/**
 * @author: tkocinski on 29.12.2017 <tomasz.kocinski@cov.gov.pl>
 */
public class AlternatingSplit {
    String encrypt(final String text, final int n) {
        if (text == null) return null;
        String encryptedText = text;
        for (int i = 0; i < n; i++) {
            encryptedText = encryptSingleTime(encryptedText);
        }
        return encryptedText;
    }

    private String encryptSingleTime(String text) {
        StringBuilder evenChars = new StringBuilder();
        StringBuilder unEvenChars = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                unEvenChars.append(text.charAt(i));
            } else {
                evenChars.append(text.charAt(i));
            }
        }
        return evenChars.toString() + unEvenChars.toString();
    }

    String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null) return null;
        String text = encryptedText;
        for (int i = 0; i < n; i++) {
            text = decryptSingleTime(text);
        }
        return text;
    }

    private String decryptSingleTime(String textToDecrypt) {
        Integer placeToSplit = ((Double) Math.ceil(textToDecrypt.length() / 2.0)).intValue();

        String evenChars = textToDecrypt.substring(placeToSplit);
        String unEvenChars = textToDecrypt.substring(0, placeToSplit);
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < decryptedText.length(); i++) {
            if (i % 2 == 0) {
                //unEvenChars.append(textToDecrypt.charAt(i));
            } else {
                //evenChars.append(textToDecrypt.charAt(i));
            }
        }
        return evenChars.toString() + unEvenChars.toString();
    }

    public static void main(String[] args) {
        AlternatingSplit alternatingSplit = new AlternatingSplit();
        System.out.println(alternatingSplit.encrypt("AaAaAaAaBbBb1 2 3 456", -1));
        System.out.println(alternatingSplit.encrypt("AaAaAaAaBbBb1 2 3 456", 0));
        System.out.println(alternatingSplit.encrypt("AaAaAaAaBbBb1 2 3 456", 1));
        System.out.println(alternatingSplit.encrypt("AaAaAaAaBbBb1 2 3 456", 2));
        System.out.println(alternatingSplit.encrypt("This is a test!", 1));
        System.out.println(alternatingSplit.encrypt("This is a test!", 2));
        System.out.println(alternatingSplit.encrypt("", 2));
        System.out.println(alternatingSplit.encrypt(null, 2));
    }
}
