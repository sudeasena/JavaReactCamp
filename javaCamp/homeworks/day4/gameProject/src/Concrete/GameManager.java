package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Added a new game!");

		
	}

	@Override
	public void update(Game game) {
		System.out.println("Updated game!");

		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Deleted game");

		
	}

}
