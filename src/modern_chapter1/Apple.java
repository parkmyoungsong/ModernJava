package modern_chapter1;


public class Apple {
	private String Color="";
	int Weight = 0;
	public Apple(int weight, String color) {
		super();
		Color = color;
		Weight = weight;
	}
	
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}


	
	@Override
	public String toString() {
		return "Apple [Color=" + Color + ", Weight=" + Weight + "]";
	}
	

}
