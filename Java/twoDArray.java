import java.util.*;


public class twoDArray{

	public static void main(String[] args){
		int[][] data = new int[3][3];

		data[0][0] = 1;
		data[0][1] = 2;
		data[0][2] = 3;
		data[1][0] = 5;
		data[1][1] = 5;
		data[1][2] = 12;
		data[2][0] = 0;
		data[2][1] = 0;
		data[2][2] = 12;
		
		for(int i=0; i<data.length; i++){
			for(int j=0; j<data.length; j++){
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}

}