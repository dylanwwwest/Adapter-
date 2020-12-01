package csce247.assignments.adapter;

public class ShoeListingAdapter implements ProductListing {
	private ShoeListing shoe;
	private String title;
	private String brand;
	private double price;
	private String description;
	
	public ShoeListingAdapter(ShoeListing shoe)
	{
		return;
	}
	/*
	 * returns the title price and description of shoe listing
	 */
	public String getTitle()
	{
		return title;
		
	}
	public double getPrice()
	{
		return price;
		
	}
	public String getDescription()
	{
		return "Created by" + brand + "," + description;
		
	}

}
