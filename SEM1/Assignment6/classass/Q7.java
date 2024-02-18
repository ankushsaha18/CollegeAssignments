package classass;

public class Q7 {
	public static void main(String[] args) {
        String test = "Welcome";
        System.out.println(count(test));
    }

    public static int count(String str) {
        str = str.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowelCount++;
        }
        return vowelCount;
    }
}
