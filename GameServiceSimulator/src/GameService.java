
public interface GameService extends BaseService<Game> {
	public void buy(Gamer gamer, Game game);
	public void buy(Gamer gamer, Game game, Campaign campaign);
}
