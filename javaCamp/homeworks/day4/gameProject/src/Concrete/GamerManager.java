package Concrete;

import Abstract.GamerService;
import Adapters.MernisServiceAdapter;
import Entities.Gamer;

public class GamerManager implements GamerService {

	public GamerManager(MernisServiceAdapter mernisServiceAdapter) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.firstName + " " + gamer.lastName + " has been added to the game !");

		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.firstName+" " +gamer.lastName+" has been updated!");

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.firstName+" " +gamer.lastName+" has been deleted!");


		
	}
	

}
