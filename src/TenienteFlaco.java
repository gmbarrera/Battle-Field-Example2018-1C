import ia.battle.core.FieldCell;
import ia.battle.core.Warrior;
import ia.battle.core.actions.Action;
import ia.exceptions.RuleException;

public class TenienteFlaco extends Warrior {
	public TenienteFlaco(String name, int health, int defense, int strength, int speed, int range)
			throws RuleException {
		super(name, health, defense, strength, speed, range);
	}

	public Action playTurn(long tick, int actionNumber) {
		return null;
	}

	public void wasAttacked(int damage, FieldCell source) {
	}

	public void enemyKilled() {
	}

	public void worldChanged(FieldCell oldCell, FieldCell newCell) {
	}
}