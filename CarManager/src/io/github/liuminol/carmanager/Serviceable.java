package io.github.liuminol.carmanager;

public interface Serviceable {

	public boolean isReadyToService();

	public void addDistance(int additionalDisatance);
	
	public void addDistance(double addictionalDistance);

	public int getDistanceOnService();

}
