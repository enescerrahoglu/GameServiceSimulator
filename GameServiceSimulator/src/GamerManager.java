
public class GamerManager implements GamerService {
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " sisteme ba�ar�yla eklendi.");
		}
		else {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " sisteme eklenemedi! Hatal� Bilgi!");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " sistemden ba�ar�yla silindi.");
		}
		else {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " sistemden silinemedi! ��nk� sisteme daha �nce eklenemedi!");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " adl� oyuncunun bilgileri g�ncellendi.");
	}

}
