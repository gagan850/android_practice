/*
 *
 */
package com.example.gagandeepbansal.myapplication;

import java.io.Serializable;

/**
 * The Class Address.
 */
public class Address implements Serializable  {


	/** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The address id. */
	private String addressId;

	/** The location. */
	private String location;

	/** The address. */
	private String city;

	/** The longitude. */
	private Double longitude;

	/** The latitude. */
	private Double latitude;

	/** The zipcode. */
	private Integer zipcode;


	/**
	 * Instantiates a new address.
	 */
	public Address() {
		super();
	}



	/**
	 * Sets the zipcode.
	 *
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}


	/**
	 * Gets the location.
	 *
	 * @return the location
	 */
	public String getLocation() {
		return this.location;
	}

	/**
	 * Sets the location.
	 *
	 * @param location the location to set
	 */
	public void setLocation(final String location) {
		this.location = location;
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
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public Double getLongitude() {
		return this.longitude;
	}

	/**
	 * Sets the longitude.
	 *
	 * @param longitude the longitude to set
	 */
	public void setLongitude(final Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public Double getLatitude() {
		return this.latitude;
	}

	/**
	 * Sets the latitude.
	 *
	 * @param latitude the latitude to set
	 */
	public void setLatitude(final Double latitude) {
		this.latitude = latitude;
	}


	/**
	 * Gets the zipcode.
	 *
	 * @return the zipcode
	 */
	public Integer getZipcode() {
		return this.zipcode;
	}




	/**
	 * Gets the address id.
	 *
	 * @return the address id
	 */
	public String getAddressId() {
        return this.addressId;
    }

    /**
     * Sets the address id.
     *
     * @param addressId the new address id
     */
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

	@Override
	public String toString() {
		return "Address{" +
				"addressId='" + addressId + '\'' +
				", location='" + location + '\'' +
				", city='" + city + '\'' +
				", longitude=" + longitude +
				", latitude=" + latitude +
				", zipcode=" + zipcode +
				'}';
	}
}
