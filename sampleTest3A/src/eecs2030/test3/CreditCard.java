package eecs2030.test3;

import java.util.Date;

/**
 * A CreditCard is a special type of Card. Each CreditCard has a name, date of birth,
 * expiry date and a PIN. The CreditCard and its expiry date form a composition. The
 * CreditCard and its PIN form a composition.
 */

public class CreditCard extends Card {

	private Date expiryDate;
	private PIN pin;

	/**
	 * Initializes this card with the given name and expiry date and a random
	 * number.
	 * 
	 * @param name
	 *            the name of this card. 
	 * @pre. name != null
	 * @param dob
	 *            the date of birth of the card holder
	 * @pre. dob != null
	 * @param expiryDate
	 *            the expiry date of this card. 
	 * @pre. expiryDate != null
	 */
	public CreditCard(String name, Date dob, Date expiryDate) {
		super(name, dob);
		expiryDate = new Date(expiryDate.getTime());
		pin = new PIN();

	}

	/**
	 * Returns the expiry date of the holder of this card.
	 * 
	 * @return the expiry date of the holder of this card.
	 */
	public Date getExpiryDate() {
		return new Date(this.expiryDate.getTime());
	}

	/**
	 * Returns the PIN of this card.
	 * 
	 * @return the PIN of this card.
	 */
	public PIN getPin() {

		PIN currPIN = new PIN(this.pin.toString());
		return currPIN;
	}

	/**
	 * Sets the PIN of this card to the given PIN.
	 * 
	 * @param pin
	 *            the pin of this card. 
	 * @pre. pin != null
	 */
	public void setPin(PIN pin) {
		this.pin = new PIN(pin.toString());

	}

	/**
	 * Tests whether this card is the same as the given object. Two cards the
	 * same if they have the same name, expiry date and PIN.
	 * 
	 * @param object
	 *            an object.
	 * @return true if this card is the same as the given object, false
	 *         otherwise.
	 */
	public boolean equals(Object object) {
		

		if(object != null && this.getClass() == object.getClass()) {
			CreditCard ob = (CreditCard) object;
			if(ob.getName().equals(this.getName()) && ob.getExpiryDate().equals(this.getExpiryDate()) && ob.getPin().equals(this.getPin())) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	// the hashCode method should be overridden but we don't to keep things
	// simpler

	/**
	 * Tests whether the PIN of this card is risky, that is, it consists of the
	 * day and month of the holder of this card. For example, if the birth date
	 * of the holder of this card is April 15, 1995 and the PIN is 1504 then
	 * this card is risky.
	 * 
	 * @return true if this card is risky, false otherwise.
	 */
	public boolean isRisky() {
		String mima = this.getPin().toString();
		
		if(mima.substring(0, 2).equals(this.getBirthDay()) && mima.substring(2, 4).equals(this.getBirthMonth())) {
			return true;
		}else {
		return false;
		}



	}

}
