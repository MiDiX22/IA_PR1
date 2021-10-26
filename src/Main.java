import java.awt.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Solver sv = new Solver(new File("src/Map1.txt"),10, 10,0,0,9,9);
//        Solver sv = new Solver(new File("src/mapBasic.txt"),3, 3,0,0,2,2);

        // Heuristic 2: type of road
        // Node solution = sv.bestFirst(new HeuristicRoad());
        // Node solution = sv.bestFirst(new HeuristicCoord());
        // Node solution = sv.aStar(new HeuristicCoord());
        // Node solution = sv.aStar(new HeuristicRoad());
        Node solution = sv.aStar(new HeuristicTimexNode());

        System.out.println(solution.getPath());
        System.out.println(solution.pathTime());
        System.out.println(sv.getnExplored());

        System.out.println("\n");
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                System.out.print(sv.getChar(new Point(j,i)));
            }
            System.out.println("");
        }
    }
}
