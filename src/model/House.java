package model;

public class House {
    private int Price;
    private int m2;
    private int roomNumber;
    private int saloonNumber;

    public House(int price, int m2, int roomNumber, int saloonNumber) {
        this.Price = price;
        this.m2 = m2;
        this.roomNumber = roomNumber;
        this.saloonNumber = saloonNumber;
    }

    public House() {
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getSaloonNumber() {
        return saloonNumber;
    }

    public void setSaloonNumber(int saloonNumber) {
        this.saloonNumber = saloonNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "Price=" + Price +
                ", m2=" + m2 +
                ", roomNumber=" + roomNumber +
                ", saloonNumber=" + saloonNumber +
                '}';
    }

}
