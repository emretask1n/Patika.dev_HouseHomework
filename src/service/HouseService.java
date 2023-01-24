package service;

import data.HouseRepository;
import model.Bungalow;
import model.House;
import model.Townhouse;
import model.Villa;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    HouseRepository houseRepository = new HouseRepository();

    List<Villa> villas = houseRepository.getVillaList();
    List<Bungalow> bungalows = houseRepository.getBungalowList();
    List<Townhouse> townhouses = houseRepository.getTownhouseList();

    List<House> houses = houseRepository.getHouseList();


    public int getTotalPriceOfVillas() {
        return villas.stream().mapToInt(Villa::getPrice).sum();
    }

    public int getTotalPriceOfBungalows() {
        return bungalows.stream().mapToInt(Bungalow::getPrice).sum();
    }

    public int getTotalPriceOfTownhouses() {
        return townhouses.stream().mapToInt(Townhouse::getPrice).sum();
    }

    public int getTotalPriceOfHouses() {
        return houses.stream().mapToInt(House::getPrice).sum();
    }

    public int getAverageM2OfVillas() {
        return (int) villas.stream().mapToInt(Villa::getM2).average().orElse(0.0);
    }

    public int getAverageM2OfBungalows() {
        return (int) bungalows.stream().mapToInt(Bungalow::getM2).average().orElse(0.0);
    }

    public int getAverageM2OfTownhouses() {
        return (int) townhouses.stream().mapToInt(Townhouse::getM2).average().orElse(0.0);
    }

    public int getAverageM2OfHouses() {
        return (int) houses.stream().mapToInt(House::getM2).average().orElse(0.0);
    }

    public List<String> getAvailableHousesFilteredByRoomNumberAndSaloonNumber(int roomNumber, int saloonNumber){
        List<String> availableHouses = new ArrayList<>();
        houses.stream()
                .filter(h -> h.getRoomNumber() == roomNumber && h.getSaloonNumber() == saloonNumber)
                .map(House::toString)
                .forEach(availableHouses::add);

        return availableHouses;
    }

}
