package com.provise.grc.enterprise.management.model;


// TODO: Auto-generated Javadoc
/**
 * @author shreegowri.j
 * The Class ObjectIdModel.
 */
public class ObjectIdModel {	
	
	/** The object id. */
	private String objectId="";
	
	/** The group id. */
	private String groupId="";
	
	/** The schema id. */
	private String schemaId="";
	
	/**
	 * Instantiates a new object id model.
	 *
	 * @param objectId the object id
	 * @param groupId the group id
	 * @param schemaId the schema id
	 */
	public ObjectIdModel(String objectId, String groupId, String schemaId) {
		super();
		this.objectId = objectId;
		this.groupId = groupId;
		this.schemaId = schemaId;
	}
	
	/**
	 * Instantiates a new object id model.
	 */
	public ObjectIdModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Gets the object id.
	 *
	 * @return the object id
	 */
	public String getObjectId() {
		return objectId;
	}
	
	/**
	 * Sets the object id.
	 *
	 * @param objectId the new object id
	 */
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	
	/**
	 * Gets the group id.
	 *
	 * @return the group id
	 */
	public String getGroupId() {
		return groupId;
	}
	
	/**
	 * Sets the group id.
	 *
	 * @param groupId the new group id
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	
	/**
	 * Gets the schema id.
	 *
	 * @return the schema id
	 */
	public String getSchemaId() {
		return schemaId;
	}
	
	/**
	 * Sets the schema id.
	 *
	 * @param schemaId the new schema id
	 */
	public void setSchemaId(String schemaId) {
		this.schemaId = schemaId;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ObjectIdModel [objectId=" + objectId + ", groupId=" + groupId + ", schemaId=" + schemaId + "]";
	}	
	
}
