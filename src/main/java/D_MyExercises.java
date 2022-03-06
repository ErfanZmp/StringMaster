public class D_MyExercises {
    /**
     * <p>Counts how many words are in a sentence</p>
     *
     * @param input String containing a Full sentence
     * @return how many words are in the given input
     */
    public static int words(String input)
    {
        return input.split(" ").length;
    }

    /**
     * <p>Reverses The String</p>
     *
     * @param input String to be Reversed
     * @return Reversed String
     */
    public static String reverse(String input)
    {
        StringBuilder out = new StringBuilder();
        for (int i = input.length()-1; i >= 0 ; i--) {
            out.append(input.charAt(i));
        }
        return out.toString();
    }

    /**
     * <p>Uppers First letter of words and lower rest of them</p>
     *
     * @param input String to be Case Fixed
     * @return Fixed String
     */
    public static String FixCasing(String input)
    {
        String[] lowered = input.toLowerCase().split(" ");
        for (int i = 0;i < lowered.length;i++) {
            char[] chars = lowered[i].toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            lowered[i] = String.valueOf(chars);
        }
        return String.join(" ",lowered);
    }
}
