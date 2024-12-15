package pack.ccapg.module7.interfce;

public interface PaymentMethod {
	void processPayment(double amount);
	void applyDiscount(double amount);

}

 interface Store {

	double getDiscount();//Returns the discount percentage for the store.
	void checkOut( double amount , PaymentMethod paymentMethod);
}
