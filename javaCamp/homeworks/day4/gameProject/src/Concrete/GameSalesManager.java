package Concrete;

import Abstract.GameSalesService;
import Entities.Game;
import Entities.Gamer;
import Entities.Offer;

public class GameSalesManager implements GameSalesService {

	@Override
	public void gameSale(Gamer gamer, Game game, Offer offer) {
		double price= game.getGamePrice()-(game.getGamePrice()*offer.getOfferRate()/100);
		System.out.println(game.getGameName()+"game sold to "+gamer.getFirstName()+" player price: "+price);
	}

}
