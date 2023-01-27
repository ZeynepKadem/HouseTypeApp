package repository.abstracts;

import java.util.List;

import entity.abstracts.HouseType;

public interface HouseTypeRepository {

	List<HouseType> getHouseList();

	List<HouseType> getVillaList();

	List<HouseType> getSummerHouseList();

	List<HouseType> getAllHousesList();

}
