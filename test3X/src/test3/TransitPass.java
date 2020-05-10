package test3;

import java.util.Date;

/**
 * The parent class for different kinds of passes used to
 * pay fares on a transit system. Every pass has an expiry
 * date that can only be modified by using the setExpiryDate
 * method. Every pass counts the number of times that it
 * has been used to pay a fare.
 *
 */
public abstract class TransitPass {
	private int timesUsed;
	
	private Date expiry;
	
	/**
	 * Initialize this transit pass so that its expiry date is
	 * equal to the given expiry date.
	 * 
	 * @param expiryDate the expiry date for this transit pass
	 */
	public TransitPass(Date expiryDate) {
		this.timesUsed = 0;
		this.setExpiryDate(expiryDate);
	}
	
	/**
	 * Returns a copy of the expiry date for this transit pass.
	 * 
	 * @return a copy of the expiry date for this transit pass
	 */
	public final Date getExpiryDate() {
		return new Date(this.expiry.getTime());
	}
	
	/**
	 * Sets the expiry date for this transit pass to the given
	 * date.
	 * 
	 * @param expiryDate the expiry date for this transit pass
	 */
	public final void setExpiryDate(Date expiryDate) {
		this.expiry = new Date(expiryDate.getTime());
	}
	
	
	/**
	 * Returns the number of times this pass has been used to
	 * pay a fare.
	 * 
	 * @return the number of times this pass has been used to
	 * pay a fare
	 */
	public final int getTimesUsed() {
		return this.timesUsed;
	}
	
	/**
	 * Returns true if this transit pass is valid for the given
	 * date and fare. A pass is valid if its expiry date is
	 * after the given date and if it can be used to pay
	 * the given fare amount.
	 * 
	 * @param date the date of the trip
	 * @param fare the fare amount for the trip
	 * @return true if this transit pass is valid for the given
	 * trip date and fare amount, and false otherwise
	 * @pre. fare &gt; 0
	 */
	public abstract boolean isValid(Date date, int fare);
	
	/**
	 * Use this transit pass to pay for a trip on the given
	 * date and fare amount, and increment the number of times
	 * that this pass has been used.
	 * 
	 * @param date the date of the trip
	 * @param fare the fare amount for the trip
	 * @throws RuntimeException if the transit pass is not
	 * valid for the given trip date and fare amount
	 * @pre. fare &gt; 0
	 */
	public void payFare(Date date, int fare) {
		this.timesUsed++;
	}
}
