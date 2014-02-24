package javabrains;

import java.util.List;

public class Triangle
{

    private List<Point> points;


    public List<Point> getPoints()
    {
        return points;
    }


    public void setPoints(List<Point> points)
    {
        this.points = points;
    }


    public void draw()
    {
        for ( Point point : points )
        {
            System.out.printf( "Point = (%3d,%3d)\n", point.getX(), point.getY() );
        }
    }

}
