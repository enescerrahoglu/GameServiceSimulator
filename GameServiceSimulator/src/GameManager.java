
public class GameManager implements GameService {

	@Override
	public void add(Game entity) {
		System.out.println(entity.getGameName() + " oyunu sisteme eklendi.");
	}

	@Override
	public void delete(Game entity) {
		System.out.println(entity.getGameName() + " oyunu sistemden silindi.");
	}

	@Override
	public void update(Game entity) {
		System.out.println(entity.getGameName() + " oyunu güncellendi.");
	}

	@Override
	public void buy(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + ", " + game.getGameName() + " isimli oyunu " + game.getGamePrice() + " TL ödeyerek satýn aldý.");
	}

	@Override
	public void buy(Gamer gamer, Game game, Campaign campaign) {
		double newPrice = game.getGamePrice() - (game.getGamePrice() * campaign.getDiscount() / 100);
		game.setGamePrice(newPrice);
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + ", " + game.getGameName() + " isimli oyunu, " + campaign.getCampaignName() + " kampanyasý ile %" + campaign.getDiscount() + " indirimle " + String.format("%.2f", game.getGamePrice()) + " TL ödeyerek satýn aldý.");
	}

}
