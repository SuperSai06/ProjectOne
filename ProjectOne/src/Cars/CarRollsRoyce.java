package Cars;


public class CarRollsRoyce implements RollsRoyce {

	public int maxSpeed; 
	 
	
		
	
	
  
	public int getMaxSpeed() {
		return maxSpeed;
	}

	@Override
	public void startCar() {
		
		System.out.println("starting engine...");
		
	}

	@Override
	public void reverse() {
		
		System.out.println("Reversing Car...");
		
	}

	@Override
	public void speedup() {
		
		System.out.println("Car Accelerating...");
		
	}

	@Override
	public void turnright() {
		System.out.println("Turning Right...");
		
	}

	@Override
	public void slowdown() {
		System.out.println("Slowing Down...");
		
	}

	@Override
	public void turnleft() {
		System.out.println("Turning Left...");
		
	}

	@Override
	public void playRadio() {
		System.out.println("Playing Radio...");		
	}

	@Override
	public void turnOnAc() {
		System.out.println("Turning AC on...");
		
	}

	@Override
	public void turnOnGPS() {
		System.out.println("Turning GPS on...");
		
	}

	@Override
	public void StopCar() {
		
		System.out.println("stopping engine...");
		
	}

}
