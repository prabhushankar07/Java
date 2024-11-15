public class StringConcat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + " " + str2;  // Concatenate with a space
        System.out.println(result);  // Output: Hello World


        String str1 = "Hello";
        String str2 = "World";
        String result = str1.concat(" ").concat(str2);
        System.out.println(result);  // Output: Hello World


        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println(sb.toString());  // Output: Hello World
    }
}