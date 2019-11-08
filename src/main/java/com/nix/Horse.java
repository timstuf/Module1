package com.nix;

public class Horse {
    /*Ход коня по шахматной доске.
    Вводится текущее положение коня и клетка в которую пробуют его передвинуть за 1 ход.
    Программа должна проверить, возможно ли это сделать.
    */

    public boolean canGo(Point start, Point end)
    {
        if(start.x>8 || start.x <1 ||start.y>8 || start.y <1 ||end.x>8 || end.x <1 ||end.y>8 || end.y <1 ) return false;
        if(start.x==end.x && start.y==end.y) return true;
        if(Math.abs(start.x-end.x)==2 && Math.abs(start.y-end.y)==1) return true;
        if(Math.abs(start.x-end.x)==1 && Math.abs(start.y-end.y)==2) return true;
        else return false;
    }

    static class Point
    {
        int x;
        int y;

        Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }
}
