package csce247.assignments.adapter;

public class Product implements ProductListing {
	private String title;
	private double price;
	private String description;
	
	public Product(String title, double price, String description)
	{
		return;
	}
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
		return description;
		
	}
}
