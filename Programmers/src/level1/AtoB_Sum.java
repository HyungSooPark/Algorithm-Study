package level1;

public class AtoB_Sum {

	public static void main(String[] args) {
		AtoB_Sum sum = new AtoB_Sum();
		
		System.out.println(sum.solution(3, 5));
		System.out.println(sum.solution(3, 3));
		System.out.println(sum.solution(5, 3));
	}
	
	public long solution(int a, int b) {
		long answer=0;
		
		for(int i=Math.min(a, b);i<=Math.max(a, b);i++) {
			answer += i;
		}
		
		return answer;
	}
}
