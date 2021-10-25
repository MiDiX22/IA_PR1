import java.awt.*;
import java.io.File;
import java.sql.SQLOutput;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Solver sv = new Solver(new File("src/Map1.txt"),10, 10,0,0,9,9);
//        Solver sv = new Solver(new File("src/mapBasic.txt"),3, 3,0,0,2,2);

        // Heuristic 1: distance to the end
//

        // Heuristic 2: type of road
        Node solution2 = sv.bestFirst(new HeuristicRoad());
        System.out.println(solution2.getPath());
        System.out.println(sv.getnExplored());
        System.out.println(sv.getChar(9,9));

        System.out.println("\n");
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                System.out.print(sv.getChar(new Point(j,i)));
            }
            System.out.println("");
        }
    }
}
