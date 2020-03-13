
public class Weapon {

	private String id;
	private String name;
	private String rarity;
	private int maxAmmo;

	public Weapon(String id, String name, String rarity, int maxAmmo) {
		super();
		this.id = id;
		this.name = name;
		this.rarity = rarity;
		this.maxAmmo = maxAmmo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRarity() {
		return rarity;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	public int getMaxAmmo() {
		return maxAmmo;
	}

	public void setMaxAmmo(int maxAmmo) {
		this.maxAmmo = maxAmmo;
	}
}
