package es.uma.lcc.caesium.evacuation.simulator.environment;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for handling domains, namely enclosed areas that the
 * pedestrians can navigate.
 * @author ccottap
 *
 */
public class Domain {
	/**
	 * id of the domain
	 */
	private final int id;
	/**
	 * name of the domain
	 */
	private String name;
	/**
	 * description of the domain
	 */
	private String description;
	/**
	 * height of the domain
	 */
	private final double height;
	/**
	 * width of the domain
	 */
	private final double width;
	/**
	 * list of obstacles in the domain
	 */
	private List<Obstacle> obstacles;
	/**
	 * list of accesses in the domain
	 */
	private List<Access> accesses;
	

	/**
	 * Creates an empty domain with the given id and dimensions. 
	 * Initially there are no obstacles or accesses.
	 * @param id The id of the domain
	 * @param width The width of the domain
	 * @param height The height of the domain
	 */
	public Domain (int id, double width, double height) {
		this.id = id;
		this.width = width;
		this.height = height;
		name = "domain" + id;
		description = "";
		obstacles = new ArrayList<Obstacle>();
		accesses = new ArrayList<Access>();
	}
	
	/**
	 * Returns the id of the domain
	 * @return the id of the domain
	 */
	public int id() {
		return id;
	}

	/**
	 * Returns the name of the domain
	 * @return the name of the domain
	 */
	public String getName() {
		return name;
	}


	/**
	 * Sets the name of the domain
	 * @param name of the domain
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * Returns the description of the domain
	 * @return the description of the domain
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * Sets the description of the domain
	 * @param description the description of the domain
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * Returns the height of the domain
	 * @return the height of the domain
	 */
	public double getHeight() {
		return height;
	}


	/**
	 * Returns the width of the domain
	 * @return the width of the domain
	 */
	public double getWidth() {
		return width;
	}
	
	
	/**
	 * Adds an obstacle to the domain
	 * @param o an obstacle
	 */
	public void addObstacle (Obstacle o) {
		obstacles.add(o);
	}
	
	/**
	 * Adds an access to the domain
	 * @param a an access
	 */
	public void addAccess (Access a) {
		accesses.add(a);
	}

	/**
	 * Returns the list of obstacles in the domain
	 * @return the obstacles
	 */
	public List<Obstacle> getObstacles() {
		return obstacles;
	}
	
	/**
	 * Returns the list of accesses in the domain
	 * @return the accesses
	 */
	public List<Access> getAccesses() {
		return accesses;
	}

	/**
	 * Returns a printable version of the domain
	 * @return a string version of the domain
	 */
	public String toString() {
		String str = "domain: {\n";
		str += "\tid: " + id + "\n";
		if (!name.isEmpty())
			str += "\tname: " + name + "\n";
		if (!description.isEmpty())
			str += "\tdescription: " + description + "\n";
		if (obstacles.size()>0) {
			str += "\tobstacles: [\n";
			for (Obstacle o: obstacles) 
				str += "\t\t" + o.toString().replace("\n", "\n\t\t") + "\n";
			str += "\t]\n";
		}
		if (accesses.size()>0) {
			str += "\taccesses: [\n";
			for (Access a: accesses) 
				str += "\t\t" + a.toString().replace("\n", "\n\t\t") + "\n";
			str += "\t]\n";
		}
		str += "}";
		return str;
	}

}