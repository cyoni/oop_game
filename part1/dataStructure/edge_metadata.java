package dataStructure;

import java.io.Serializable;

public class edge_metadata implements edge_data, Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 4269760787650059514L;
	private double weight;
	private int src, dest;
	
	public edge_metadata(int x, int y, double weight) {
		src = x;
		dest = y;
		this.weight = weight;
	}
	
	@Override
	public int getSrc() {
		return src;
	}

	@Override
	public int getDest() {
		return dest;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInfo(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTag() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTag(int t) {
		// TODO Auto-generated method stub
		
	}

}
