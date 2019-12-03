package logic;

public class Hero {
	protected String name;
	protected int power;
	protected int hp;
	
	public Hero(String name, int power, int hp){
		this.name = name;
		if( power > 0 ) {
			this.power = power;
		}
		else {
			this.power = 0;
		}
		if( hp > 1 ) {
			this.hp = hp;
		}
		else {
			this.hp  = 1;
		}
	}
	
	public int takeDamage(int damage) {
		/* Hero’s hp
        after receive damage shall never go below 0.*/
		if( damage > 0 ) {
			if ( this.hp - damage < 0 ) {
				this.hp = 0;
			}
			else {
				this.hp -= damage;
			}
			return damage;
		}
		return 0;
	}
	
	public int doDamage(Hero target) {
		// the follow expression -> ???
		//target.hp -= this.power; ???
		return target.takeDamage( this.power );
	}
	
	public boolean isDefeated() {
		if( this.hp <= 0 ) {
			return true;
		}
		return false;
	}
	
	public String printStat() {
		return "[atk:" + this.power + " " + "hp:" + this.hp + "]" ;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public int getHp() {
		return this.hp;
	}

}
