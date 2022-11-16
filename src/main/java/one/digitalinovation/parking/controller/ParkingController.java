package one.digitalinovation.parking.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinovation.parking.controller.dto.ParkingDTO;
import one.digitalinovation.parking.controller.mapper.ParkingMapper;
import one.digitalinovation.parking.model.Parking;
import one.digitalinovation.parking.service.ParkingService;

@RestController
@RequestMapping("/parking")
public class ParkingController {

	private final ParkingService parkingService = new ParkingService();
	private final ParkingMapper parkingMapper = new ParkingMapper();
	
	public ParkingService getParkingService() {
		return parkingService;
	}
	
	@GetMapping
	public List<ParkingDTO> findAll(){
		
		
/*		var parking = new Parking();
		parking.setColor("PRETO");
		parking.setLicense("MSG-0079");
		parking.setModel("RX-78-2 Gundam");
		parking.setState("SP");
	*/
		
		List<Parking> parkinglist = parkingService.findAll();
		List<ParkingDTO> result = parkingMapper.toParkingDTOList(parkinglist);
	//	for (Parking parking : parkinglist) {
		//	ParkingDTO dto = new ParkingDTO();
			//dto.setId(parking.getId());
		//}
		return result;
	}


}