import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;

public class Solver {
    private char[][] map;
    private int nExplored;
    private Point ini;
    private Point end;
    private int maxX, maxY;

    // Upload Map
    public Solver(File mapRaw, int maxX, int maxY, int iniX, int iniY, int endX, int endY) {
        int i = 0;
        this.map = new char[maxX][maxY];
        this.ini = new Point(iniX, iniY);
        this.end = new Point(endX, endY);
        this.maxX = maxX;
        this.maxY = maxY;

        try {
            Scanner sc = new Scanner(mapRaw);
            String line;
            while(sc.hasNextLine())
            {
                line = sc.nextLine();
                for (int j = 0; j < maxX; j++) {
                    map[i][j] = line.charAt(j);
                }
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Get characters from map (Type of road)
    public char getChar(Point p){
        return map[p.y][p.x];
    }
    public char getChar(int x, int y){
//        System.out.println(x);
//        System.out.println(y);
        return map[y][x];
    }

    public Point getEnd() {
        return end;
    }

    public int getnExplored() {
        return nExplored;
    }

    public Node bestFirst(Heuristic heuristic) {
        Node crt = new Node(getChar(ini),ini);
        ArrayList<Node> pendents = new ArrayList<>();
        ArrayList<Point> tratado = new ArrayList<>();
        pendents.add(crt);
        while ((pendents.size() > 0)){
            Collections.sort(pendents);
            crt = pendents.get(0);
            tratado.add(crt.getCoord());
            nExplored++;
            if (crt.getCoord().equals(end)) {
                return crt;
            }
            System.out.printf(crt.getCoord().toString());


            for (Node node : lookAround(crt, heuristic)) {
                int idx=0;
                if (tratado.contains(node.getCoord())) continue;
                boolean equals = false;
                for (int i=0; i<pendents.size(); i++){
                    if (pendents.get(i).getCoord() == node.getCoord()) {
                        equals = true;
                        idx= i;
                    }
                }
                System.out.println(equals);
                if (equals) {
                    if (pendents.get(idx).getHeuristic() > node.getHeuristic()){
                        pendents.remove(idx);
                        pendents.add(node);
                    }
                } else pendents.add(node);
            }
            pendents.remove(crt);
        }
        return null; // Si no hay solucion
    }

    public ArrayList<Node> lookAround(Node crt, Heuristic heuristic){
        int x = crt.getCoord().x;
        int y = crt.getCoord().y;
        ArrayList<Node> around = new ArrayList<>();

        // Down
        if (((y+1) < maxY)&&('$'!=getChar(x, y+1))) {
            Node down = new Node(getChar(x, y+1),new Point(x, y+1), crt.getPath());
            down.getPath().add(crt);
            down.setHeuristic(heuristic.calculate(down, end));
            around.add(down);
        }
        // Right
        if (((x+1) < maxX)&&('$'!=getChar(x+1, y))){
            Node right = new Node(getChar(x+1, y),new Point(x+1, y), crt.getPath());
            right.getPath().add(crt);
            right.setHeuristic(heuristic.calculate(right, end));
            around.add(right);
        }
        // Left
        if (((x-1) >= 0)&&('$'!=getChar(x-1, y))) {
            Node left = new Node(getChar(x-1, y),new Point(x-1, y), crt.getPath());
            left.getPath().add(crt);
            left.setHeuristic(heuristic.calculate(left, end));
            around.add(left);
        }
        // Up
        if (((y-1) >= 0)&&('$'!=getChar(x, y-1))){
            Node up = new Node(getChar(x, y-1),new Point(x, y-1), crt.getPath());
            up.getPath().add(crt);
            up.setHeuristic(heuristic.calculate(up, end));
            around.add(up);
        }
        return around;
    }
}
