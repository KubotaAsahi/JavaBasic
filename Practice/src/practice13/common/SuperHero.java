package practice13.common;

public class SuperHero extends Hero{
	
	//フィールド↓
	
	Item equipment = new Item("こんぼう", 4);
	
	//メゾット↓
	 public SuperHero(int hp, int power, int endurance) {
		super(25, 10, 7);
		
	}
	public int attack() {
		
		return 10 + equipment.getAdditionalDamage();
		
	}
	public Item getEquipment() {
		return  equipment;
	}
	public void setEquipment(Item  equipment) {
		this.equipment =  equipment;
	}
	
}
/*
 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
 *
 * フィールド
 * 		equipment	:	common.Item
 * メソッド
 * 		attackメソッドをオーバーライドし、
 * 		powerに加えて、additionalDamage分を加算した値としてください
 *
 * 		equipmentのアクセサ
 */
