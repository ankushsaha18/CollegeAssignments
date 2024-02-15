public class Q6a {
    public static void main(String[] args) {
        String s = "Kaisa hai bhai";
        System.out.println(countOccurence(s, 'a'));
    }

    public static int countOccurence(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
