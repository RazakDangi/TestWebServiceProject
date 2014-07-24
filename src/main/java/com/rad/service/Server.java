package com.rad.service;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.webapp.WebAppContext;



public class Server {
	
	public Server() throws Exception{
		
		org.eclipse.jetty.server.Server server= new org.eclipse.jetty.server.Server();
		
		ServerConnector connector= new ServerConnector(server);
		connector.setPort(8080);
		
		server.setConnectors(new Connector[]{connector});
		
		
		HandlerCollection handlers= new HandlerCollection();
		WebAppContext webAppContext = new WebAppContext();
		webAppContext.setContextPath("/service");
		webAppContext.setWar("target/MyFirstWebServiceProject-0.0.1-SNAPSHOT.war");
		
		handlers.setHandlers(new Handler[]{webAppContext,new DefaultHandler()});
		server.setHandler(handlers);
		server.start();
		server.join();
		System.out.println( server.getURI());
	}

	public static void main(String[] args) {
		try {
			new Server();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
