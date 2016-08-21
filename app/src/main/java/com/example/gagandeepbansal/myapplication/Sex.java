package com.example.gagandeepbansal.myapplication;

/**
 * The Enum Sex.
 */
public enum Sex {

	/** The male. */
	MALE(0),
	
	/** The female. */
	FEMALE(1);
	

    /** The value. */
    private int value;

    /**
     * Instantiates a new three leg filter enum.
     *
     * @param value the value
     */
	Sex(final int value) {
        this.setValue(value);
    }

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public int getValue() {
		return value;
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

