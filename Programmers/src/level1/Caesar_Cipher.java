package level1;

public class Caesar_Cipher {

	public static void main(String[] args) {
		Caesar_Cipher cc = new Caesar_Cipher();
		
		System.out.println(cc.solution("AB", 1));
		System.out.println(cc.solution("z", 1));
		System.out.println(cc.solution("a B z", 4));
	}
	
	public String solution(String s,int n) {
		char[] tmp = s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			if(Character.isLowerCase(tmp[i])) {
				tmp[i] = (char)((tmp[i]+n-'a')%26+'a');
			}
			else if(Character.isUpperCase(tmp[i])) {
				tmp[i] = (char)((tmp[i]+n-'A')%26+'A');
			}
		}
		String answer=String.copyValueOf(tmp);
		
		return answer;
	}

}
