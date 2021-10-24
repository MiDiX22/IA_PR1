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
}
