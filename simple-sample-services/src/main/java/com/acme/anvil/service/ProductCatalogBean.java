package com.acme.anvil.service;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

import java.util.logging.Logger;


public class ProductCatalogBean implements SessionBean {
	
	private  Logger LOG = Logger.getLogger("MyLogger");
	

	private SessionContext sessionContext;

	public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException {
		this.sessionContext = ctx;
	}

	public void ejbRemove() throws EJBException, RemoteException {
		LOG.info("Called Remove.");
	}

	public void ejbActivate() throws EJBException, RemoteException {
		LOG.info("Called Activate");
	}

	public void ejbPassivate() throws EJBException, RemoteException {
		LOG.info("Called Passivate");
	}

	public void populateCatalog() {
		LOG.info("Do something.");
	}
}
