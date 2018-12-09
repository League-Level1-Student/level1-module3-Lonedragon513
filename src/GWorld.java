import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GWorld {
	public static void main(String[] args) {
		World w = new World();
		w.show();
		Bug b1 = new Bug();
		Bug b2 = new Bug();
		Location l = new Location(9, 9);
		w.add(l, b1);
		b2.setColor(Color.BLUE);
		b2.setDirection(-90);
		Random r = new Random();

		int in = r.nextInt(10);
		int a = r.nextInt(10);

		Location l1 = new Location(in, a);
		w.add(l1, b2);
	}
}
