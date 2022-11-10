package cashRegister;

public class Coin {
	private String type;
	private double value;

	// Constructor that initializes the IV's
	public Coin(String inittype, double initvalue) {
		type = inittype;
		value = initvalue;
	}

	public String gettype() {
		return type;
	}

	public double getvalue() {
		return value;
	}
}
