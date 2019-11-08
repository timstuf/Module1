package com.nix;

public class TriangleSquare {
    /*Даны точки A,B,C  на плоскости.
     Вычислить площадь  треугольника ABC.*/
    public double getSquare(Point a, Point b, Point c)
    {
        return 1./2 * Math.abs((b.x-a.x)*(c.y-a.y) - (c.x-a.x)*(b.y-a.y));
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
