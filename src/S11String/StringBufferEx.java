package S11String;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Welcome to ");
        buffer.append("Java");
        System.out.println(buffer);
        System.out.println(buffer.length());
        System.out.println(buffer.insert(buffer.length(), " World"));
        System.out.println(buffer.reverse()); //string buffer and builder class have these built in methods
        System.out.println(buffer.reverse());
        System.out.println(buffer.delete(0,11));


    }
}
