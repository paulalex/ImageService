package com.micro.imageservice.dto;

public class Image
{
	private final int id;
	private final String title;
	private final String url;


	public Image(final int id, final String title, final String url)
	{
		super();
		this.id = id;
		this.title = title;
		this.url = url;
	}


	public int getId()
	{
		return this.id;
	}


	public String getTitle()
	{
		return this.title;
	}


	public String getUrl()
	{
		return this.url;
	}
}
