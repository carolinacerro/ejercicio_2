package Interfaces;

/**
 * Created by Carolina on 27/09/2015.
 */
public class Rectangle extends AbstractShape{

    private int lado;
    private int altura;

    public Rectangle (int lado, int altura){
        super("rectangulo");
        this.altura=altura;
        this.lado=lado;
    }

    public int getLado (){
        return lado;
    }

    public int getAltura (){
        return altura;
    }

    public void setLado(int lado){
        this.lado=lado;
    }

    public void setAltura(int altura){
        this.altura=altura;
    }
    public double area() {
        return lado*altura;
    }
}
