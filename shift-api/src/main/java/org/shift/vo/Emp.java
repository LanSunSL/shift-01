package org.shift.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Emp implements Serializable {
	private Integer id ;
	private String name ;
	private String avatar;
	private Integer sex;
	private String phone ;
	private String id_card;
	private Date birthday;
	private Date hire_date;
	private Date dimission_date;
	private String education_degree;
	private Integer create_id;
	private Integer last_update_user_id;
	private Date create_time;
	private Date update_time;
	private Integer team_id;
	private Integer last_update_no;
	private Integer state;
	private String password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getId_card() {
		return id_card;
	}
	public void setId_card(String id_card) {
		this.id_card = id_card;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	public Date getDimission_date() {
		return dimission_date;
	}
	public void setDimission_date(Date dimission_date) {
		this.dimission_date = dimission_date;
	}
	public String getEducation_degree() {
		return education_degree;
	}
	public void setEducation_degree(String education_degree) {
		this.education_degree = education_degree;
	}
	public Integer getCreate_id() {
		return create_id;
	}
	public void setCreate_id(Integer create_id) {
		this.create_id = create_id;
	}
	public Integer getLast_update_user_id() {
		return last_update_user_id;
	}
	public void setLast_update_user_id(Integer last_update_user_id) {
		this.last_update_user_id = last_update_user_id;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public Integer getTeam_id() {
		return team_id;
	}
	public void setTeam_id(Integer team_id) {
		this.team_id = team_id;
	}
	public Integer getLast_update_no() {
		return last_update_no;
	}
	public void setLast_update_no(Integer last_update_no) {
		this.last_update_no = last_update_no;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", avatar=" + avatar + ", sex=" + sex + ", phone=" + phone
				+ ", id_card=" + id_card + ", birthday=" + birthday + ", hire_date=" + hire_date + ", dimission_date="
				+ dimission_date + ", education_degree=" + education_degree + ", create_id=" + create_id
				+ ", last_update_user_id=" + last_update_user_id + ", create_time=" + create_time + ", update_time="
				+ update_time + ", team_id=" + team_id + ", last_update_no=" + last_update_no + ", state=" + state
				+ ", password=" + password + "]";
	}
	
	
	

}
