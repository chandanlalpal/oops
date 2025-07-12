package InheritanceExample;

public class AirVehicle extends Vehicle {
    public void travelOnAir(){

        System.out.println("these travels on air");
        super.color="green";
        System.out.println("color is: "+color);
        super.start();
    }

    @Override
    public void start(){
        System.out.println("Air vehicle started");

    }
    @Override
    public void stop(){
        System.out.println("Air vehicle stopped");
    }
    @Override
    public void fuel(){
        System.out.println("Air vehicle fueled");
    }


}
