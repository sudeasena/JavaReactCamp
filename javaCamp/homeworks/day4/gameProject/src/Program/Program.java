package Program;

import Abstract.GamerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.GameManager;
import Concrete.GameSalesManager;
import Concrete.GamerManager;
import Concrete.OfferManager;
import Entities.Game;
import Entities.Gamer;
import Entities.Offer;

public class Program {

	public static void main(String[] args) {
		Gamer gamer = new Gamer("Sude Asena", "Alýkoðlu",1999,123456789);
		GamerManager gamerManager=new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		
		Game game = new Game(1,"CS",150.5);
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		
		Offer offer = new Offer(1,10);
		OfferManager offerManager = new OfferManager();
		offerManager.add(offer);
		
		
		
		GamerCheckService playerCheckService = new MernisServiceAdapter();
		GameSalesManager gameSaleManager = new GameSalesManager();
		if (playerCheckService.checkIfRealPerson(gamer) == true) {
			gameSaleManager.gameSale(gamer, game, offer);
		} else {
			System.out.println("not a valid person");
		}
		
	}

}
