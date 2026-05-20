package ControlFlowS6;

public class ForEachLoop {
    public static void main(String[] args) {
        char[] letters = {'h', 'e', 'l', 'l', 'o'};
        /*
        for (int i=0; i<letters.length; i++){
            System.out.println(letters[i]);
        }
        */

        for (char c : letters){
            System.out.println(c);
        }



    }
}
