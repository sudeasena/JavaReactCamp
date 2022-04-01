package Abstract;

import Entities.Game;
import Entities.Gamer;
import Entities.Offer;

public interface GameSalesService {
	void gameSale(Gamer gamer,Game game,Offer offer);
}
