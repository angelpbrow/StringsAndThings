package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {

        // To store the count
        int cnt = 1;

        String[] words = input.split("\\s");
        // For every word

        for (int i = 0; i < words.length; i++) {

            // If it ends with the given suffix
            if (words[i].endsWith("y") || words[i].endsWith("x")) {
                cnt++;

            }



            //return null;
        }
        return cnt;
    }
    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        return null;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        return null;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        //if g exist in input AND the index before and after contains g
        //return true
        // need if (); and .charAt();
        int n = input.length();
        boolean gIsHappy = true;

        for (int i = 0; i < n; i++) {

            String tmpString = input.substring(i, i + 1);
            if (tmpString.equals("g") && i > 0 && i < n - 1) {

                if (input.charAt(i - 1) == input.charAt(i) + 1) {
                       gIsHappy = true;

                }
                // if g also exists in index before -1 and after +1 current position it is true


            }

        }
        return gIsHappy;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        // To store the count
        int l = input.length();
        int cnt = 0;

        // For every char in input

        for (int i = 0; i < l - 2; i++) {
              char tmp = input.charAt(i);
            // if same char appears three times
            if (tmp == input.charAt(i + 1) && tmp == input.charAt(i + 2)){

                cnt++;

            }



            //return null;
        }
        return cnt;


        //return null;
    }
}
