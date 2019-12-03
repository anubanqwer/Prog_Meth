package logic;

public class Tank extends Hero {
	private int armor;
	public Tank(String name, int power, int hp, int armor) {
		super(name, power, hp);
		if( armor < 1 ) {
			this.armor = 1;
		}
		else {
			this.armor = armor;
		}
		/*this.name = name;
		this.power = power;
		this.hp = hp;*/
	}
	@Override
	public int takeDamage( int damage ) {
		int reduced_damage = damage - armor;
		if ( reduced_damage > 0 ) {
			if( hp - reduced_damage < 0) {
				hp = 0;
				return reduced_damage;
			}
			hp -= reduced_damage;
			return reduced_damage;
		}
		return 0;		
	}
	
	public int takePiercingDamage(int damage) {
		if( hp - damage >= 0 ) {
			hp -= damage;
			return damage;
		}
		int copy_hp = this.hp;
		hp = 0;
		return copy_hp;
	}
	
	@Override
	public String printStat() {
		return "[atk:" + this.power + " hp:" + this.hp + " armor:" + this.armor + "]" ;
	}
	
	public int getArmor() {
		return this.armor;
	}
	
	
	
}
