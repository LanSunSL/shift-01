package org.shift.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Team implements Serializable {
	private Integer team_id ;
	private String name;
	private Integer leader_id;
	public Integer getTeam_id() {
		return team_id;
	}
	public void setTeam_id(Integer team_id) {
		this.team_id = team_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLeader_id() {
		return leader_id;
	}
	public void setLeader_id(Integer leader_id) {
		this.leader_id = leader_id;
	}
	@Override
	public String toString() {
		return "Team [team_id=" + team_id + ", name=" + name + ", leader_id=" + leader_id + "]";
	}
	
	
}
