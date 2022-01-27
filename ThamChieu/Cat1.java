package ThamChieu;

public class Cat1 {
	String name;
	
	public Cat1() {}
	
	public Cat1(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void Change(Cat1 MyCat1) {
		MyCat1.setName("Doremon");
	}
	
	public static void main(String[] args) {
		Cat1 MyCat1 = new Cat1("Kitty");
		System.out.println("Before: " +MyCat1.name);
		MyCat1.Change(MyCat1);
		System.out.println("After: "+MyCat1.name);
		
	}
	
}
