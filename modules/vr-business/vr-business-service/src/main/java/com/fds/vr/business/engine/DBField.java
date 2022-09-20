package com.fds.vr.business.engine;

/**
 * @author trungnt
 *
 */
public class DBField {
	private String name;
	private int type;

	public static DBField ins(String name, int type) {
		return new DBField(name, type);
	}

	public DBField(String name, int type) {
		this.setName(name);
		this.setType(type);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
