package strings;

/*
 Given a string aabbccdd, compress it into
 a2b2c2d2.  If the compressed string is longer than the
 original string, return the original.
 */
public class StringCompresser {

    public String runAllSolutions(String input) {
        return this.solution1(input);
    }

    /* Medium-optimal solution
       Avoids repeated concats with stringbuilder but still builds the compressed string
       before checking if it is longer than the original.
     */
    public String solution1(String input) {
        if(input == null) return null;

        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=0; i<chars.length; i++) {
            if(i+1 == chars.length || chars[i] != chars[i+1]) {
                sb.append(chars[i]);
                sb.append(count);
                count = 1;
            }
            if(i+1 < chars.length && chars[i] == chars[i+1]) {
                count++;
            }
        }
        String result = sb.toString().length() >= input.length() ? input : sb.toString();
        return result;
    }
}
