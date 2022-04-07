package com.dd.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import com.dd.data.Book;
import com.dd.data.DigitalDiogenesManager;
import com.dd.data.GeekStuff;
import com.dd.data.Platform;
import com.dd.data.Videogame;

public class DigitalDiogenesManager {

	List<GeekStuff> geekStuff = new ArrayList<>();
	public void findStuffByName(String name) {
		Stream<GeekStuff> stuffStream = geekStuff.stream();
		//stuffStream.filter(name -> ((List<GeekStuff>) name).contains(name))
		//.forEach(System.out::print);
		;
		//return geekStuff.stream().filter(name -> name.contains(name)).forEach(System.out::println);
	}
	
	/*public List<GeekStuff> findStuffByName(String name) {
		Stream<GeekStuff> stuffStream = geekStuff.stream();
		return stuffStream.filter((GeekStuff g) -> g.getName().contains(name))
				                .forEach((GeekStuff g) ->System.out::println);
				
				                            //.collect(Collectors.groupingBy((GeekStuff g) -> g.getName())));
                                            //.forEach((GeekStuff g) ->System.out::println);
			          
	}*/
	
	public int gamesByPlatform(Platform platform, List<Videogame> videogames) {
		int count = 0;

		try {
			for (int i = 0; i < videogames.size(); i++) {
				if (platform.equals(platform))
					count++;
			}
			count++;
		} catch (NullPointerException npe) {
			System.out.println("Null Pointer Exception");
		}
		return count;
	}
	
	
	public void printGamesByPlatform (Platform platform) {
		System.out.printf("I have " + gamesByPlatform(platform, null) + " games for " + platform);
	}
	
	/*public int howMuchDiogenes() {
		return geekStuff.size();
	}*/
	
	public <T> int howMany(List<T> geekStuff) {
		int count = 0;
		for (T gs : geekStuff) {
			count++;
		}
		return count;
	}
	
	public <T> ArrayList<T> getTops(int quantity) {
		ArrayList<T> geekStuff = new ArrayList<>();

		if (quantity < geekStuff.size()) {

			for (int i = 0; i < quantity; i++) {
				geekStuff.add(geekStuff.get(i));
			}
		} else {
			System.out.println("You're asking for more elements than I actually have in my collection. ");
		}
		return geekStuff;
	}
	
	/*public int startedStuff(String name) {
		int count = 0;
		
		if ( ) count ++;
		return count;
	}
	
	
	public int completedStuff(String name) {
		int count = 0;
		
		if ( ) count++;
		
		return count; 
	}*/
	
	
}
