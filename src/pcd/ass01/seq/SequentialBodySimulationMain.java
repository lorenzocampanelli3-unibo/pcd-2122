package pcd.ass01.seq;

/**
 * Bodies simulation - legacy code: sequential, unstructured
 * 
 * @author aricci
 */
public class SequentialBodySimulationMain {

    public static void main(String[] args) {

    	SimulationView viewer = new SimulationView(620,620);
    	Simulator sim = new Simulator(viewer);
        sim.execute(1000);
    }
}
