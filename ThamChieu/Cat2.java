package ThamChieu;

public class Cat2 {
	String name;
	
	public Cat2() {}
	
	public Cat2(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void Process(Cat2 MyCat) {
		MyCat = new Cat2("DoraeMon");
	}
	
	public static void main(String[] args) {
		Cat2 MyCat2 = new Cat2("Hello Kitty");
		System.out.println("Before: " + MyCat2.name);
		MyCat2.Process(MyCat2);
		System.out.println("After: " + MyCat2.name);
	}
	
}
