package com.fds.vr.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VRCorporationAttendeeModel", propOrder = {
	"subject",
    "inspectionDate",
    "testingRegisteredPlace",
    "leaderName",
    "invitation",
	"registerednumber",
	"location"
})

@XmlRootElement(name = "VRCorporationAttendeeModel")
public class VRCorporationAttendeeModel {
	protected String subject;
	protected long inspectionDate;
	protected String testingRegisteredPlace;
	protected String leaderName;
	protected String invitation;
	protected String registerednumber;
	protected String location;

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public long getInspectionDate() {
		return inspectionDate;
	}
	public void setInspectionDate(long inspectionDate) {
		this.inspectionDate = inspectionDate;
	}
	public String getTestingRegisteredPlace() {
		return testingRegisteredPlace;
	}
	public void setTestingRegisteredPlace(String testingRegisteredPlace) {
		this.testingRegisteredPlace = testingRegisteredPlace;
	}
	public String getLeaderName() {
		return leaderName;
	}
	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}
	public String getInvitation() {
		return invitation;
	}
	public void setInvitation(String invitation) {
		this.invitation = invitation;
	}
	public String getRegisterednumber() {
		return registerednumber;
	}
	public void setRegisterednumber(String registerednumber) {
		this.registerednumber = registerednumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
