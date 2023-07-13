package Users;

public class Game {
	
	private String gameName;
	private String authorName;
	private float price;
	public Game(String string, String string2, float string3) {
		// TODO Auto-generated constructor stub
		this.gameName = string;
		this.authorName = string2;
		this.price = string3;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
