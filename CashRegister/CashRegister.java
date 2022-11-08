package cashRegister;

public class CashRegister {
	private double purchase;
	private double payment;

	// Constructor
	public CashRegister() {
		purchase = 0;
		payment = 0;
	}

	public void recievepayment(int coincount, Coin cointype) {
		payment = payment + coincount * cointype.getvalue();
	}

	public void recordpurchase(double item) {
		purchase = purchase + item;
	}

	public double getpurchaseamount() {
		return purchase;
	}

	public double getfinalpurchaseamount() {
		return purchase * 1.08;
	}

	public double getpaymentamount() {
		return payment;
	}

	public double givechange() {
		return payment - getfinalpurchaseamount();
	}
}
