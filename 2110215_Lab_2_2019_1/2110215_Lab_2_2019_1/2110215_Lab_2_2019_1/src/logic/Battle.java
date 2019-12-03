package logic;

public class Battle {
	private Hero[] fighter;
	
	//Constructor
	public Battle(Hero a, Hero b) {
		fighter = new Hero[2];
		fighter[0] = a ;
		fighter[1] = b ;
	}
	
	public void start() {
		System.out.println("==== Here Come A New Challenger ====");
		// TODO Show opening phrase -> Show challengers -> Repeat doBattleStep() -> Show result
		System.out.println("== " + fighter[0].getName() + " " + fighter[0].printStat() + " VS " + fighter[1].getName()  + " " + fighter[1].printStat() + " ==\n");
		while ( !isEnd() ) {
			doBattleStep();
		}
		showResult();
	}

	public void doBattleStep() {
		// TODO FILL ME
		// First fighter Attack
		System.out.println( fighter[0].getName() + " do " + fighter[0].doDamage(fighter[1]) + " damage to " + fighter[1].getName() );
		System.out.println(fighter[1].getName() + " has " + fighter[1].getHp() + " HP left\n");
		// Second fighter Attack
		System.out.println( fighter[1].getName() + " do " + fighter[1].doDamage(fighter[0]) + " damage to " + fighter[0].getName());
		System.out.println( fighter[0].getName() + " has " + fighter[0].getHp() + " HP left\n");
		if( fighter[0].isDefeated() ) {
			System.out.println( fighter[0].getName() + " is knocked out\n");
		}
		if( fighter[1].isDefeated() ) {
			System.out.println( fighter[1].getName() + " is knocked out\n");
		}
		
	}
	
	public boolean isEnd() {
		/*while( true ) {
			if( fighter[0].isDefeated() || fighter[1].isDefeated() ) {
				break;
			}
			doBattleStep();
		}*/
		if( fighter[0].isDefeated() || fighter[1].isDefeated() ) {
			return true;
		}
		return false;
	}
	
	// TODO Fill me
	public void showResult() {
		if( fighter[0].isDefeated() && fighter[1].isDefeated() ) {
			System.out.println("== DRAW ==");
		}
		else if( fighter[1].isDefeated() ) {
			System.out.println("== " + fighter[0].getName() + " WIN ==");
		}
		else if( fighter[0].isDefeated() ) {
			System.out.println("== " + fighter[1].getName() + " WIN ==");
		}
	}
}
