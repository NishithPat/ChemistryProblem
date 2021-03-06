import java.util.Scanner;

public class Chemistry {
  public static void main(String args[]) {
    String[] elements = { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl",
        "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr",
        "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe", "Cs",
        "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Hf", "Ta", "W",
        "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np",
        "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg",
        "Cn", "Uut", "Uuq", "Uup", "Uuh", "Uus", "Uuo" };

    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String inputWord = myScanner.next();
    String chemWord = spellWord(inputWord, elements);

    System.out.println(chemWord);

    myScanner.close();
  }

  /**
   * @param word the word that we want to re-spell using abbrevications of elements in the periodic table
   * @param elements an array that contains the abbreviations of elements in the periodic table
   * 
   * @return word re-spelled using abbreviations of elements in the periodic table
   * 
   * The spellWord function will take in two parameters, word and elements.
   * 1. Word represents the word that we want to re-spell using abbreviation of the elements from
   * the periodic table.
   * 2. Elements represents possible element abbreviations that you can use to re-spell the word
   * 
   * The function needs to return a String representing the word that you have re-sprelled
   * using abbreviations of the elements in the periodic table.
   * 
   */
  public static String spellWord(String word, String[] elements) {
    // write your code here to spell word with element abbreviations
    String[] singleArray, doubleArray, tripleArray;
    singleArray = singleArray(word);
    doubleArray = doubleArray(word);
    tripleArray = tripleArray(word);

    String Output = "";

    String firstCheck = checkWithTripleArray(tripleArray, elements);
    Output += firstCheck;
    String secondCheck = checkWithDoubleArray(doubleArray, elements);
    Output += secondCheck;
    String thirdCheck = checkWithSingleArray(singleArray, elements);
    Output += thirdCheck;

    return Output;
  }

  public static String[] singleArray(String word) {
    String[] singleArray = new String[word.length()];

    for(int i = 0; i < word.length(); i++) {
        singleArray[i] = word.substring(i, i + 1);
    }

    return singleArray;
  }

  public static String[] doubleArray(String word) {
    String[] doubleArray = new String[word.length()];

    for(int i = 0; i < word.length(); i++) {
        if (i + 2 > word.length()) break;
        doubleArray[i] = word.substring(i, i + 2);
    }

    return doubleArray;
  }

  public static String[] tripleArray(String word) {
    String[] tripleArray = new String[word.length()];

    for(int i = 0; i < word.length(); i++) {
        if (i + 3 > word.length()) break;
        tripleArray[i] = word.substring(i, i + 3);
    }

    return tripleArray;
  }

  public static String checkWithTripleArray(String[] tripleArray, String[] elements) {
    String firstCheck = "";
    for(int i = 0; i < tripleArray.length; i++) {
      for(int j = 0; j < elements.length; j++) {
        if (((elements[j]).toLowerCase()).equals((tripleArray[i]))) {
          firstCheck += elements[j];
        }
      }
    }
    return firstCheck;
  }

  public static String checkWithDoubleArray(String[] doubleArray, String[] elements) {
    String secondCheck = "";
    for(int i = 0; i < doubleArray.length; i++) {
      for(int j = 0; j < elements.length; j++) {
        if (((elements[j]).toLowerCase()).equals((doubleArray[i]))) {
          secondCheck += elements[j];
        }
      }
    }
    return secondCheck;
  }

  public static String checkWithSingleArray(String[] singleArray, String[] elements) {
    String thirdCheck = "";
    for(int i = 0; i < singleArray.length; i++) {
      for(int j = 0; j < elements.length; j++) {
        if (((elements[j]).toLowerCase()).equals((singleArray[i]))) {
          thirdCheck += elements[j];
        }
      }
    }
    return thirdCheck;
  }
}