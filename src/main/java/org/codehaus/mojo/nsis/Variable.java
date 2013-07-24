package org.codehaus.mojo.nsis;

public class Variable {
	private String key;
	private String value;
	
	public Variable() {
	}
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Variable(String key, String value) {
		this.key = key;
		this.value = value;
	}
}
