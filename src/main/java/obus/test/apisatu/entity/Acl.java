package obus.test.apisatu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "acl")
public class Acl {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ai")
	private int ai;

	@Column(name = "action_id")
	private String actionId;

	@Column(name = "user_id")
	private String userId;

	public int getAi() {
		return ai;
	}

	public void setAi(int ai) {
		this.ai = ai;
	}

	public String getActionId() {
		return actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Acl [ai=" + ai + ", actionId=" + actionId + ", userId=" + userId + "]";
	}
}
