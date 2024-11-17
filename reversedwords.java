public class reversewords {
    public static void main(String[] args) {
        String sentence = "Hello World! This is Java.";
        
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // StringBuilder to store the result
        StringBuilder reversedSentence = new StringBuilder();
        
        // Loop through each word
        for (String word : words) {
            // Reverse the current word and append it to the result
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedSentence.append(reversedWord).append(" ");
        }
        
        // Remove the trailing space and print the result
        System.out.println(reversedSentence.toString().trim());
    }
}
