package hansung.designpatterns.command.party;

public class LightDimDownCommand implements Command {
	Light light;
	int level;

	public LightDimDownCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		level = light.getLevel();
		level = level - 10;
		light.dim(level);
	}

	public void undo() {
		level = level + 10;
		light.dim(level);
	}
}
