package oop;

public class MainCar {

    public static void main(String[] args) {

        int[] ar = {3,7,6};

        System.out.println(ar);

        System.out.println(ar[1]);

        Car c = new Car();

        System.out.println(c);

        System.out.println(c.getBrand());

        c.toDrive();

        Car.fire();

        Car c1 = new Car(2020);

        System.out.println(c1.getYear());

        Car c2 = new Car(0.0001, -2023, 2, "Fignya");

        System.out.println(c2);

        Car c3 = new Car();
        c3.setEngine(1.5);
        c3.setYear(2023);
        c3.setModel("Civic");
        c3.setPrice(10000);

        System.out.println(c3);

        Car c4 = new Car()
                .withYear(2020)
                .withEngine(2.4);

        SportCar sc1 = new SportCar();
//        System.out.println(sc1.);
        Truck t1 = new Truck();

        Formula1 f1 = new Formula1();
        f1.sendSOS();

        f1.toSell();

        Movable.anyMethod();
        f1.otherMethod();

        Car c5 = new Formula1();

        Movable m1 = new Formula1();

//        oop.Movable m2 = new oop.Car();

        t1.toDrive();
        sc1.toDrive();
        f1.toDrive();

        Car[] cars = new Car[3];
        cars[0] = t1;
        cars[1] = sc1;
        cars[2] = f1;

        for(Car car : cars){
            car.toDrive();
        }

        Movable[] arr = new Movable[2];
        arr[0] = new Formula1();
        arr[1] = new Truck();

        for(Movable mov : arr){
            mov.sendSOS();
        }


    }

}



/*

            Stack                               Heap

    oop.Car c <------------- reference ------ { engine = 0.0
                                            year = 0
                                            electric = false
                                            colors = null
                                            colorCode = 0
                                            brand = HONDA
                                            model = null
                                           }
    oop.Car c1 <------------- reference ------ { engine = 0.0
                                            year = 2020
                                            electric = false
                                            colors = null
                                            colorCode = 0
                                            brand = HONDA
                                            model = null
                                           }


                        Inheritance
                                   X oop.Movable abstract sendSOS() X
                        oop.Car                                  Boat
             |                      |                   |           |
           oop.Truck                oop.SportCar            FishBoat       SportBoat
             |                      |             |         |       |
          oop.AutoTrain               oop.Formula1      Motor      Paddle   Jet
                        length

                       send SOS signal

                    Interface oop.Movable
                    sendSOS();



 */