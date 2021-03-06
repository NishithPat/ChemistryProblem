public class BreakStringInTwo {
    public static void main(String[] args) {
        String word = "phone";
        String[] doubleArray = new String[word.length()];

        for(int i = 0; i < word.length(); i++) {
            if (i + 2 > word.length()) break;
            doubleArray[i] = word.substring(i, i + 2);
        }
        for(int i = 0; i < word.length(); i++) {
            System.out.println(doubleArray[i]);
        }
    }
}
