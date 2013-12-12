package co.kr.genea.api.service;

import java.io.*;
import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path ("/")
public class HealthCheckResource 
{
	@GET
	@Path ("/healthcheck")
	@Produces("text/html")
	public StreamingOutput get()
	{
		return new StreamingOutput()
		{
			public void write(OutputStream output) throws
				IOException,
				WebApplicationException
			{
				String out = new String();
				out = "<html><head><title>Health check</title></head>";
				out += "<body><h1>Application is healthy!</h1><p>";
				out += new Date();
				out += "</p></body></html>";
				
				output.write(out.getBytes());
			}
		};
	}
	
	@GET
	@Produces("text/html")
	public StreamingOutput getHome()
	{
		return new StreamingOutput()
		{
			public void write(OutputStream output) throws
				IOException,
				WebApplicationException
			{
				String out = new String();
				out = "<html><head><title>Home</title></head>";
				out += "<body><h1>Welcome!</h1></body></html>";
				
				output.write(out.getBytes());
			}
		};
	}	
	
}
