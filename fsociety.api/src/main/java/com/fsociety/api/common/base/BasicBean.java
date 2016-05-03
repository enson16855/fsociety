package com.fsociety.api.common.base;

import java.io.Serializable;

import com.fsociety.api.util.JsonUtil;

/**
 * 实体超类
 * 
 * @author enson16855
 * 
 */
public class BasicBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return JsonUtil.serialize(this);
	}

}
