package demospringmvc.Entity;

public class goitap {
	private int PackageID;
	private String Name;
	private String Description;
	private float Price;
	private String Img;
	
	public int getPackageID() {
		return PackageID;
	}

	public void setPackageID(int packageID) {
		PackageID = packageID;
	}

	public goitap() {
		super();
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public String getImg() {
		return Img;
	}
	public void setImg(String img) {
		Img = img;
	}   
	
}

