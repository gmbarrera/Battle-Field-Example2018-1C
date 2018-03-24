import ia.battle.core.ConfigurationManager;
import ia.battle.core.FieldCell;
import ia.battle.core.WarriorManager;
import ia.exceptions.RuleException;

public class ElEntrenador extends WarriorManager {
	public ElEntrenador() {
	}

	public String getName() {
		return "El Entrenador";
	}

	public ia.battle.core.Warrior getNextWarrior() throws RuleException {
		int maxStats = ConfigurationManager.getInstance().getMaxPointsPerWarrior();

		int h = maxStats / 5;
		int d = maxStats / 5;
		int s = maxStats / 5;
		int a = maxStats / 5;
		int r = maxStats / 5;

		return new SoldadoRaian("Raian", 20, 20, 20, 20, 20);
	}

	public void remember(int damage, FieldCell source) {
		System.out.println(source);
	}
}