package Users;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GameService {
	static ArrayList<Game> games;
	public GameService(){
		games = new ArrayList<Game>();
		games.add(new Game("SnowBird","Danny",300));
		games.add(new Game("FreshFood","Ram",450));
		games.add(new Game("Batsman","Kate",400));
		games.add(new Game("Pokiman","Steeve",600));
		games.add(new Game("YammyTommy","Narayan",350));
	}
	public List<Game> viewAll(){
		return games;
	}
	public String authorSearch(String author) {
		// make an iterator for all list check and return arrlist[i][0]
		Iterator<Game> it = games.iterator();
		String ret = null;
		while(it.hasNext()) {
			Game obj = it.next();
			
			if(obj.getAuthorName().equals(author))
				ret = obj.getGameName();
		}
		return ret;
		
	}
}
