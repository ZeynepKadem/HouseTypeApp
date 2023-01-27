package service.concretes;

import java.util.ArrayList;
import java.util.List;

import entity.abstracts.HouseType;
import repository.abstracts.HouseTypeRepository;
import service.abstracts.HouseTypeService;

public class HouseTypeManager implements HouseTypeService{

	

	private HouseTypeRepository houseTypeRepository;
	
	
	
	public HouseTypeManager(HouseTypeRepository houseTypeRepository) {
		super();
		this.houseTypeRepository = houseTypeRepository;
	}
	
	public int totalPrice(List<HouseType> houses) {
		int totalPrice = 0;
		for(HouseType house : houses) {
			totalPrice += house.getPrice();
			
		}return totalPrice;
		
		
	}
	
	public int avarageSquareMeter(List<HouseType> houses) {
		int avarageSquareMeter=0;
		for(HouseType house : houses) {
			avarageSquareMeter += house.getSquaremeter();
			
		}return avarageSquareMeter / houses.size();
	}
	
	public List<HouseType>filterHouseTypes (int roomCount, int hallCount,List<HouseType> houses){
		List<HouseType> filteredRoomAndHall = new ArrayList<>();
		for(HouseType house : houses) {
			if (house.getRoomCount()>= roomCount && house.getHallCount()>=hallCount) {
				filteredRoomAndHall.add(house);
			}
		}return filteredRoomAndHall;
	}

	@Override
	public int getTotalPriceOfHouses() {
		return totalPrice(houseTypeRepository.getHouseList());
	}

	@Override
	public int getTotalPriceOfAllHouses() {
		return totalPrice(houseTypeRepository.getAllHousesList());
	}

	@Override
	public int getTotalPriceOfVillas() {
		return totalPrice(houseTypeRepository.getVillaList());
		
	}

	@Override
	public int getTotalPriceOfSummerHouses() {
		return totalPrice(houseTypeRepository.getSummerHouseList());
	}

	@Override
	public int getAvarageHouseSquareMeter() {
		return avarageSquareMeter(houseTypeRepository.getHouseList());
	}

	@Override
	public int getAvarageAllHousesSquareMeter() {
		return avarageSquareMeter(houseTypeRepository.getAllHousesList());
	}

	@Override
	public int getAvarageVillaSquareMeter() {
		return avarageSquareMeter(houseTypeRepository.getVillaList());
	}

	@Override
	public int getAvarageSummerHousesSquareMeter() {
		return avarageSquareMeter(houseTypeRepository.getSummerHouseList());
		}

	@Override
	public List<HouseType> getFilteredHouseTypes(int roomCount, int hallCount) {
		
		return filterHouseTypes(roomCount, hallCount, null);
	}

}
