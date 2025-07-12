public class Longest { // defines the class Longest with public access
    public static void main(String[] args) { // defines the method main belonging to the class returning nothing
        if (args.length == 0) {
            System.out.println("No parameters");
            return;
        }

        String longest = args[0];
        for (String w : args) {
            if (w.length() > longest.length()) longest = w;
        }
        System.out.println("Longest parameter: " + longest);}
}
