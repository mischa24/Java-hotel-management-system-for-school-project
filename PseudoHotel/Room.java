public class Room {
    private int roomNumber;
    private RoomType type;
    private int floor;
    private double pricePerNight;
    private boolean smoking;

    public Room(int roomNumber, RoomType type, int floor, double pricePerNight, boolean smoking) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.floor = floor;
        this.pricePerNight = pricePerNight;
        this.smoking = smoking;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getType() {
        return type;
    }

    public int getFloor() {
        return floor;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isSmoking() {
        return smoking;
    }

    @Override
    public String toString() {
        return "Room #" + roomNumber + " (" + type + "), Floor: " + floor +
               ", Price/Night: €" + String.format("%.2f", pricePerNight) +
               ", Smoking: " + (smoking ? "Yes" : "No");
    }
}
