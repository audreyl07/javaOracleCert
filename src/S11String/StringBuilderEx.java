package S11String;

public class StringBuilderEx {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Welcome to ");
        builder.append("Java");
        System.out.println(builder);
        System.out.println(builder.length());
        System.out.println(builder.insert(builder.length(), " World"));
        System.out.println(builder.reverse()); //string builder and builder class have these built in methods
        System.out.println(builder.reverse());
        System.out.println(builder.delete(0,11));

        //to rename all the selected same word, then use shift + F6

    }
}
