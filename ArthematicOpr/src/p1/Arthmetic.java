package p1;

public class Arthmetic implements Addition,Division{
	@Override
	public int getAdd(int a, int b) {
		return a + b;
	}
	public double getDiv(int a, int b) {
		return a/b;
	}
	public static void main(String args[]) {
		Arthmetic a = new Arthmetic();
		int addResult = a.getAdd(5, 4);
		System.out.println("Addition:- "+addResult);
	}
}
