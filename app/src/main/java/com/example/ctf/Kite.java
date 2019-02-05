package com.example.ctf;

import static com.example.ctf.Jinx.isVowel;

public class Kite {
    // function to Encrypt the string
    static String encryptString(String s, int n, int k) {
        int countVowels = 0;
        int countConsonants = 0;
        String ans = "";

        // for each substring
        for (int l = 0; l <= n - k; l++) {
            countVowels = 0;
            countConsonants = 0;

            // substring of size k
            for (int r = l; r <= l + k - 1; r++) {

                // counting number of vowels and
                // consonants
                if (isVowel(s.charAt(r)) == true) {
                    countVowels++;
                } else {
                    countConsonants++;
                }
            }

            // append product to answer.
            ans += String.valueOf(countVowels * countConsonants);
        }
        return ans;
    }
}
