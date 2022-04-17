package modern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import static java.util.stream.Collectors.toList;


public class FilteringApples {

	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(
				new Apple(15, "GREEN"),
				new Apple(20, "RED"),
				new Apple(150, "BLUE"));
		System.out.println("List inventory :"+inventory);
		

		List<Apple> greenApples = filterApples(inventory, FilteringApples::isGreenApple);
		System.out.println("greenApples : "+greenApples);
		
		List<Apple> weightApples = filterApples(inventory, FilteringApples :: isWeight);
		System.out.println("weight : "+ weightApples);
		
		//람다
		List<Apple> greenApple = filterApples(inventory, (Apple a) -> "GREEN".equals(a.getColor()));
		System.out.println("Lamda_GREENapple :"+greenApple);
		
		List<Apple> weight = filterApples(inventory, (Apple a) -> a.getWeight() <160);
		System.out.println("Lamda_Weight"+weight);
		
		//stream 순차정렬
		List<Apple> heavyAppes1 = inventory.stream().filter((Apple a) -> a.getWeight() < 160).collect(toList());
		 System.out.println("순차정렬 무게(import static java.util.stream.Collectors.toList) :"+heavyAppes1);
		//stream 병렬정렬
		List<Apple> heavyAppes2 = inventory.parallelStream().filter((Apple a) -> a.getWeight() < 160).collect(toList()); 
		 System.out.println("병렬정렬 무게(import static java.util.stream.Collectors.toList) :"+heavyAppes2);
	}
	
	public static boolean isGreenApple(Apple apple) {
		return "GREEN".equals(apple.getColor());
	}
	public static boolean isWeight(Apple apple) {
		return apple.getWeight() < 150;
	}
	
	public static List<Apple>filterApples(List<Apple> inventory, Predicate<Apple> p){
		List<Apple> result = new ArrayList<Apple>();
		for(Apple apple : inventory) {
			if(p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
	
}
