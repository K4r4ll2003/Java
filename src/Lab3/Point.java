package Lab3;

public class Point
{
    private double x = 0.0;
    private double y = 0.0;

    Point(double x, double y){this.setXY(x,y);}

    Point(){}
    public double getX(){return x;}

    public void setX(double x){this.x = x;}

    public double getY(){return y;}

    public void setY(double y){this.y = y;}

    public void setXY(double x, double y){this.x =x; this.y = y;}

    public void move(double xDisp, double yDisp)
    {
        this.x += xDisp;
        this.y += yDisp;
    }

    public String toString()
    {
        return
                ", положение точки: x = " + x + " y = " + y;
    }
}