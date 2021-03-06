public class BreakStringInThree {
    public static void main(String[] args) {
        String word = "phone";
        String[] tripleArray = new String[word.length()];

        for(int i = 0; i < word.length(); i++) {
            if (i + 3 > word.length()) break;
            tripleArray[i] = word.substring(i, i + 3);
        }
        for(int i = 0; i < word.length(); i++) {
            System.out.println(tripleArray[i]);
        }
    }  
}
