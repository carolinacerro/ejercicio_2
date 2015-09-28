package Interfaces;

import java.awt.*;

/**
 * Created by Carolina on 27/09/2015.
 */
public abstract class AbstractShape implements Shape{
    private String tipo;

    public AbstractShape(String type){
        this.tipo=tipo;
    }
    @Override
    public String toString() {
        return "I'm a " + tipo;

    }


}