package hansung.designpatterns.command.party;

public class LightDimUpCommand implements Command {
	Light light;
	int level;

	public LightDimUpCommand(Light light) {
		this.light = light;
	}

	public void execute() {
			level = light.getLevel();
			if (level<=0){
				System.out.println("you have to light on");
			}
			else {
			level = level + 10;
			light.dim(level);}

	}

	public void undo() {
		level = level - 10;
		light.dim(level);
	}
}
