package reservetion;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac , int cap){
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	// getters has return type and does not has arguments
	public int getCapacity() { // accessor method 
		return capacity;
	}
	
	public boolean isAc() {
		return ac;
	}
	
	public int getBusNo() {
		return busNo;
	}
	
	// setters has the arguments(int cap) does not have return type(void)
	public void setCapacity(int cap) { // mutator(to change the value)
		capacity = cap;
	}
	
	public void setAc(boolean val) {
		ac = val;
	}
	
	public void setBusNo(int no) {
		busNo = no;
	}
	
	void displayBusInfo() {
		System.out.println("Bus NO : " + busNo + " AC : " + ac + " Total Capacity : " + capacity);

	}
	
	

}
