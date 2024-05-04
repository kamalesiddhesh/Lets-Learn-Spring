package payment;

public class App {

	public static void main(String[] args) {
		IPayment p1 = new DebitCardPayment();
		IPayment p2 = new CreditCardPayment();
		PaymentService service = new PaymentService(p1);
		service.setPayment(p2);
		service.doPayment(100.00);

		

//		IPayment p1 = new CreditCardPayment();
//		PaymentService service1 = new PaymentService(p1);
//		service1.doPayment(200);
	}

}
