package com.irsspace.irs_rs_2019_01_19_is1pt_grp_aivoyagers_irs_intelligent_rapid_shuttle;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Location")
@org.kie.api.definition.type.Description("Location Class for Student, School and Office location information")
public class irsLocation implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Location Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("Latitude")
	private java.lang.Double latitude;
	@org.kie.api.definition.type.Label("Longitude")
	private java.lang.Double longitude;
	@org.kie.api.definition.type.Label("Postal Code")
	private java.lang.Integer postalcode;

	public irsLocation() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(java.lang.Double latitude) {
		this.latitude = latitude;
	}

	public java.lang.Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(java.lang.Double longitude) {
		this.longitude = longitude;
	}

	public java.lang.Integer getPostalcode() {
		return this.postalcode;
	}

	public void setPostalcode(java.lang.Integer postalcode) {
		this.postalcode = postalcode;
	}

	public irsLocation(java.lang.String name, java.lang.Double latitude,
			java.lang.Double longitude, java.lang.Integer postalcode) {
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.postalcode = postalcode;
	}

}