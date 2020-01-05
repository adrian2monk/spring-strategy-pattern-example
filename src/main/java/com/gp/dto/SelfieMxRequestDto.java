package com.gp.dto;

public class SelfieMxRequestDto {

	public long rppUserId;
	public String scanReference;
	public long getRppUserId() {
		return rppUserId;
	}
	public void setRppUserId(long rppUserId) {
		this.rppUserId = rppUserId;
	}
	public String getScanReference() {
		return scanReference;
	}
	public void setScanReference(String scanReference) {
		this.scanReference = scanReference;
	}
}
