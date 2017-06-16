package org.shift.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Education implements Serializable {
	private Integer eid;
	private String title;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Education [eid=" + eid + ", title=" + title + "]";
	}
	
}
