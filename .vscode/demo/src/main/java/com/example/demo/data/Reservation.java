package com.example.demo.data;

import java.sql.Date;
import java.util.Objects;

public class Reservation {
    
    private long reservationID;
    private long roomID; 
    private long guestID; 
    private Date reservationDate;


    public Reservation() {
    }

    public Reservation(long reservationID, long roomID, long guestID, Date reservationDate) {
        this.reservationID = reservationID;
        this.roomID = roomID;
        this.guestID = guestID;
        this.reservationDate = reservationDate;
    }

    public long getReservationID() {
        return this.reservationID;
    }

    public void setReservationID(long reservationID) {
        this.reservationID = reservationID;
    }

    public long getRoomID() {
        return this.roomID;
    }

    public void setRoomID(long roomID) {
        this.roomID = roomID;
    }

    public long getGuestID() {
        return this.guestID;
    }

    public void setGuestID(long guestID) {
        this.guestID = guestID;
    }

    public Date getReservationDate() {
        return this.reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Reservation reservationID(long reservationID) {
        setReservationID(reservationID);
        return this;
    }

    public Reservation roomID(long roomID) {
        setRoomID(roomID);
        return this;
    }

    public Reservation guestID(long guestID) {
        setGuestID(guestID);
        return this;
    }

    public Reservation reservationDate(Date reservationDate) {
        setReservationDate(reservationDate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Reservation)) {
            return false;
        }
        Reservation reservation = (Reservation) o;
        return reservationID == reservation.reservationID && roomID == reservation.roomID && guestID == reservation.guestID && Objects.equals(reservationDate, reservation.reservationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservationID, roomID, guestID, reservationDate);
    }

    @Override
    public String toString() {
        return "{" +
            " reservationID='" + getReservationID() + "'" +
            ", roomID='" + getRoomID() + "'" +
            ", guestID='" + getGuestID() + "'" +
            ", reservationDate='" + getReservationDate() + "'" +
            "}";
    }
    
}
