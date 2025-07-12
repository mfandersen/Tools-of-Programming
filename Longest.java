public class Longest { // defines the class Longest with public access
    public static void main(String[] args) { // defines the method main belonging to the class returning nothing
        if (args.length == 0) { // checks if length is 0
            System.out.println("No parameters"); // prints the string if length is 0
            return; // ends loop if length 0
        }

        String longest = args[0]; // assumes longest is first word
        for (String w : args) { // loops through words
            if (w.length() > longest.length()) longest = w; // stores latest if it's longer than previous longest
        }
        System.out.println("Longest parameter: " + longest);} // prints longest
}
