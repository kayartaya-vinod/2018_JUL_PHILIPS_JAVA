package com.philips.dxr.dao;

public final class DaoFactory {

	public final static String TYPE = "dummy"; // jdbc, xml, sap, rest,...

	private DaoFactory() {
	}

	// various methods to manufature and return different implementations
	public static ContactsDao getContactsDao() throws DaoException {
		switch (TYPE) {
		case "dummy":
			return new ContactsDaoDummyImpl();
		default:
			throw new DaoException("DAO Not available for type: " + TYPE);
		}
	}
}
