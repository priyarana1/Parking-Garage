package parking;

/**
 * Represents a node in a vehicle's parking history.
 *
 * @author Priya Rana
 */
public class History {

    private Parking parking;
    private History next;

    /**
     * Creates a history node for a parking activity.
     *
     * @param parking the parking activity
     */
    public History(Parking parking) {
        this.parking = parking;
        this.next = null;
    }

    /**
     * Returns the parking activity stored in this node.
     *
     * @return the parking activity
     */
    public Parking getParking() {
        return parking;
    }

    /**
     * Returns the next history node.
     *
     * @return the next history node
     */
    public History getNext() {
        return next;
    }

    /**
     * Sets the next history node.
     *
     * @param next the next history node
     */
    public void setNext(History next) {
        this.next = next;
    }
}