import service.HouseService;

public class Main {
    public static void main(String[] args) {
        HouseService service = new HouseService();
        System.out.println("Total price of Villas " + service.getTotalPriceOfVillas());
        System.out.println("Total price of Bungalows " + service.getTotalPriceOfBungalows());
        System.out.println("Total price of Townhouses " + service.getTotalPriceOfTownhouses());
        System.out.println("Total price of all types of Houses " + service.getTotalPriceOfHouses());
        System.out.println("Average M2 for Villas " + service.getAverageM2OfVillas());
        System.out.println("Average M2 for Bungalows " + service.getAverageM2OfBungalows());
        System.out.println("Average M2 for Townhouses " + service.getAverageM2OfTownhouses());
        System.out.println("Average M2 for all types of Houses " + service.getAverageM2OfHouses());
        System.out.println("Filtering example - Available houses for 3 rooms and 1 saloon number, " + service.getAvailableHousesFilteredByRoomNumberAndSaloonNumber(3,1));
    }
}