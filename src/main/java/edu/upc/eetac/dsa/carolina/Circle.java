package Interfaces;

/**
 * Created by Carolina on 27/09/2015.
 */
public class Circle extends AbstractShape{

    private double radio;

    public Circle(double radio){
        super("circle");
    }

    public double getRadio (){
        return radio;
    }

    public void setRadio (double radio){
        this.radio=radio;

    }

    public double area() {
        return Math.PI * radio * radio;
    }


}
