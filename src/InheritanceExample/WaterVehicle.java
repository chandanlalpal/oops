package InheritanceExample;

public class WaterVehicle extends Vehicle
{
    public void travelOnWater(){
        System.out.println("These travels on Water");
    }
    @Override
    public void start(){
        System.out.println("water vehicle started");

    }
    @Override
    public void stop(){
        System.out.println("water vehicle stopped");
    }
    @Override
    public void fuel(){
        System.out.println("water vehicle fueled");
    }


}
