package ObjectOrintedAssigments.AbstractionAndEncapsulation.Rectangle;

public class Rectangle {

private double  length;
private double  width;

Rectangle (double length,double width) {
    this.length = length;
    this.width = width;

}

public double Perimeter(){
    return (2*length) + (2*width);
}

public double Area(){
return length * width;

}


public void setLength(double length){
    this.length = length;

}

    public void setWidth(double width){
        this.width = width;

    }

    public double getLength(){
    return length;
    }
    public double getWidth(){
        return width;
    }









}
