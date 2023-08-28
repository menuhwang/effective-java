package ch2.item11;

public class Address {
    private final String city;
    private final String road;
    private final short buildingNumber;

    public Address(String city, String road, int buildingNumber) {
        this.city = city;
        this.road = road;
        this.buildingNumber = (short) buildingNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof Address))
            return false;

        Address ad = (Address) o;
        return ad.buildingNumber == buildingNumber && ad.road.equals(road) && ad.city.equals(city);
    }

    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + road.hashCode();
        result = 31 * result + Short.hashCode(buildingNumber);
        return result;
    }
}
