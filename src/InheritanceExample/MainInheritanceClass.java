package InheritanceExample;

public class MainInheritanceClass {

    public static void main(String[]args){
        System.out.println("-----------parent Vehicle class----------");
        Vehicle vehicle=new Vehicle();
        vehicle.start();
        vehicle.stop();
        vehicle.fuel();


        System.out.println("--------Child Air Vehicle Class-------------");
        AirVehicle airVehicle=new AirVehicle();
        airVehicle.travelOnAir();
        airVehicle.start();
        airVehicle.stop();
        airVehicle.fuel();

        System.out.println("-----------Child Water Vehicle Class------------");

        WaterVehicle waterVehicle=new WaterVehicle();
        waterVehicle.travelOnWater();
        waterVehicle.start();
        waterVehicle.stop();
        waterVehicle.fuel();


        System.out.println("-----------Child Road Vehicle Class-----------");
        RoadVehicle roadVehicle=new RoadVehicle();
        roadVehicle.travelOnRoad();
        roadVehicle.start();
        roadVehicle.stop();
        roadVehicle.fuel();
    }
}
