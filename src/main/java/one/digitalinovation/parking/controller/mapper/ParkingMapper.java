package one.digitalinovation.parking.controller.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import one.digitalinovation.parking.controller.dto.ParkingDTO;
import one.digitalinovation.parking.model.Parking;

@Component
public class ParkingMapper {

	
	private static final ModelMapper MODEL_MAPPER = new ModelMapper();
	
	public ParkingDTO parkingDTO(Parking parking) {
		return MODEL_MAPPER.map(parking, ParkingDTO.class);
	}
	
	public List<ParkingDTO> toParkingDTOList(List<Parking> parkinglist) {
		// TODO Auto-generated method stub
		return parkinglist.stream().map(this::parkingDTO).collect(Collectors.toList());
	}

}
