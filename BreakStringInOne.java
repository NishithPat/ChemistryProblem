public class BreakStringInOne {
    public static void main(String[] args) {
    /*  String a = Character.toString('b');
        System.out.println(a.getClass());
        String b = "b";
        String c = "b";
        System.out.println(b.getClass());
        System.out.println(c == b); //true
        System.out.println(c == a); //false
    */

    /*  String word = "phone";
        System.out.println(word.substring(0, 1));
        String a = word.substring(0, 1);
        System.out.println(a.equals("p"));
    */
        String word = "phone";
        System.out.println(word.substring(4, 5));
        String[] singleArray = new String[word.length()];

        for(int i = 0; i < word.length(); i++) {
            singleArray[i] = word.substring(i, i + 1);
        }

        for(int i = 0; i < word.length(); i++) {
            System.out.println(singleArray[i]);
        }
    }
}
