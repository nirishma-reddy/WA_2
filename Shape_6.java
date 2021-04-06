public abstract class Shape_6
{
public abstract double area();
public abstract duble perimeter();
}
pubic class Rectangle extends Shape
{
private final double Width,length;
public Rectangle()
{
 this(1,1);
}
public Rectangle(double Width,double length)
{
    this.Width = Width;
    this.length = length;
}
public double perimeter()
{
return 2 * (Width + length);
}
}