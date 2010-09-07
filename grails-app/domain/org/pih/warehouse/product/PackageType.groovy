package org.pih.warehouse.product;

import java.util.Date;


/**
 * Represents a means of packaging a single unit of product (e.g. bottle, vial, box etc)
 */
class PackageType  {
	
	String name
	String description
	Integer sortOrder = 0;
	Date dateCreated;
	Date lastUpdated;	
	
	static constraints = { 
		name(nullable:false)
		description(nullable:true)
		sortOrder(nullable:true)
	}	

	static mapping = {
		sort "sortOrder"
	}

	String toString() { return "$name"; }
	
	
}
