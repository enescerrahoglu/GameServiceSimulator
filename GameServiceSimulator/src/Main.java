import java.time.LocalDate;


public class Main {

	public static void main(String[] args){
		
		GamerCheckService gamerCheckService = new MernisServiceAdapter();
		GamerManager gamerManager = new GamerManager(gamerCheckService);
		
		GameManager gameManager = new GameManager();
		
		CampaignManager campaignManager = new CampaignManager();
		
		Gamer gamer1 = new Gamer(1, "Enes", "Cerrahoðlu", LocalDate.of(2000,2,8), "98765432100");
		gamerManager.add(gamer1);
		
		Gamer gamer2 = new Gamer(1, "Engin", "Demiroð", LocalDate.of(2000,1,6), "12345678910");
		gamerManager.add(gamer2);
		
		Game game1 = new Game(1, "Counter Strike : Global Offensive", 24.99);
		gameManager.add(game1);
		
		Game game2 = new Game(1, "Grand Theft Auto 5", 149.99);
		gameManager.add(game2);
		
		gameManager.buy(gamer1, game1);
		
		Campaign campaign1 = new Campaign(1, "Öðrenci", 50);
		campaignManager.add(campaign1);
		
		gameManager.buy(gamer1, game1, campaign1);
		gameManager.buy(gamer1, game2);
		gameManager.buy(gamer1, game2, campaign1);
		
		campaignManager.delete(campaign1);
		gameManager.delete(game2);
		gamerManager.delete(gamer2);
		gamerManager.delete(gamer1);
		
		
	}

}
