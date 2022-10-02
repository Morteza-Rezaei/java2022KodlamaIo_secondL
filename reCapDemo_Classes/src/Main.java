
public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonucTopla = dortIslem.Topla(3, 4);
		System.out.println(sonucTopla);

		int sonucCikar = dortIslem.Cikar(19, 12);
		System.out.println(sonucCikar);

		int sonucCarp = dortIslem.Carp(4, 5);
		System.out.println(sonucCarp);

		int sonucBol = dortIslem.Bol(20, 4);
		System.out.println(sonucBol);
	}

}
