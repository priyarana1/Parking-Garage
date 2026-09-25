package parking;

/**
 * Represents a parking activity for a vehicle.
 *
 * @author Priya Rana
 */
public class Parking {

    private Vehicle vehicle;
    private Timestamp enter;
    private Timestamp exit;

    /**
     * Creates a parking activity when a vehicle enters a deck.
     *
     * @param vehicle the vehicle being parked
     * @param enter the entry timestamp
     */
    public Parking(Vehicle vehicle, Timestamp enter) {
        this.vehicle = vehicle;
        this.enter = enter;
        this.exit = null;
    }

    /**
     * Returns the vehicle associated with this parking activity.
     *
     * @return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Returns the entry timestamp.
     *
     * @return the entry timestamp
     */
    public Timestamp getEnter() {
        return enter;
    }

    /**
     * Returns the exit timestamp.
     *
     * @return the exit timestamp, or null if the vehicle has not exited
     */
    public Timestamp getExit() {
        return exit;
    }

    /**
     * Records the exit timestamp.
     *
     * @param exit the exit timestamp
     */
    public void setExit(Timestamp exit) {
        this.exit = exit;
    }

    /**
     * Returns a textual representation of this parking activity.
     *
     * @return the parking activity as a string
     */
    @Override
    public String toString() {
        return vehicle + " [entered: " + enter + "][exited: " + exit + "]";
    }
}