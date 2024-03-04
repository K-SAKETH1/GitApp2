package p1;

public class Arthmetic implements Addition,Division, Multiplication{
	@Override
	public int getAdd(int a, int b) {
		return a + b;
	}
	@Override
	public double getDiv(int a, int b) {
		return a/b;
	}
	public static void main(String args[]) {
		Arthmetic a = new Arthmetic();
		int addResult = a.getAdd(5, 4);
		System.out.println("Addition:- "+addResult);
		//Accessed Division
		System.out.println("Division::"+a.getDiv(11, 24));
	}
}
