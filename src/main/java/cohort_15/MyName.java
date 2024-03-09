package cohort_15;

public class MyName {
    public static void main(String[] args) {
        String username = "Christopher";
        System.out.println(username.length());

        //1- CHRISTOPHER - MAKE IT ALL CAPITAL LETTERS AND PRINT
        System.out.println(username.toUpperCase());

        //2 _ Extract the word stop from the string Christopher
        System.out.println(username.substring(4, 8));

        //3 - Extract top but REVERSE it to print pot
        String word = username.substring(5, 8);
        StringBuilder newWord = new StringBuilder();
        newWord.append(word).reverse();
        System.out.println(newWord);
    }

}
