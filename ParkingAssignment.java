import java.io.*;
import java.util.*;

/*
	1) floor
	2) ticket 
	3) parkingSpot
	4) vehicle
	5) parkingLot
*/

public enum VehicleCategory{
	TWOWHEELER
	BUS
	CAR
	TRUCK
}

public enum ParkingSpotType{
	TWOWHEELER{
		public double getPriceParking(int duration){
			return duration*10;
		}
	}
	BUS{
		public double getPriceParking(int duration){
			return duration*100;
		}
	}
	CAR{
		public double getPriceParking(int duration){
			return duration*50;
		}
	}
	TRUCK{
		public double getPriceParking(int duration){
			return duration*75;
		}
	}
}

class Vehicle{
	String vehicleNo;
	VehicleCategory vehicleCategory;
	public Vehicle(String vehicleNo,VehicleCategory vehicleCategory){
		this.vehicleNo = vehicleNo;
		this.vehicleCategory = vehicleCategory;
	}
	public VehicleCategory getVehicleCategory(){
		return vehicleCategory;
	}
}

class ParkingFloor{
	String name;
	Map<ParkingSpotType,Map<String,ParkingSpot>> parkingSlots;
	public ParkingFloor(String name,Map<ParkingSpotType,Map<String,ParkingSpot>> parkingSlots){
		this.name = name;
		this.parkingSpot = parkingSpot;
	}
	public ParkingSlot getRelevantParkingSpot(Vehilce vehicle){
		VehicleCategory vehicleCategory = vehicle.getVehicleCategory();
		ParkingSpotType parkingSpotType = pickCorrectSlot(vehicleCategory);
		Map<String,ParkingSpot> releventParkingSpot =  parkingSlots.get(parkingSpotType);
		ParkingSlot slots = null;
		for(Map.Entry<String,ParkingSpot> slot: releventParkingSpot){
			if(slot.getValue().isAvailable){
				slot.getValue().addVehicle(vehicle);
				slots = slot;
				break;
			}
		}
		return slots;
	}

	public ParkingSpotType pickCorrectSlot(VehicleCategory vehicleCategory){
		if(vehicleCategory.equals(VehicleCategory.TRUCK)){
			return ParkingSpotType.TRUCK;
		}
		if(vehicleCategory.equals(VehicleCategory.TWOWHEELER)){
			return ParkingSpotType.TWOWHEELER;
		}
		if(vehicleCategory.equals(VehicleCategory.CAR)){
			return ParkingSpotType.CAR;
		}
		if(vehicleCategory.equals(VehicleCategory.BUS)){
			return ParkingSpotType.BUS;
		}
		return null
	}

}

class Address{
	String name;
	String city;
	String state;
	public Address(String name,String city,String state){
		this.name = name;
		this.city = city;
		this.state = state;
	}
}

public class ParkingSpot{
	String name;
	Vehicle vehicle;
	boolean isAvailable;
	ParkingSpotType parkingSpotType;
	public ParkingSpot(String name,ParkingSpotType parkingSpotType){
		this.isAvailable = true;
		this.name = name;
		this.parkingSpotType = parkingSpotType;
	}
	public void addVehicle(Vehicle vehicle){
		this.vehicle = vehicle;
		this.isAvailable = false;
	}
	public void remove(){
		this.vehicle = null;
		this.isAvailable = true;
	}
	public ParkingSpotType getParkingSpotType(){
		return parkingSpotType;
	}
}

class Ticket{
	String ticketNumber;
	long startTime;
	long endTime;
	Vehicle vehicle;
	ParkingSpot parkingSpot;
	
	public Ticket(){

	}

	public Ticket(String ticketNumber,Vehicle vehicle,ParkingSpot parkingSpot){
		this.ticketNumber = ticketNumber;
		this.startTime = System.currentTimeMillis();
		this.vehicle = vehicle;
		this.parkingSpot = parkingSpot;
	}

	public Ticket createTicket(String ticketNumber,Vehicle vehicle,ParkingSpot parkingSpot){
		return new Ticket(ticketNumber,vehicle,parkingSpot);
	}
	public ParkingSpot getParkingSpot(){
		return parkingSpot;
	}
}
class ParkingLot{
	String name;
	Address address;
	List<ParkingFloor> parkingFloors;

	public ParkingLot(String name,Address address,List<ParkingFloor> parkingFloors){
		this.name = name;
		this.address = address;
		this.parkingFloors = parkingFloors;
	}

	public void addFloor(String name,Map<ParkingSpotType,Map<String,ParkingSpot>> slots){
		ParkingFloor parkingFloor = new ParkingFloor(name,slots);
		parkingFloors.add(parkingFloor);
	}
	public void removeFloor(ParkingFloor parkingFloor){
		parkingFloors.remove(parkingFloor);
	}

	public Ticket assignTicket(String ticketNumber,Vehicle vehicle,ParkingSpot parkingSpot){
		ParkingSpot parkingSpot = getRelevantParkingSpot(vehicle);
		if(parkingSpot == null){
			return null;
		}

		Ticket ticket = new Ticket()
		ticket.createTicket(ticketNumber,vehicle,parkingSpot);
		return ticket;
	}

	public ParkingSpot getRelevantParkingSpot(Vehilce vehicle){
		ParkingSlot slot = null;
		for(int i=0;i<parkingFloors.size();i++){
			slot = parkingFloors.get(i).getRelevantParkingSpot(vehicle);
			if(slot!=null){
				break;
			}
		}
		return slots;
	}
	public double scanAndPay(Ticket ticket){
		long endTime  = System.currentTimeMillis();
		ticket.getParkingSpot().removeVehicle(ticket.vehicle);
		int duration = (endTime - ticket.startTime)/1000;
		return ticket.getParkingSpot().getParkingSpotType().getPriceParking(duration);
	}
}
public class ParkingAssignment {
	public static void main(String[] args) {
		
	}
}
