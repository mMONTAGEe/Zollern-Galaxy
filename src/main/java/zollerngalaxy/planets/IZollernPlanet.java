package zollerngalaxy.planets;

public interface IZollernPlanet {
	
	/**
	 * This only applies if the planet is radioactive. It returns the radiation
	 * level.
	 * 
	 * @return Radiation level of the planet.
	 */
	public float getRadiationLevel();
	
	/**
	 * This only applies if the planet is toxic. It returns the toxicity level.
	 * 
	 * @return Toxicity level of the planet.
	 */
	public float getToxicLevel();
	
	/**
	 * Determines the base temperature of the planet.
	 * 
	 * @return The planet's base temperature.
	 */
	public float getPlanetTemperature();
	
	/**
	 * Determines if planet is breathable.
	 * 
	 * @return True/False
	 */
	public boolean getIsBreathable();
	
	/**
	 * Whether or not a planet has precipitation.
	 * 
	 * @return True/False
	 */
	public boolean getHasRain();
	
	/**
	 * The level of wind on the planet.
	 * 
	 * @return Wind level.
	 */
	public float getWindLevel();
	
	/**
	 * Gets the density of the atmosphere. Affects sound and gravity. 1.0F is
	 * like Overworld.
	 * 
	 * @return Atmospheric density.
	 */
	public float getAtmosphericDensity();
}