package Shapes.com;

import Interfaces.AreaMeasureable;
import Interfaces.PerimeterMeasurable;

public abstract class PlaneShape extends Shape implements  PerimeterMeasurable,AreaMeasureable,Comparable {
    private double perimeter;
    public PlaneShape(Vertex2D... vertexes) {
        super.addVertices(vertexes);
        this.perimeter=this.getPerimeter();
    }


    public double getPerimeter(){
        return 0;
    }

    public double getArea(){
        return 0;
    }


}
