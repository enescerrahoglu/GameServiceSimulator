
public class GamerManager implements GamerService {
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " sisteme baþarýyla eklendi.");
		}
		else {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " sisteme eklenemedi! Hatalý Bilgi!");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " sistemden baþarýyla silindi.");
		}
		else {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " sistemden silinemedi! Çünkü sisteme daha önce eklenemedi!");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " adlý oyuncunun bilgileri güncellendi.");
	}

}
