package Users;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DigitalcomProcess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Select the choice from below: ");
		System.out.println("1) RegisterUser");
		System.out.println("2) ViewGames");
		System.out.println("3) searchByName");
		System.out.println("4) Exit");
		
		int choice = sc.nextInt();
		GameService games_services= new GameService();
		while(choice != 4) {
			switch(choice) {
				case 1:{
//					Register new user
					System.out.println("Enter UserID: ");
					String userid = sc.next();
					System.out.println("Enter Password");
					String password = sc.next();
					User new_user = new User(userid,password);
					new_user.addUser(userid, password);
					Map<String, String> mp = User.mp;
					System.out.println("New User created with id: "+userid);
					break;
				}
				case 2:{
//					ViewAll method of game services
					List<Game> gm = games_services.viewAll();
//					Iterator<Game> it = gm.iterator();
//					System.out.println("Games: ");
//					while(it.hasNext()) {
//						System.out.println(it.next().getGameName());
//					}
					for(Game game:gm) {
						System.out.println(game.getGameName());
					}
					break;
				}
				case 3:{
//					searchByName games of author from game service class
					System.out.println("Enter the name of user: ");
					String name = sc.next();
//					name = name.toLowerCase();
					String game_name = games_services.authorSearch(name);
					System.out.println("Games for "+name+": "+game_name);
					break;
				}
				default:{
					System.out.println("Please Select Appropriate choice");
					
				}
			}

			System.out.println("Please Select the choice from below: ");
			System.out.println("1) RegisterUser");
			System.out.println("2) ViewGames");
			System.out.println("3) searchByName");
			System.out.println("4) Exit");
			
			choice = sc.nextInt();
			
		}
	}

}
