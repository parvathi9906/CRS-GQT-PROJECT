/**
 * 
 */
package com.gqt.crs.entity;

/**
 * @author parvathi
 *
 */
public class Admin {
   private int admin_id;
   private String admin_name;
/**
 * @param admin_id
 * @param admin_name
 */
public Admin(int admin_id, String admin_name) {
	super();
	this.admin_id = admin_id;
	this.admin_name = admin_name;
}
/**
 * @return the admin_id
 */
public int getAdmin_id() {
	return admin_id;
}
/**
 * @param admin_id the admin_id to set
 */
public void setAdmin_id(int admin_id) {
	this.admin_id = admin_id;
}
/**
 * @return the admin_name
 */
public String getAdmin_name() {
	return admin_name;
}
/**
 * @param admin_name the admin_name to set
 */
public void setAdmin_name(String admin_name) {
	this.admin_name = admin_name;
}
}
