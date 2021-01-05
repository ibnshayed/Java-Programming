package bd.ac.seu.busdb;

import java.sql.Time;

public class Bus {
    private String busNumber;
    private String busName;
    private Destination destination;
    private int ticketPrice;
    private Time busLeftTime;
    private int totalSeatLimit;
    private int currentSeatAmount;

    public Bus() {
    }

    public Bus(String busNumber, String busName, Destination destination, int ticketPrice, int totalSeatLimit) {
        this.busNumber = busNumber;
        this.busName = busName;
        this.destination = destination;
        this.ticketPrice = ticketPrice;
        this.totalSeatLimit = totalSeatLimit;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Time getBusLeftTime() {
        return busLeftTime;
    }

    public void setBusLeftTime(Time busLeftTime) {
        this.busLeftTime = busLeftTime;
    }

    public int getTotalSeatLimit() {
        return totalSeatLimit;
    }

    public void setTotalSeatLimit(int totalSeatLimit) {
        this.totalSeatLimit = totalSeatLimit;
    }

    public int getCurrentSeatAmount() {
        return currentSeatAmount;
    }

}
