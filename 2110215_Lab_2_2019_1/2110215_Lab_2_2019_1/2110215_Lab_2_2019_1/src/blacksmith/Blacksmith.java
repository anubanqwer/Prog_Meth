package blacksmith;
import logic.Hero;
import logic.Tank;
public class Blacksmith extends logic.Hero{
	private Sword sword;
	private int skillLevel;
	
	public Blacksmith() {
		super("DefaultBlacksmith", 1, 1);
		skillLevel = 1;
		sword = new Sword(1,1);
	}
	
	public Blacksmith(String name, int hp, int skillLevel) {
		super(name, 1, hp);
		this.skillLevel = skillLevel;
		sword = new Sword(1,1);
	}
	
	@Override
	public int doDamage(Hero target) {
		/*
		 * if ( target instanceof Tank) { Tank tmp2 = (Tank) target; return
		 * tmp2.takeDamage( sword.getAttack() ); }
		 * 
		 * target.takeDamage( sword.getAttack() ); upgradeSword(); return
		 * sword.getAttack();
		 */
		int damage = target.takeDamage(sword.getAttack());
		sword.upgrade(skillLevel);
		return damage;
	}
	
	public void upgradeSword() {
		sword.upgrade(this.skillLevel);
	}
	
	@Override
	public String printStat() {
		return "[hp:" + this.hp + " " + "lvl:" + this.skillLevel + "]";
	}
}
