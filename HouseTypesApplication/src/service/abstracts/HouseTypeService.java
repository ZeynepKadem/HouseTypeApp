package service.abstracts;

import java.util.List;

import entity.abstracts.HouseType;

public interface HouseTypeService {

	int getTotalPriceOfHouses();

	int getTotalPriceOfAllHouses();

	int getTotalPriceOfVillas();

	int getTotalPriceOfSummerHouses();

	int getAvarageHouseSquareMeter();

	int getAvarageAllHousesSquareMeter();

	int getAvarageVillaSquareMeter();

	int getAvarageSummerHousesSquareMeter();

	List<HouseType> getFilteredHouseTypes(int roomCount, int hallCount);

	

}
