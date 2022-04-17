package modern_chapter1;

import java.util.Arrays;
import java.util.List;

public class AppleFomatterMain {
	

	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(new Apple(120,"Apple"), new Apple(150, "Banana"), new Apple(160, "Lemon"));
		
		prettyPrintApple(inventory, new AppleFancyFormatter());
		prettyPrintApple(inventory, new AppleSimpleFormmatter());
	}

	public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
		for(Apple apple : inventory) {
			String output = formatter.accept(apple);
			System.out.println("output : "+output);
		}
	
	}
}
