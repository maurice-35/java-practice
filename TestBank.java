abstract class Bank {
	abstract void getRateOfInterest();

	public void setSBI() {
	}

	public void setPNB() {
	}
}

class SBI extends Bank {
	void getRateOfInterest() {
		System.out.println("Interest Rate of SBI is:7%");
	}
}

class PNB extends Bank {
	void getRateOfInterest() {
		System.out.println("Interest Rate of PNB is:5%");
	}
}

class TestBank {
	public static void main(String arg[]) {
		SBI s = new SBI();
		s.getRateOfInterest();
		PNB p = new PNB();
		p.getRateOfInterest();
	}
}
