package model;

import org.springframework.web.multipart.MultipartFile;

public class ApplyForm {
	private String name;
	private String phone;
	private String address;
	private String sex;
	private String dob;
	private MultipartFile fileCV;
	

	public ApplyForm(String name, String phone, String address, String sex, String dob, MultipartFile fileCV) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.sex = sex;
		this.dob = dob;
		this.fileCV = fileCV;
	}

	public ApplyForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MultipartFile getFileCV() {
		return fileCV;
	}

	public void setFileCV(MultipartFile fileCV) {
		this.fileCV = fileCV;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
