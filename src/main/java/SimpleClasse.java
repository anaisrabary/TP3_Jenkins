
public class SimpleClasse {
	public int somme(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		SimpleClasse sc=new SimpleClasse();
		int a=3;
		int b=5;
		System.out.println(a+" + "+b+" = "+ sc.somme(a, b));
		System.out.println("coucou prout !");
	}

}
