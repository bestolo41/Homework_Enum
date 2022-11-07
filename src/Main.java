public class Main {
    public static void main(String[] args) {
        PassengerCar lada = new PassengerCar("Lada", "Vesta", 1.6, "Универса");
        PassengerCar kia = new PassengerCar("Kia", "Rio", 1.6, "Седан");
        PassengerCar vw = new PassengerCar("VW", "Polo", 1.6, "Седан");
        PassengerCar hyundai = new PassengerCar("Hyundai", "Solaris", 1.6, "Хетчбэк");

        Truck kamaz = new Truck("KAMAZ", "5490", 11.76, "свыше 12 тонн");
        Truck volvo = new Truck("Volvo", "FH16", 12.8,"свыше 12 тонн");
        Truck scania = new Truck("Scania", "R440", 12.7,"свыше 12 тонн");
        Truck daf = new Truck("DAF", "105 XF", 12.9,"свыше 12 тонн");

        Bus mersedes = new Bus("Mersedes", "Tourismo", 11.98,"40–50");
        Bus hyundaiBus = new Bus("Hyundai", "Universe", 12.3,"40–50");
        Bus daewoo = new Bus("Daewoo", "BH120F Royal Cruiser II", 11.1,"40–50");
        Bus higer = new Bus("Higer", "KLQ 6128 LQ", 9.46,"40–50");


//        lada.pitStop();
//        lada.bestLapTime();
//        lada.maxSpeed();
//
//        kia.pitStop();
//        kia.bestLapTime();
//        kia.maxSpeed();
//
//        vw.pitStop();
//        vw.bestLapTime();
//        vw.maxSpeed();
//
//        hyundai.pitStop();
//        hyundai.bestLapTime();
//        hyundai.maxSpeed();
//
//        kamaz.pitStop();
//        kamaz.bestLapTime();
//        kamaz.maxSpeed();
//
//        volvo.pitStop();
//        volvo.bestLapTime();
//        volvo.maxSpeed();
//
//        scania.pitStop();
//        scania.bestLapTime();
//        scania.maxSpeed();
//
//        daf.pitStop();
//        daf.bestLapTime();
//        daf.maxSpeed();
//
//        mersedes.pitStop();
//        mersedes.bestLapTime();
//        mersedes.maxSpeed();
//
//        hyundaiBus.pitStop();
//        hyundaiBus.bestLapTime();
//        hyundaiBus.maxSpeed();
//
//        daewoo.pitStop();
//        daewoo.bestLapTime();
//        daewoo.maxSpeed();
//
//        higer.pitStop();
//        higer.bestLapTime();
//        higer.maxSpeed();

        DriverB<PassengerCar> john = new DriverB<>("John", 5);
        DriverB<PassengerCar> mike = new DriverB<>("Mike", 5);
        DriverB<PassengerCar> alice = new DriverB<>("Alice", 5);
        DriverB<PassengerCar> jack = new DriverB<>("Jack", 5);

        DriverC<Truck> bob = new DriverC<>("Bob", 5);
        DriverC<Truck> nick = new DriverC<>("Nick", 5);
        DriverC<Truck> rachel = new DriverC<>("Rachel", 5);
        DriverC<Truck> patrick = new DriverC<>("Patrick", 5);

        DriverD<Bus> william = new DriverD<>("William", 5);
        DriverD<Bus> sarah = new DriverD<>("Sarah", 5);
        DriverD<Bus> george = new DriverD<>("George", 5);
        DriverD<Bus> joye = new DriverD<>("Joye", 5);

//        john.participation(lada);
//        mike.participation(kia);
//        alice.participation(hyundai);
//        jack.participation(vw);
//
//        bob.participation(kamaz);
//        nick.participation(volvo);
//        rachel.participation(scania);
//        patrick.participation(daf);
//
//        william.participation(mersedes);
//        sarah.participation(hyundaiBus);
//        george.participation(higer);
//        joye.participation(daewoo);

        System.out.println(lada);
        System.out.println(kia);

        System.out.println();

        System.out.println(PassengerCar.BodyType.identifyBodyType(lada));

        System.out.println(kamaz);

        System.out.println();

        System.out.println(Truck.Tonnage.identifyTonnage(volvo));

        System.out.println();

        System.out.println(daewoo);

        System.out.println();

        System.out.println(Bus.Capacity.identifyCapacity(daewoo));
    }
}