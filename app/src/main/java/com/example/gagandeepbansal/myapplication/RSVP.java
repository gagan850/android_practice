package com.example.gagandeepbansal.myapplication;

/**
 * The Enum RSVP.
 */
public enum RSVP {

    /** The accept. */
    ACCEPT(0),

    /** The deny. */
    DENY(1);


    /** The value. */
    private int value;

    /**
     * Instantiates a new three leg filter enum.
     *
     * @param value the value
     */
    RSVP(final int value) {
        setValue(value);
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Sets the value.
     *
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

}
