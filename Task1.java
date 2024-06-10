import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
    private String modelName;
    private int year;

    public Car(String modelName, int year) {
        this.modelName = modelName;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.year, other.year);
    }

    @Override
    public String toString() {
        return modelName + " (" + year + ")";
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota Camry", 2015));
        cars.add(new Car("Honda Accord", 2018));
        cars.add(new Car("Ford Mustang", 2013));
        cars.add(new Car("Chevrolet Malibu", 2016));
        cars.add(new Car("BMW 3 Series", 2014));
        cars.add(new Car("Audi A4", 2017));
        cars.add(new Car("Mercedes-Benz C-Class", 2019));
        cars.add(new Car("Hyundai Elantra", 2012));
        cars.add(new Car("Nissan Altima", 2020));
        cars.add(new Car("Volkswagen Passat", 2011));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
