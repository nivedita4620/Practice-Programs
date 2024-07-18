package com.demo.entity;

public class Product 
{
	private int id;
	private String pName;
	private String desc;
	private String price;
	private String brand;
	private String cate;
	
	
	public Product(int id, String pName, String desc, String price, String brand, String cate) {
		super();
		this.id = id;
		this.pName = pName;
		this.desc = desc;
		this.price = price;
		this.brand = brand;
		this.cate = cate;
	}


	public int getId()
	{
		return id;
	}


	public void setId(int id)
	{
		this.id = id;
	}


	public String getpName()
	{
		return pName;
	}


	public void setpName(String pName)
	{
		this.pName = pName;
	}


	public String getDesc()
	{
		return desc;
	}


	public void setDesc(String desc) 
	{
		this.desc = desc;
	}


	public String getPrice() 
	{
		return price;
	}


	public void setPrice(String price) 
	{
		this.price = price;
	}


	public String getBrand()
	{
		return brand;
	}


	public void setBrand(String brand)
	{
		this.brand = brand;
	}


	public String getCate() 
	{
		return cate;
	}


	public void setCate(String cate)
	{
		this.cate = cate;
	}

	
	@Override
	public String toString() {
		return "Product [id=" + id + ", pName=" + pName + ", desc=" + desc + ", price=" + price + ", brand=" + brand
				+ ", cate=" + cate + "]";
	}


	public static void main(String[] args)
	{
		
	}

}
