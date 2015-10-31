package Shapes.com;


import Interfaces.AreaMeasureable;
import Interfaces.PerimeterMeasurable;
import Interfaces.VolumeMeasureable;

public abstract  class SpaceShape extends Shape implements AreaMeasureable, VolumeMeasureable {

    public SpaceShape(Vertex3D... vertexes) {
        super.addVertices(vertexes);
    }

    public double getVolume(){
        return 0;
    }

    public double getArea(){
        return 0;
    }
}
