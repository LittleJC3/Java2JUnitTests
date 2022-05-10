package fish;

public class Fish {
	private String name;
	public Fish() {
		try {
			setName("UNDEFINED");
		}
		catch (Exception ex) {}
		
	}
	public Fish(String name) throws Exception {
		setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		if (name.trim().length() == 0) {
			throw new Exception ("Fish.setName(); Name cannot be blank or empty");
		}
		this.name = name;
	}
 }
