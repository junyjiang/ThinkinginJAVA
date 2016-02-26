public class AllTheXColorsOfTheRainbow {
	int anIntegerRepresentingColors;

	void changeTheHueOfTheColor(int newHue) {
		anIntegerRepresentingColors = newHue;
	}

	public static void main(String[] args) {
		AllTheXColorsOfTheRainbow all = new AllTheXColorsOfTheRainbow();
		all.changeTheHueOfTheColor(27);
	}
} // /:~