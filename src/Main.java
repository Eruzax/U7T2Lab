import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(5);
        ints.add(24);
        System.out.println(ints);

        ArrayList<Integer> numList = new ArrayList<Integer>();
        // numList empty: []

        numList.add(3);      //numList: [3]

        numList.add(0, 6);  //numList: [6, 3]

        numList.add(7); //numList : [6, 3, 7]

        numList.add(2, 8); //numList : [6, 3, 8, 7]

        numList.set(3, 9); // numList : [6, 3, 7, 9]

        numList.add(1, 2); // numList : [6, 2, 3, 7, 9]

        numList.add(1, numList.size()); //numList : [6, 5, 2, 3, 7, 9]

        numList.remove(4); // numList : [6, 5, 2, 3, 7]
        numList.set(numList.size() - 1, 0); //numList : [6, 5, 2, 3, 0]
        System.out.println(numList);

        // create an array with the known types
        Integer[] intsArray = {1, 2, 3, 4, 5};

        // use the Arrays.asList utility method to convert the array to a list "inline"
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        Car car1 = new Car("Mustang" , 12500);
        Car car2 = new Car("Camry" , 8400);
        Car car3 = new Car("Ram", 17200);
        Car[] carsArray = {car1, car2, car3};
        ArrayList<Car> carList = new ArrayList<>(Arrays.asList(carsArray));
        System.out.println(carList);
    }
}
