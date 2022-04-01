package Entities;

public class Offer {
	public int id;
	public double offerRate;
	
	public Offer(int id, double offerRate) {
		super();
		this.id = id;
		this.offerRate = offerRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getOfferRate() {
		return offerRate;
	}

	public void setOfferRate(double offerRate) {
		this.offerRate = offerRate;
	}
	
}
