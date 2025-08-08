
# Vehicle Management System 🚗🏍️

This project is a practical demonstration of Object-Oriented Programming (OOP) principles in Java, specifically focusing on **inheritance**. It models a real-world hierarchy with a generic `Vehicle` superclass and more specific `Car` and `Motorcycle` subclasses, each with unique attributes and methods. 

This project serves as a clear example of how to build reusable and extensible code by defining common features in a base class and specialized features in derived classes.

-----

## Core Concepts Demonstrated

  * **Inheritance**: The primary concept shown. `Car` and `Motorcycle` classes `extend` the `Vehicle` class, inheriting its fields (`vehicleBrand`, `manufactureYear`, etc.) and methods (`displayBasicInfo()`, `calculateResaleValue()`).
  * **Encapsulation**: Data and methods are bundled within classes. For example, the `Car` class encapsulates all the properties and actions related to a car.
  * **Polymorphism**: Although not the main focus, it's present. The `displayInfo()` method is defined in both `Car` and `Motorcycle`. When called from a `main` method, the correct version is executed depending on the object's actual type.

-----

## Class Structure 🏛️

The project is composed of four main classes that work together to demonstrate the inheritance hierarchy.

```
Vehicle (Superclass)
├── Car (Subclass)
└── Motorcycle (Subclass)

Main (Driver Class)
```

### `Vehicle.java` (Superclass)

This is the base class that defines the properties and behaviors common to all vehicles.

  * **Attributes**: `vehicleBrand`, `vehicleModel`, `manufactureYear`, `vehicleBasePrice`.
  * **Key Methods**:
      * `displayBasicInfo()`: Prints the common details of any vehicle.
      * `calculateResaleValue()`: Calculates the current market value of the vehicle, assuming a depreciation of 15% per year.

### `Car.java` (Subclass)

This class inherits from `Vehicle` and adds features specific to cars.

  * **Inherits**: All members from `Vehicle`.
  * **Own Attribute**: `carNumberOfDoors`.
  * **Key Methods**:
      * Uses the `super()` keyword to call the `Vehicle` constructor.
      * `calculateInsurance()` and `calculateMaintenanceCost()`: Costs are calculated based on the number of doors.
      * `displayInfo()`: Displays all car information by first calling `displayBasicInfo()` from the parent class.

### `Motorcycle.java` (Subclass)

This class also inherits from `Vehicle` and adds features specific to motorcycles.

  * **Inherits**: All members from `Vehicle`.
  * **Own Attribute**: `motorcycleHasSidecar` (boolean).
  * **Key Methods**:
      * Uses the `super()` keyword to call the `Vehicle` constructor.
      * `calculateInsurance()` and `calculateMaintenanceCost()`: Costs are higher if the motorcycle has a sidecar.
      * `displayInfo()`: Displays all motorcycle information, reusing code from the parent class.

### `Main.java` (Driver Class)

This class contains the `main` method to run the program. It creates instances (objects) of `Car` and `Motorcycle` and calls their `displayInfo()` methods to demonstrate the functionality of the entire system.

-----

## How to Compile and Run 🚀

To see the program in action, follow these steps from your terminal inside the `Vehicle Management` directory:

1.  **Compile all Java files:**
    ```bash
    javac *.java
    ```
2.  **Run the Main class:**
    ```bash
    java Main
    ```

-----

## Sample Output 🖥️

Running the `Main` class will produce the following output, which is also captured in the `Vehicle.png` file in this directory.

```text
---Car Info---
Brand: Porsche
Model: 718 Cayman GT4 RS
Year: 2024
Base Price: Rs2.55E7
Number of Doors: 2
Insurance: Rs7000.0
Maintenance: Rs4000.0
Resale Value: Rs18547843.75
 
---Car Info---
Brand: Toyota
Model: Camry
Year: 2023
Base Price: Rs3500000.0
Number of Doors: 4
Insurance: Rs9000.0
Maintenance: Rs5000.0
Resale Value: Rs2121875.0
 
---Motorcycle Info---
Brand: BMW
Model: M 1000 RR
Year: 2024
Base Price: Rs4900000.0
Has Sidecar: Yes
Insurance: Rs4000.0
Maintenance: Rs3000.0
Resale Value: Rs3540281.25
 
---Motorcycle Info---
Brand: Ducati
Model: Panigale V4
Year: 2023
Base Price: Rs3500000.0
Has Sidecar: No
Insurance: Rs2500.0
Maintenance: Rs2000.0
Resale Value: Rs2121875.0
 
```
