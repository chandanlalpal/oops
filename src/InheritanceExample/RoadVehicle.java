package InheritanceExample;

public class RoadVehicle extends Vehicle {

    public void travelOnRoad(){
        System.out.println("these travels on road");
    }

    @Override
    public void start(){
        System.out.println("road vehicle started");

    }
    @Override
    public void stop(){
        System.out.println("road vehicle stopped");
    }
    @Override
    public void fuel(){
        System.out.println("road vehicle fueled");
    }
}
