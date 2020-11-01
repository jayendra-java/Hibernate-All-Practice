package com.hibernate.util.Hibpra;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Example {

	 public static void main( String[] args )
	    {
	        System.out.println( "Hello hjWorld!" );
	        if(sessionFactory!=null)
			  {
				  System.out.println("sucess");
			  }
			  else
			  {
				  System.out.println("fail");
			  }
	    }
	    private static SessionFactory sessionFactory;
		 private static StandardServiceRegistry standardServiceRegistry;
		  
		 
		  static{
			  System.out.println("hello static block");
			    if (sessionFactory == null) {
			      try {
			        // Create StandardServiceRegistry
			        standardServiceRegistry = new StandardServiceRegistryBuilder()
			            .configure()
			            .build();
			        // Create MetadataSources
			        MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
			        // Create Metadata
			        Metadata metadata = metadataSources.getMetadataBuilder().build();
			        // Create SessionFactory
			        sessionFactory = metadata.getSessionFactoryBuilder().build();
			      } catch (Exception e) {
			        e.printStackTrace();
			        if (standardServiceRegistry != null) {
			          StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
			        }
			      }
			    }
		  }
		  
		  public static SessionFactory getSessionFactory() {
			  if(sessionFactory!=null)
			  {
				  System.out.println("sucess");
			  }
			  else
			  {
				  System.out.println("fail");
			  }
			  return sessionFactory;
		  }



}
