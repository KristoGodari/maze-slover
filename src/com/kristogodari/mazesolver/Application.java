package com.kristogodari.mazesolver;

import com.kristogodari.utils.FileReader;

public class Application {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader("/home/kristo/workspace/java-advanced-algorithms/maze-slover/src/com/kristogodari/input/input.txt", 10, 10);
        fileReader.parseFile();

        MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(), fileReader.getStartPositionCol(), fileReader.getStartPositionRow());
        mazeSolver.findWayOut();
    }
}

