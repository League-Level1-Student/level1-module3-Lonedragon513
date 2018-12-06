import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GWorld {
public static void main(String[] args) {
	World w = new World();
	w.show();
	Bug b1 = new Bug();
	
	Location l = new Location ();
	w.add(l, b1);
}
}
