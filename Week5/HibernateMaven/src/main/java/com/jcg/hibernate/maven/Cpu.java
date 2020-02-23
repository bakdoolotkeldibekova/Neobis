package Entity;

public class Cpu {
	private int id;
	private String model;
	private int nucleus;
	private double frequency;

	//constructors
	public Cpu(){};
	public Cpu(int id, String model, int nucleus, double frequency){
		this.id = id;
		this.model = model;
		this.nucleus = nucleus;
		this.frequency = frequency;
	}
	public Cpu(String model, int nucleus, double frequency){
		this.model = model;
		this.nucleus = nucleus;
		this.frequency = frequency;
	}

	//getters&setters
	public String getModel() {
		return model;
	}
	public int getNucleus() {
		return nucleus;
	}
	public double getFrequency() {
		return frequency;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public void setNucleus(int nucleus) {
		this.nucleus = nucleus;
	}
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Cpu{" +
				"id=" + id +
				", model='" + model + '\'' +
				", nucleus=" + nucleus +
				", frequency=" + frequency +
				'}';
	}
}
