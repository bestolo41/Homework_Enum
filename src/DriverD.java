import java.util.Objects;

public class DriverD<D extends Bus> extends Driver{
    private final char category = 'B';

    public DriverD(String name, int experience) {
        super(name, experience);
    }

    public enum Capacity {
        ESPECIALLY_SMALL("до 10 мест"),
        SMALL("до 25"),
        AVERAGE ("40–50"),
        LARGE("60–80"),
        ESPECIALLY_LARGE("100–120 мест");

        private final String capacity;

        Capacity(String capacity) {
            this.capacity = capacity;
        }

        public String getCapacity() {
            return capacity;
        }
    }
    public void participation(D car) {
        System.out.println("Водитель " + getName() + " управляет автобусом " + car.getBrand() + " " + car.getModel() + " и участвует в заезде");
    }
    public void startMotion(D car) {
        System.out.println("Водитель " + getName() + " нажимает на газ автобуса " + car.getBrand() + " " + car.getModel());
    }


    public void endNotion(D car) {
        System.out.println("Водитель " + getName() + " нажимает на газ автобуса " + car.getBrand() + " " + car.getModel());
    }


    public void refueling(D car) {
        System.out.println("Водитель " + getName() + " заправляет автобус " + car.getBrand() + " " + car.getModel());
    }

    public char getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DriverD<?> driverD = (DriverD<?>) o;
        return category == driverD.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category);
    }

    @Override
    public String toString() {
        return "DriverD{" +
                "category=" + category +
                '}';
    }
}

