import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class ClosestLocations {

	public static void main(String[] args) {
		Random rand = new Random();
		List<List<Integer>> allLocations = new ArrayList<List<Integer>>();
		int x = rand.nextInt(10);
		int y = rand.nextInt(10);
		//Auto-generate ArrayList items
		for(int i = 0; i < 10; i++) {
			x = rand.nextInt(10);
			y = rand.nextInt(10);
			allLocations.add(0, Arrays.asList(x,y));
		}
		allLocations = ClosestLocations(allLocations, 10);
		
		for(int i = 0; i < allLocations.size(); i++) {
			System.out.println(allLocations.get(i));
		}
	}
	private static List<List<Integer>> ClosestLocations(List<List<Integer>> allLocations, int amountDisplayed){
		List<List<Integer>> closest = new ArrayList<List<Integer>>();
		double pythag = 0;
		double checkNext = 0;
		for(int i = 0; i < allLocations.size(); i++) {
			for(int j = i + 1; j < allLocations.size(); j++) {
				pythag = Math.sqrt(Math.pow(allLocations.get(i).get(0), 2) + Math.pow(allLocations.get(i).get(1), 2));
				checkNext = Math.sqrt(Math.pow(allLocations.get(j).get(0), 2) + Math.pow(allLocations.get(j).get(1), 2));
				if(pythag > checkNext) {
					Collections.swap(allLocations, i, j);
				}
				else if(pythag == checkNext);
				continue;
			}
		}
		for(int i = 0; i < amountDisplayed; i++) {
			closest.add(i, Arrays.asList(allLocations.get(i).get(0), allLocations.get(i).get(1)));
		}
		return closest;
		
	}

}
