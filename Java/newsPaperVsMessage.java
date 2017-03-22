import java.util.*;

class newsPaperVsMessage{

	boolean canCompose(String newsPaper, String message){
		Map<Character, Integer> m = new HashMap<>();
		Map<Integer, Integer> counter = new HashMap<>();

		if(newsPaper.length() < message.length()) return false;

		for(int i=0; i<newsPaper.length(); i++){
			Integer temp = m.put(newsPaper.charAt(i), i);
			counter.put(m.get(newsPaper.charAt(i)), temp);
		}

		for(int i=0; i<message.length(); i++){
			//if(counter.get(message.charAt(i)) == 0) return false;
		
			if(m.containsKey(message.charAt(i))){
				Integer temp = m.remove(message.charAt(i));
				System.out.println("remove: " + temp);
				if(temp == null) {

					return false;
				}
			}
		}

		return true;
	}


	public static void main(String[] args){

		newsPaperVsMessage n = new newsPaperVsMessage();
		String newsP = "This is this...";
		String msg = "This is this...";
		System.out.println(n.canCompose(newsP, msg));
	}
}