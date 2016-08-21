/*
 *
 */
package com.example.gagandeepbansal.myapplication;

import java.io.Serializable;


/**
 * The Class Guest.
 */
public class Guest implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The guest id. */
    private String guestId;

	/** The contact number. */
	private String contactNumber;

	/** The event. */
	private Event event;

	/** The rsvp ind. */
	private RSVP rsvpInd = RSVP.DENY;

	/** The guest count. */
	private Integer guestCount = 0;

	/** The rsvp comment. */
	private String rsvpComment;

	/**
	 * Instantiates a new guest.
	 */
	public Guest() {
		super();
	}

	/**
	 * Instantiates a new guest.
	 *
	 * @param event the event
	 * @param contactNumber the contact number
	 */
	public Guest(Event event, String contactNumber) {
        this.event = event;
        this.contactNumber = contactNumber;
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
	 * Gets the guest id.
	 *
	 * @return the guest id
	 */
	public String getGuestId() {
        return this.guestId;
    }

    /**
     * Sets the guest id.
     *
     * @param guestId the new guest id
     */
    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    /**
     * Gets the rsvp ind.
     *
     * @return the rsvp ind
     */
    public RSVP getRsvpInd() {
        return this.rsvpInd;
    }

    /**
     * Sets the rsvp ind.
     *
     * @param rsvpInd the new rsvp ind
     */
    public void setRsvpInd(RSVP rsvpInd) {
        this.rsvpInd = rsvpInd;
    }

    /**
	 * Gets the guest count.
	 *
	 * @return the guestCount
	 */
	public Integer getGuestCount() {
		return this.guestCount;
	}

	/**
	 * Sets the guest count.
	 *
	 * @param guestCount the guestCount to set
	 */
	public void setGuestCount(Integer guestCount) {
		this.guestCount = guestCount;
	}

	/**
	 * Gets the rsvp comment.
	 *
	 * @return the rsvpComment
	 */
	public String getRsvpComment() {
		return this.rsvpComment;
	}

	/**
	 * Sets the rsvp comment.
	 *
	 * @param rsvpComment the rsvpComment to set
	 */
	public void setRsvpComment(final String rsvpComment) {
		this.rsvpComment = rsvpComment;
	}

	/**
	 * Gets the event.
	 *
	 * @return the event
	 */
	public Event getEvent() {
		return this.event;
	}

	/**
	 * Sets the event.
	 *
	 * @param event the event to set
	 */
	public void setEvent(Event event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return "Guest{" +
				"guestId='" + guestId + '\'' +
				", contactNumber='" + contactNumber + '\'' +
				", event=" + event +
				", rsvpInd=" + rsvpInd +
				", guestCount=" + guestCount +
				", rsvpComment='" + rsvpComment + '\'' +
				'}';
	}
}
