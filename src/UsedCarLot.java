import java.util.ArrayList;
/**
 * This class represents an array of Car objects
 *
 * @author Kaden Kwan
 */
public class UsedCarLot
{
    /** The ArrayList of car objects */
    private ArrayList<Car> inventory;

    /**
     * Instantiates a UsedCarLot object and initializes the inventory to an empty ArrayList
     * */
    public UsedCarLot()
    {
        inventory = new ArrayList<Car>();
    }

    /**
     * Returns the ArrayList of Car objects.
     *
     * @return The ArrayList of Car objects
     */
    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    /**
     * Adds a Car object at index a specified index i of inventory.
     * This method increases the size of inventory by 1.
     * <p>
     ** PRECONDITION: 0 &lt;= i &lt;= inventory.size()
     *
     * @param c The Car object
     * @param i The index of the Arraylist
     */
    public void addCar(int i, Car c)
    {
        inventory.add(i, c);
    }

    /**
     * Adds a Car object to the inventory.
     * This method increases the size of inventory by 1
     * @param c The Car object
     */

    public void addCar(Car c)
    {
        inventory.add(c);
    }

    /**
     * It swaps two objects of index f and s.
     * Returns true if the swap was successful or false if the swap was unsuccessful.
     *
     * @param f Index of first object
     * @param s Index of second object
     *
     * @return True or false
     */
    public boolean swap(int f, int s)
    {
        if(f < inventory.size() && f >= 0 && s < inventory.size() && s >= 0)
        {
            Car temp = inventory.get(f);
            inventory.set(f, inventory.get(s));
            inventory.set(s, temp);
            return true;
        }
        return false;
    }

    /**
     * Removes the Car at index indexOfCarToSell.
     * Returns the Car object that was removed when sold.
     * This method decreases the size of inventory by 1.
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell Index of the Car object
     *
     * @return The Car object removed when sold
     */

    public Car sellCarShift(int indexOfCarToSell)
    {
        Car sold = inventory.remove(indexOfCarToSell);
        return sold;

    }

    /**
     * Replaces the Car at index indexOfCarToSell with null.
     * Returns the Car object that was replaced when sold.
     * This method does not change the size of inventory.
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell Index of the Car object
     *
     * @return The Car object replaced when sold
     */

    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car sold = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return sold;
    }

    /**
     * Removes the Car object at index indexOfCarToMove.
     * Adds the removed Car object at index destinationIndex.
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size() destinationIndex &lt; inventory.size()
     *
     * @param indexOfCarToMove Index of the Car object
     * @param destinationIndex Index of where the Car object will be added
     */

    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car move = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, move);
    }

}
