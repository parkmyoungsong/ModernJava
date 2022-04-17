package modern_chapter1;

public class AppleSimpleFormmatter implements AppleFormatter{

	@Override
	public String accept(Apple apple) {		
		return "An apple of "+apple.getWeight()+"g";
	}
	
}
