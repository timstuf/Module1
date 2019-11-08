package com.nix;

public class LifeGame {
    public int[][] getNextState(int[][] field) {
        if(field.length==0) return new int[0][0];
        int[][] nextState = new int[field.length][field[0].length];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                nextState[i][j] = isAlive(new Point(i, j), field);
            }
        }
        return nextState;
    }

    public int isAlive(Point cell, int[][] field) {
        Point[] surroundings = {new Point(cell.x - 1, cell.y - 1),
                new Point(cell.x - 1, cell.y),
                new Point(cell.x - 1, cell.y + 1),
                new Point(cell.x, cell.y - 1),
                new Point(cell.x, cell.y + 1),
                new Point(cell.x + 1, cell.y - 1),
                new Point(cell.x + 1, cell.y),
                new Point(cell.x + 1, cell.y + 1)};
        int countAlive = 0;
        for (int i = 0; i < 8; i++) {
            if (canLook(surroundings[i], field.length, field[0].length)) {
                if (field[surroundings[i].x][surroundings[i].y] == 1) countAlive++;
            }
        }
        if (field[cell.x][cell.y] == 1) {
            if (countAlive == 2 || countAlive == 3) return 1;
            else return 0;
        } else {
            if (countAlive == 3) return 1;
            else return 0;
        }


    }

    public boolean canLook(Point cell, int m, int n) {
        if (cell.x < 0 || cell.y < 0 || cell.x > m-1 || cell.y > n-1) return false;
        else return true;
    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
