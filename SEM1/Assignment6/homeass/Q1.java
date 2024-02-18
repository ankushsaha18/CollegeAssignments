package homeass;

public class Q1 {
	public static void main(String args[]) {
		String s="Jajjvvb";
		System.out.println(firstNonRepeatCharacter(s));
	}
	public static char firstNonRepeatCharacter(String s) {
		s=s.toLowerCase();
		char ans=s.charAt(0);
		for(int i=0;i<s.length();i++) {
			boolean check=false;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					check=true;
				}
			}
			if(!check) {
				return s.charAt(i);
			}
		}
		return ans;
	}
}
