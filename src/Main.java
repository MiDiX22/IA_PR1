import java.awt.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Solver sv = new Solver(new File("src/Map1.txt"),10, 10,0,0,9,9);
        System.out.println("MAPA 1: ");
        // best First
        // Heuristic Coord
        System.out.println("------------------------BEST FIRST: HeuristicCoord------------------------");
        Node BFCoord = sv.bestFirst(new HeuristicCoord());
        System.out.println("PATH:");
        System.out.println(BFCoord.getPath());
        System.out.println("Time: "+BFCoord.pathTime());
        System.out.println("Nodes explored: "+sv.getnExplored());
        sv.setnExplored(0);
        System.out.println("--------------------------------------------------------------------------");

        // Heuristic Road
        System.out.println("------------------------BEST FIRST: HeuristicRoad-------------------------");
        Node BFRoad = sv.bestFirst(new HeuristicRoad());
        System.out.println("PATH:");
        System.out.println(BFRoad.getPath());
        System.out.println("Time: "+BFRoad.pathTime());
        System.out.println("Nodes explored: "+sv.getnExplored());
        sv.setnExplored(0);
        System.out.println("--------------------------------------------------------------------------");

        // Heuristic Time x Node
        System.out.println("----------------------BEST FIRST: HeuristicTimexNode----------------------");
        Node BFTime = sv.bestFirst(new HeuristicTimexNode());
        System.out.println("PATH:");
        System.out.println(BFTime.getPath());
        System.out.println("Time: "+BFTime.pathTime());
        System.out.println("Nodes explored: "+sv.getnExplored());
        sv.setnExplored(0);
        System.out.println("--------------------------------------------------------------------------");


        //A*
        // Heuristic Coord
        System.out.println("---------------------------A*: HeuristicCoord----------------------------");
        Node ACoord = sv.aStar(new HeuristicCoord());
        System.out.println("PATH:");
        System.out.println(ACoord.getPath());
        System.out.println("Time: "+ACoord.pathTime());
        System.out.println("Nodes explored: "+sv.getnExplored());
        sv.setnExplored(0);
        System.out.println("--------------------------------------------------------------------------");

        // Heuristic Road
        System.out.println("---------------------------A*: HeuristicRoad-----------------------------");
        Node ARoad = sv.aStar(new HeuristicRoad());
        System.out.println("PATH:");
        System.out.println(ARoad.getPath());
        System.out.println("Time: "+ARoad.pathTime());
        System.out.println("Nodes explored: "+sv.getnExplored());
        sv.setnExplored(0);
        System.out.println("--------------------------------------------------------------------------");

        // Heuristic Time x Node
        System.out.println("--------------------------A*: HeuristicTimexNode--------------------------");
        Node ATime = sv.aStar(new HeuristicTimexNode());
        System.out.println("PATH:");
        System.out.println(ATime.getPath());
        System.out.println("Time: "+ATime.pathTime());
        System.out.println("Nodes explored: "+sv.getnExplored());
        sv.setnExplored(0);
        System.out.println("--------------------------------------------------------------------------");



        Solver sv2 = new Solver(new File("src/Map2.txt"),5, 5,0,0,4,4);
        System.out.println("MAPA 2: ");
        // best First
        // Heuristic Coord
        System.out.println("------------------------BEST FIRST: HeuristicCoord------------------------");
        Node BFCoord2 = sv2.bestFirst(new HeuristicCoord());
        System.out.println("PATH:");
        System.out.println(BFCoord2.getPath());
        System.out.println("Time: "+BFCoord2.pathTime());
        System.out.println("Nodes explored: "+sv2.getnExplored());
        sv2.setnExplored(0);
        System.out.println("--------------------------------------------------------------------------");

        // Heuristic Road
        System.out.println("------------------------BEST FIRST: HeuristicRoad-------------------------");
        Node BFRoad2 = sv2.bestFirst(new HeuristicRoad());
        System.out.println("PATH:");
        System.out.println(BFRoad2.getPath());
        System.out.println("Time: "+BFRoad2.pathTime());
        System.out.println("Nodes explored: "+sv2.getnExplored());
        sv2.setnExplored(0);
        System.out.println("--------------------------------------------------------------------------");

        // Heuristic Time x Node
        System.out.println("----------------------BEST FIRST: HeuristicTimexNode----------------------");
        Node BFTime2 = sv2.bestFirst(new HeuristicTimexNode());
        System.out.println("PATH:");
        System.out.println(BFTime2.getPath());
        System.out.println("Time: "+BFTime2.pathTime());
        System.out.println("Nodes explored: "+sv2.getnExplored());
        sv2.setnExplored(0);
        System.out.println("--------------------------------------------------------------------------");


        //A*
        // Heuristic Coord
        System.out.println("---------------------------A*: HeuristicCoord----------------------------");
        Node ACoord2 = sv2.aStar(new HeuristicCoord());
        System.out.println("PATH:");
        System.out.println(ACoord2.getPath());
        System.out.println("Time: "+ACoord2.pathTime());
        System.out.println("Nodes explored: "+sv2.getnExplored());
        sv2.setnExplored(0);
        System.out.println("--------------------------------------------------------------------------");

        // Heuristic Road
        System.out.println("---------------------------A*: HeuristicRoad-----------------------------");
        Node ARoad2 = sv2.aStar(new HeuristicRoad());
        System.out.println("PATH:");
        System.out.println(ARoad2.getPath());
        System.out.println("Time: "+ARoad2.pathTime());
        System.out.println("Nodes explored: "+sv2.getnExplored());
        sv2.setnExplored(0);
        System.out.println("--------------------------------------------------------------------------");

        // Heuristic Time x Node
        System.out.println("--------------------------A*: HeuristicTimexNode--------------------------");
        Node ATime2 = sv2.aStar(new HeuristicTimexNode());
        System.out.println("PATH:");
        System.out.println(ATime2.getPath());
        System.out.println("Time: "+ATime2.pathTime());
        System.out.println("Nodes explored: "+sv.getnExplored());
        sv2.setnExplored(0);
        System.out.println("--------------------------------------------------------------------------");

    }
}
