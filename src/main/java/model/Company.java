package model;

public class Company {
	private int comp_id;
	private String contact_name;
	private String company_name;
	private String phone;
	private String address;
	private String image;
	private String city;
	private String contact_email;

	public Company() {
		super();
	}

	public Company(int comp_id, String contact_name, String company_name, String phone, String address, String image,
			String city, String contact_email) {
		super();
		this.comp_id = comp_id;
		this.contact_name = contact_name;
		this.company_name = company_name;
		this.phone = phone;
		this.address = address;
		this.image = image;
		this.city = city;
		this.contact_email = contact_email;
	}

	public int getComp_id() {
		return comp_id;
	}

	public void setComp_id(int comp_id) {
		this.comp_id = comp_id;
	}

	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContact_email() {
		return contact_email;
	}

	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}
}