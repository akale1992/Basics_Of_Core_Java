import java.util.Arrays;


public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "JSPIDER";
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.indexOf(s1.charAt(i))%2 == 0 ) {
				s2 = s2+ s1.charAt(i);
			} else {
				
				s2 = s2+ Character.toLowerCase(s1.charAt(i));
			}
		}
		System.out.println(s2);
		StringCheck.charcount();
		
}
	public static void charcount() {
		String s1 = "Ashish maroti kale";
		char[] ch = s1.toCharArray();
		Arrays.sort(ch);
		int count =1;
	for (int i = 1; i < ch.length; i++) {
		count=0;
		if (ch[i-1]==ch[i]) {
			count++;
			
		}else{
		System.out.println(ch[i] +" is: "+count);
		
		}
		
	}
		
	}

}
