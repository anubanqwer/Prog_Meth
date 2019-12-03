package logic;

public class Robot extends Hero{
	public Robot(String name) {
		super(name,2,10);
		}
	
	@Override
	public int doDamage(Hero target) {
		if ( target instanceof Tank ) {
			Tank tmp = (Tank) target;
			return  tmp.takePiercingDamage(power);
		}
		return target.takeDamage(power);
	}
}
