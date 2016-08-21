/*
 *
 */
package com.example.gagandeepbansal.myapplication;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;


/**
 * The Class Event.
 */
public class Event implements Serializable {

	/** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The event id. */
	private String eventId;

	/** The name. */
	private String name;

	/** The profile pic. */
	private String displayPic;

	/** The date. */
	private Date date;

	/** The time. */
	private String time;

	/** The address. */
	private Address address;

	/** The admin. */
	private List<User> admin;

	/** The photo folder path. */
	private String photoFolderPath;

	/** The owner. */
	private User owner;


	/**
	 * Instantiates a new event.
	 */
	public Event() {
		super();
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
	 * Gets the display pic.
	 *
	 * @return the displayPic
	 */
	public String getDisplayPic() {
		return this.displayPic;
	}

	/**
	 * Sets the display pic.
	 *
	 * @param displayPic the displayPic to set
	 */
	public void setDisplayPic(final String displayPic) {
		this.displayPic = displayPic;
	}

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public Date getDate() {
		return this.date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the date to set
	 */
	public void setDate(final Date date) {
		this.date = date;
	}

	/**
	 * Gets the time.
	 *
	 * @return the time
	 */
	public String getTime() {
		return this.time;
	}

	/**
	 * Sets the time.
	 *
	 * @param time the time to set
	 */
	public void setTime(final String time) {
		this.time = time;
	}



	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public Address getAddress() {
		return this.address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * Gets the admin.
	 *
	 * @return the admin
	 */
	public List<User> getAdmin() {
		return this.admin;
	}

	/**
	 * Sets the admin.
	 *
	 * @param admin the admin to set
	 */
	public void setAdmin(List<User> admin) {
		this.admin = admin;
	}

//	/**
//	 * Gets the guest.
//	 *
//	 * @return the guest
//	 */
//	public List<Guest> getGuest() {
//		return guest;
//	}
//
//	/**
//	 * Sets the guest.
//	 *
//	 * @param guest the guest to set
//	 */
//	public void setGuest(List<Guest> guest) {
//		this.guest = guest;
//	}

	/**
	 * Gets the owner.
	 *
	 * @return the owner
	 */
	public User getOwner() {
		return this.owner;
	}

	/**
	 * Sets the owner.
	 *
	 * @param owner the owner to set
	 */
	public void setOwner(User owner) {
		this.owner = owner;
	}

	/**
	 * Gets the photo folder path.
	 *
	 * @return the photoFolderPath
	 */
	public String getPhotoFolderPath() {
		return this.photoFolderPath;
	}

	/**
	 * Sets the photo folder path.
	 *
	 * @param photoFolderPath the photoFolderPath to set
	 */
	public void setPhotoFolderPath(final String photoFolderPath) {
		this.photoFolderPath = photoFolderPath;
	}

	@Override
	public String toString() {
		return "Event{" +
				"eventId='" + eventId + '\'' +
				", name='" + name + '\'' +
				", displayPic='" + displayPic + '\'' +
				", date=" + date +
				", time='" + time + '\'' +
				", address=" + address +
				", admin=" + admin +
				", photoFolderPath='" + photoFolderPath + '\'' +
				", owner=" + owner +
				'}';
	}
}
