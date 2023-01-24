package data;

import model.Bungalow;
import model.House;
import model.Townhouse;
import model.Villa;

import java.util.Arrays;
import java.util.List;

public class HouseRepository {
    Villa villa1 = new Villa(10000, 200, 7, 2);
    Villa villa2 = new Villa(9000, 180, 5, 1);
    Villa villa3 = new Villa(13000, 230, 8, 3);

    Townhouse townhouse1 = new Townhouse(7500, 120, 5,2);
    Townhouse townhouse2 = new Townhouse(6500, 110, 4,1);
    Townhouse townhouse3 = new Townhouse(5500, 100, 3,1);

    Bungalow bungalow1 = new Bungalow(1000,30,3,1);
    Bungalow bungalow2 = new Bungalow(1000,25,3,1);
    Bungalow bungalow3 = new Bungalow(1000,33,3,1);

    public  List<Villa> getVillaList(){

        return Arrays.asList(villa1, villa2, villa3);
    }

    public  List<Townhouse> getTownhouseList(){

        return Arrays.asList(townhouse1, townhouse2, townhouse3);
    }

    public  List<Bungalow> getBungalowList(){

        return Arrays.asList(bungalow1, bungalow2, bungalow3);
    }

    public List<House> getHouseList(){
        return Arrays.asList(villa1,villa2,villa3,townhouse1, townhouse2, townhouse3,bungalow1, bungalow2, bungalow3);
    }
}


