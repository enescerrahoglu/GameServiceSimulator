
public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign entity) {
		System.out.println(entity.getCampaignName() + " kampanyası sisteme eklendi.");
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println(entity.getCampaignName() + " kampanyası sistemden silindi.");
	}

	@Override
	public void update(Campaign entity) {
		System.out.println(entity.getCampaignName() + " kampanyası güncellendi.");
	}

}
