package level1;

public class MiddleText {

	public static void main(String[] args) {
		String s = "qwerqw";
		
		MiddleText mt = new MiddleText();
		System.out.println(mt.solution(s));
	}
	
	public String solution(String s) {
		int begin_index = (int) Math.round(s.length()/2.0)-1;
		int end_index = (int) Math.floor(s.length()/2.0+1);

		String answer = s.substring(begin_index,end_index);

		return answer;
	}

}
