import java.time.Year;
class Vehicle
{
    String vehicleBrand,vehicleModel;
    int manufactureYear;
    double vehicleBasePrice;

    Vehicle(String vehicleBrand,String vehicleModel,int manufactureYear,double vehicleBasePrice)
    {
        this.vehicleBrand=vehicleBrand;
        this.vehicleModel=vehicleModel;
        this.manufactureYear=manufactureYear;
        this.vehicleBasePrice=vehicleBasePrice;
    }

    void displayBasicInfo()
    {
        System.out.println("Brand: "+vehicleBrand);
        System.out.println("Model: "+vehicleModel);
        System.out.println("Year: "+manufactureYear);
        System.out.println("Base Price: Rs"+vehicleBasePrice);
    }

    double calculateResaleValue()
    {
        int vehicleAge=Year.now().getValue()-manufactureYear;
        double resaleValue=vehicleBasePrice;
        for(int i=0;i<vehicleAge;i++)
        {
            resaleValue*=0.85;
        }
        return resaleValue;
    }
}

class Car extends Vehicle
{
    int carNumberOfDoors;

    Car(String vehicleBrand,String vehicleModel,int manufactureYear,double vehicleBasePrice,int carNumberOfDoors)
    {
        super(vehicleBrand,vehicleModel,manufactureYear,vehicleBasePrice);
        this.carNumberOfDoors=carNumberOfDoors;
    }

    double calculateInsurance()
    {
        return 5000+1000*carNumberOfDoors;
    }

    double calculateMaintenanceCost()
    {
        return 3000+500*carNumberOfDoors;
    }

    void displayInfo()
    {
        System.out.println("<---Car Info--->");
        displayBasicInfo();
        System.out.println("Number of Doors: "+carNumberOfDoors);
        System.out.println("Insurance: Rs"+calculateInsurance());
        System.out.println("Maintenance: Rs"+calculateMaintenanceCost());
        System.out.println("Resale Value: Rs"+calculateResaleValue());
        System.out.println(" ");
    }
}
class Motorcycle extends Vehicle
{
    boolean motorcycleHasSidecar;

    Motorcycle(String vehicleBrand,String vehicleModel,int manufactureYear,double vehicleBasePrice,boolean motorcycleHasSidecar)
    {
        super(vehicleBrand,vehicleModel,manufactureYear,vehicleBasePrice);
        this.motorcycleHasSidecar=motorcycleHasSidecar;
    }

    double calculateInsurance()
    {
        if(motorcycleHasSidecar)
        {
            return 2500+1500;
        }
        else
        {
            return 2500;
        }
    }

    double calculateMaintenanceCost()
    {
        if(motorcycleHasSidecar)
        {
            return 2000+1000;
        }
        else
        {
            return 2000;
        }
    }

    void displayInfo()
    {
        System.out.println("<---Motorcycle Info--->");
        displayBasicInfo();
        if(motorcycleHasSidecar)
        {
            System.out.println("Has Sidecar: Yes");
        }
        else
        {
            System.out.println("Has Sidecar: No");
        }
        System.out.println("Insurance: Rs"+calculateInsurance());
        System.out.println("Maintenance: Rs"+calculateMaintenanceCost());
        System.out.println("Resale Value: Rs"+calculateResaleValue());
        System.out.println(" ");
    }
}
class Main
{
    public static void main(String[] args)
    {
        Car myCar = new Car("Porsche", "718 Cayman GT4 RS", 2024, 25500000, 2);
myCar.displayInfo();

        Car myCar2 = new Car("Toyota", "Camry", 2023, 3500000, 4);
myCar2.displayInfo();   

        Motorcycle myBike = new Motorcycle("BMW", "M 1000 RR", 2024, 4900000, true);
myBike.displayInfo();

        Motorcycle myBike2 = new Motorcycle("Ducati", "Panigale V4", 2023, 3500000, false);
        myBike2.displayInfo();
    }
}