package m1.BasicSelenium;

public class Demo {
// Arpit raghuvanshi
	public static void main(String[] args) {
		String s="arpit raghuvanshi";
		char[] ch=s.toCharArray();
		int c=0;
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==ch[i+1]) {
				c++;
				System.out.println("Character is "+i);
				System.out.println("count is "+c);
			}
		}
	}
	
}
