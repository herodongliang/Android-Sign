package com.example.entity;

import java.util.List;

/**
 * һ��Itemʵ����
 * 
 * @author zihao
 * 
 */
public class GroupStatusEntity {
	private boolean isSucceed=false;
	private String groupName;
	/** ����Item�����б� **/
	private List<ChildStatusEntity> childList;
	
	public boolean isSucceed() {
		return isSucceed;
	}

	public void setSucceed(boolean isSucceed) {
		this.isSucceed = isSucceed;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<ChildStatusEntity> getChildList() {
		return childList;
	}

	public void setChildList(List<ChildStatusEntity> childList) {
		this.childList = childList;
	}

}