/**
 * 
 */
package com.mvc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户角色
 * 
 * @author zjn
 * @date 2016年9月8日
 */
@Entity
@Table(name = "role")
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer role_id;
	private String role_name;
	private Integer role_state;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public Integer getRole_state() {
		return role_state;
	}

	public void setRole_state(Integer role_state) {
		this.role_state = role_state;
	}
}
