package ThamChieu;

public class ThamChieu {
	int b=1;
	
	
	void change(ThamChieu t) {
		t.b = t.b + 100;
	}
	
	public static void main(String[] args) {
		ThamChieu tc = new ThamChieu();
		System.out.println("Before: " + tc.b);
		tc.change(tc);
		System.out.println("After: " + tc.b);
	}

}
