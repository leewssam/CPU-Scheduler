
class Process {
	private int processNum;
	private int arrivalTime;
	private int burstTime;
	private int priority;
	
	public Process() {
		
	}
	
	public Process(int n, int a, int b, int p) {
		this.processNum = n;
		this.arrivalTime = a;
		this.burstTime = b;
		this.priority = p;
	}
	
	public int getProcessNum() {
		return processNum;
	}
	
	public void setProcessNum(int n) {
		this.processNum = n;
	}
	
	public int getArrivalTime() {
		return arrivalTime;
	}
	
	public void setArrivalTime(int a) {
		this.arrivalTime = a;
	}
	
	public int getBurstTime() {
		return burstTime;
	}
		
	public void setBurstTime(int b) {
		this.burstTime = b;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public void setPriority(int p) {
		this.priority = p;
	}
	
}//end of class process
