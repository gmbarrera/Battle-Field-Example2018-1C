import ia.battle.core.BattleField;
import ia.battle.core.FieldCell;
import ia.battle.core.Warrior;
import ia.battle.core.WarriorData;
import ia.exceptions.RuleException;

public class SoldadoRaian extends Warrior {
	public SoldadoRaian(String name, int health, int defense, int strength, int speed, int range) throws RuleException {
		super(name, health, defense, strength, speed, range);
	}

	public ia.battle.core.actions.Action playTurn(long tick, int actionNumber) {
		WarriorData ed = BattleField.getInstance().getEnemyData();

		if (ed.getInRange()) {
			return new ia.battle.core.actions.Attack(ed.getFieldCell());
		}

		return new MovimientoDummy(getPosition(), 1, 2);
	}

	public void wasAttacked(int damage, FieldCell source) {
		((ElEntrenador) getWarriorManager()).remember(damage, source);

		System.out.println("ehhh... que hace'");
	}

	public void enemyKilled() {
	}

	public void worldChanged(FieldCell oldCell, FieldCell newCell) {
	}
	
	// Metodo a sobreescribir para determinar si agarro la cajita o no
	public boolean useSpecialItem() {
		return true;
	}
}