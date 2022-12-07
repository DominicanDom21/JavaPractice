package com.example.demo.data;

public class Room {

    private String RoomName; 
    private int RoomNumber; 
    private boolean Occupied; 
    private long id; 


    public Room() {
    }

    public Room(String RoomName, int RoomNumber, boolean Occupied, long id) {
        this.RoomName = RoomName;
        this.RoomNumber = RoomNumber;
        this.Occupied = Occupied;
        this.id = id;
    }

    public String getRoomName() {
        return this.RoomName;
    }

    public void setRoomName(String RoomName) {
        this.RoomName = RoomName;
    }

    public int getRoomNumber() {
        return this.RoomNumber;
    }

    public void setRoomNumber(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    public boolean isOccupied() {
        return this.Occupied;
    }

    public boolean getOccupied() {
        return this.Occupied;
    }

    public void setOccupied(boolean Occupied) {
        this.Occupied = Occupied;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Room RoomName(String RoomName) {
        setRoomName(RoomName);
        return this;
    }

    public Room RoomNumber(int RoomNumber) {
        setRoomNumber(RoomNumber);
        return this;
    }

    public Room Occupied(boolean Occupied) {
        setOccupied(Occupied);
        return this;
    }

    public Room id(long id) {
        setId(id);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Room)) {
            return false;
        }
        Room room = (Room) o;
        return Objects.equals(RoomName, room.RoomName) && RoomNumber == room.RoomNumber && Occupied == room.Occupied && id == room.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(RoomName, RoomNumber, Occupied, id);
    }

    @Override
    public String toString() {
        return "{" +
            " RoomName='" + getRoomName() + "'" +
            ", RoomNumber='" + getRoomNumber() + "'" +
            ", Occupied='" + isOccupied() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }
    
    
}
