import java.awt.*;
import java.util.ArrayList;

public class Node implements Comparable<Node> {
    private Character name;
    private Point coord;
    private ArrayList<Node> path;
    private int heuristic = 0;

    public Node(Character name, Point coord, ArrayList<Node> path) {
        this.name = name;
        this.coord = coord;
        this.path = new ArrayList<>(path);
    }

    public Node(Character name, Point coord) {
        this.name = name;
        this.coord = coord;
        this.path = new ArrayList<>();
    }

    public Character getName() {
        return name;
    }

    public Point getCoord() {
        return coord;
    }

    public ArrayList<Node> getPath() {
        return path;
    }

    public int getHeuristic() {
        return heuristic;
    }

    public void setHeuristic(int heuristic) {
        this.heuristic = heuristic;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name=" + name +
                ", coord=" + coord +
                ", heuristic=" + heuristic +
                "}\n";
    }


    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.heuristic, o.heuristic);
    }

    @Override
    public boolean equals(Object object){
        boolean res = false;
        if (object != null && object instanceof Node ){
            res=this.coord.equals(((Node) object).getCoord());

        }
        return res;
    }

    public int pathTime(){
        int time = 0;
        ArrayList<Node> tmpPath = new ArrayList<>(path);
        tmpPath.add(this);
        Character ant = tmpPath.get(0).getName();
        for (int i=0; i< tmpPath.size(); i++){
           switch (tmpPath.get(i).getName()){
               case 'A' -> time = time + 1;
               case 'N' -> time = time + 2;
               case 'C' -> time = time + 3;
               default -> time = time + 0;
           }
           if (tmpPath.get(i).getName() != ant){
               time = time + 5;
           }
           ant = tmpPath.get(i).getName();
        }
        return time;
    }
}
