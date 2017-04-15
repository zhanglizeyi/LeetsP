import java.util.*;


public class usingTwoDFindwords{

	public boolean isMatch(String a, String b){
		if(a.length() != b.length()) return false;

		char[][] find = new char[a.length()][b.length()];
		int[] store = new int[b.length()];

		for(int i=0; i<a.length(); i++){
			int count = 0;
			char temp = find[i][count];
			while(count < b.length()){
				if(temp == find[i][count])
					store[count] = 1;
				count++;
			}
		}

		for(int i=0; i<store.length; i++){
			if(store[i] != 1)
				return false;
		}

		return true;
	}

	public static void main(String[] arg){

		usingTwoDFindwords test = new usingTwoDFindwords();
		String loop = "laop";
		String book = "book";

		System.out.println(test.isMatch(loop, book));
	}
}