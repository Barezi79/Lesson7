package examples;

public class GoldieAndKate {
	public static void main(String[] args) {
		new KateHudson("curly");
	}
}

class KateHudson extends GoldieHawn {

	KateHudson() {
		System.out.println("Kate default constructor.");
	}

	KateHudson(String hairstyle) {
		this();
		System.out.println("Kate hair constructor.");
	}

}

class GoldieHawn {

	GoldieHawn() {
		System.out.println("Goldie default constructor.");
	}

}
