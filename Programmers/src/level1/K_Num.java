package level1;
import java.util.Arrays;

public class K_Num {
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		
		K_Num kn = new K_Num();
		
		int[] answer = kn.solution(array,commands);

		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]+" ");
		}
	}
	
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		
		for(int i=0;i<answer.length;i++) {
			int[] tmp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			/*int[] tmp = new int[commands[i][1]-commands[i][0]+1];
			
			for(int j=0;j<tmp.length;j++) {
				tmp[j] = array[commands[i][0]-1+j];
			}*/
			Arrays.sort(tmp);
			
			answer[i] = tmp[commands[i][2]-1];
		}
		
		return answer;
	}
}
