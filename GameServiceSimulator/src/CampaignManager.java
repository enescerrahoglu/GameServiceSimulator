
public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign entity) {
		System.out.println(entity.getCampaignName() + " kampanyas� sisteme eklendi.");
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println(entity.getCampaignName() + " kampanyas� sistemden silindi.");
	}

	@Override
	public void update(Campaign entity) {
		System.out.println(entity.getCampaignName() + " kampanyas� g�ncellendi.");
	}

}
