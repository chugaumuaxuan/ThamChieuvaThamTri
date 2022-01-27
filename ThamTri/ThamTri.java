package ThamTri;

public class ThamTri {
	int a = 10;
	
	public ThamTri() {}
	 
	void change(int a) {
		a = 20;
	}
	
	public static void main(String[] args) {
		ThamTri tt = new ThamTri();
		System.out.println("Before: " + tt.a);
		tt.change(tt.a);
		System.out.println("After: " + tt.a);
	}
	
}
