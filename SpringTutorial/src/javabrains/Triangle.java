package javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware
{

    private Point pointA;
    private Point pointB;
    private Point pointC;

    private ApplicationContext context = null;

    public Point getPointA()
    {
        return pointA;
    }


    public void setPointA(Point pointA)
    {
        this.pointA = pointA;
    }


    public Point getPointB()
    {
        return pointB;
    }


    public void setPointB(Point pointB)
    {
        this.pointB = pointB;
    }


    public Point getPointC()
    {
        return pointC;
    }


    public void setPointC(Point pointC)
    {
        this.pointC = pointC;
    }


    public void draw()
    {
        System.out.println(context);
        System.out.printf( "Point A = (%3d,%3d)\n", getPointA().getX(), getPointA().getY() );
        System.out.printf( "Point B = (%3d,%3d)\n", getPointB().getX(), getPointB().getY() );
        System.out.printf( "Point C = (%3d,%3d)\n", getPointC().getX(), getPointC().getY() );
    }


    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException
    {
        // added by eclipse - add umimplemented methods
        this.context = context;
        //System.out.println(context);
    }


    @Override
    public void setBeanName(String beanName)
    {
        System.out.println("Bean name is: " + beanName );
    }

}
