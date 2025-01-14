package main.java.nl.tue.ieis.is.correlation.graph;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.joda.time.Duration;

public class Edge extends DefaultWeightedEdge {

	private static final long serialVersionUID = -7135615591840866891L;
	
	private Node source;
	private Node dest;
	private double occurance;
	private double chance;
	private Duration averageDuration;
	private long standardDeviation;
	
	public Node getSource() {
		return source;
	}

	public void setSource(Node source) {
		this.source = source;
	}

	public Node getDest() {
		return dest;
	}

	public void setDest(Node dest) {
		this.dest = dest;
	}

	public double getOccurance() {
		return occurance;
	}

	public void setOccurance(double occurance) {
		this.occurance = occurance;
	}

	public double getChance() {
		return chance;
	}

	public void setChance(double chance) {
		this.chance = chance;
	}

	public Edge(Node source, Node dest, double occurance, double chance, Duration avgDuration) {
		super();
		this.source = source;
		this.dest = dest;
		this.occurance = occurance;
		this.chance = chance;
		this.averageDuration = avgDuration;
	}

	@Override
	public String toString() {
		double weight = getWeight();
		int w = (int) weight;
	    return w + "";
	}
	
	public boolean equals(Object o) {
		return ((o instanceof Edge) 
				&& ((((Edge) o).getSource().getActivityName()).contentEquals(this.source.getActivityName())) 
				&& (((Edge) o).getDest().getActivityName()).contentEquals(this.dest.getActivityName()));
	}
	
	public int hashCode() {
        return source.getActivityName().hashCode() ^ dest.getActivityName().hashCode();
    }

	public Duration getAverageDuration() {
		return averageDuration;
	}

	public void setAverageDuration(Duration averageDuration) {
		this.averageDuration = averageDuration;
	}

	public long getStandardDeviation() {
		return standardDeviation;
	}

	public void setStandardDeviation(long standardDeviation) {
		this.standardDeviation = standardDeviation;
	}
	
}
