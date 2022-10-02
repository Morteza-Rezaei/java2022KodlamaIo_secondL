package methods2;

public class Main {

	public static void main(String[] args) {
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int carpma = carp(5, 3);
		System.out.println(carpma);
		int toplam = topla(2, 3, 4, 5, 6, 10);
		System.out.println(toplam);
	}

	public static void ekle() {

	}

	public static void sil() {

	}

	public static void guncelle() {

	}

	public static int carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}

	public static String sehirVer() {
		return "Ankara";
	}

	public static int topla(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
}
