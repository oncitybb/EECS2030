
/**
 * A weather statistics app calculates the 
 * minimum, maximum, and average temperature 
 * read so far from its subscribed weather station, if any.
 */
public class StatisticsApp extends WeatherObserver {

	/**
	 * Update the reading of this weather observer.
	 * Update the current temperature and the 
	 * maximum, minimum, and average accordingly.
	 */
	WeatherStation weatherStation;
	
	public void update() {
		/* Your Task */
		
		
	}

	/* See the method description in the parent class */
	public WeatherStation getWeatherStation() {
		/* Your Task */
		return weatherStation;
	}

	/* See the method description in the parent class */
	public void setWeatherStation(WeatherStation ws) {
		/* Your Task */ 
		ws.subscribe(this);
		weatherStation = ws;
	}

	/**
	 * Get the minimum temperature based on the readings so far.
	 * @return minimum temperature based on the readings so far
	 */
	public double getMinTemperature() {
		/* Your Task */

		return 0;
	}

	/**
	 * Get the maximum temperature based on the readings so far.
	 * @return maximum temperature based on the readings so far
	 */
	public double getMaxTemperature() {
		/* Your Task */
		return 0;
	}

	/**
	 * Get the average temperature based on the readings so far.
	 * @return average temperature based on the readings so far
	 */
	public double getAverageTemperature() {
		/* Your Task */
		return 0;
	}
}

