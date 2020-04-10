class Item {
	int id;
	String name;
	double price;

	//TODO add variable.
	char type;
	//TODO constructor

	public Item(int id, String name, double price, double type) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	//TODO setters and getters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	double taxReturn () {
		//TODO
		if(type = 'A') {
			return 0.15 * (0.18 * price);
		}
		if(type = 'B') {
			return 0.5 * (0.18 * price);
		}
		if(type = 'C') {
			return 0;
		}
	}
}