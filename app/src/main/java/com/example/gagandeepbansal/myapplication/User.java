package com.example.gagandeepbansal.myapplication;

import java.io.Serializable;


/**
 * The Class User.
 */
public class User implements Serializable {

	/** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The contact number. */
	private String contactNumber;

	/** The name. */
	private String name;

	/** The dob. */
	private String city;

	/** The dob. */
	private String dob;

	/** The email id. */
	private String emailId;

	/** The sex. */
	private Sex sex;

	/** The password. */
	private String password;

	
    /**
     * Instantiates a new user.
     */
    public User() {
		super();
	}


	/**
	 * Gets the contact number.
	 *
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return this.contactNumber;
	}

	/**
	 * Sets the contact number.
	 *
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(final String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return this.city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the city to set
	 */
	public void setCity(final String city) {
		this.city = city;
	}

	/**
	 * Gets the dob.
	 *
	 * @return the dob
	 */
	public String getDob() {
		return this.dob;
	}

	/**
	 * Sets the dob.
	 *
	 * @param dob the dob to set
	 */
	public void setDob(final String dob) {
		this.dob = dob;
	}

	/**
	 * Gets the email id.
	 *
	 * @return the emailId
	 */
	public String getEmailId() {
		return this.emailId;
	}

	/**
	 * Sets the email id.
	 *
	 * @param emailId the emailId to set
	 */
	public void setEmailId(final String emailId) {
		this.emailId = emailId;
	}


	/**
	 * @return the sex
	 */
	public Sex getSex() {
		return this.sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
	

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{" +
				"contactNumber='" + contactNumber + '\'' +
				", name='" + name + '\'' +
				", city='" + city + '\'' +
				", dob='" + dob + '\'' +
				", emailId='" + emailId + '\'' +
				", sex=" + sex +
				", password='" + password + '\'' +
				'}';
	}
}
