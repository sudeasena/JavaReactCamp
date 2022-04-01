package Concrete;

import Abstract.OfferService;
import Entities.Offer;

public class OfferManager implements OfferService {

	@Override
	public void add(Offer offer) {
		System.out.println("Added a new offer!");
		
	}

	@Override
	public void update(Offer offer) {
		System.out.println("Updated offer!");

		
	}

	@Override
	public void delete(Offer offer) {
		System.out.println("Deleted offer!");

		
	}

}
