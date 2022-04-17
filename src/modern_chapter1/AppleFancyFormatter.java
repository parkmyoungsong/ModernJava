package modern_chapter1;

public class AppleFancyFormatter implements AppleFormatter{

	@Override
	public String accept(Apple apple) {
		String Characteristic = apple.getWeight() > 120 ? "뚱뚱해 " : " 날씬해 ";
		
		return "This "+Characteristic +apple.getColor()+" apple";
	}
	
}
