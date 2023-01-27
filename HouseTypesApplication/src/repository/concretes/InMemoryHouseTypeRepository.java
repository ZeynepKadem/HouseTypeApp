package repository.concretes;

import java.util.ArrayList;
import java.util.List;

import entity.abstracts.HouseType;
import entity.concretes.House;
import entity.concretes.SummerHouse;
import entity.concretes.Villa;
import repository.abstracts.HouseTypeRepository;


public class InMemoryHouseTypeRepository implements HouseTypeRepository {

	
	public List<HouseType> houses = new ArrayList<>();
	public List<HouseType> villas = new ArrayList<>();
	public List<HouseType> summerHouses = new ArrayList<>();
	public List<HouseType> allHouses = new ArrayList<>();
	
	
	public InMemoryHouseTypeRepository() {
		houses.add(new House(1200000,140,4,2));
		villas.add(new Villa(1300000,150,5,2));
		summerHouses.add(new SummerHouse(1400000, 160,3,3));
		allHouses.addAll(houses);
		allHouses.addAll(villas);
		allHouses.addAll(summerHouses);		
	}

	@Override
	public List<HouseType> getHouseList() {
		
		return houses;
	}

	@Override
	public List<HouseType> getVillaList() {
		
		return villas;
	}

	@Override
	public List<HouseType> getSummerHouseList() {
		
		return summerHouses;
	}

	@Override
	public List<HouseType> getAllHousesList() {
		
		return allHouses;
	}
}
