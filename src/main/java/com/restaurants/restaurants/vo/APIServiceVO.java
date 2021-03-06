package com.restaurants.restaurants.vo;


import com.restaurants.restaurants.utils.Constants;
import org.apache.tomcat.util.bcel.classfile.Constant;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class APIServiceVO implements Serializable {

	private static final long serialVersionUID = -3608660223448269470L;

	public APIServiceVO() {
		super();
	}
	public APIServiceVO(String apiCall) {
		super();
		this.apiCall = apiCall;
	}

	private int appStatusCode= Constants.APP_CODE_SUCCESS;
	private String payload=null;
	private String apiCall = Constants.EMPTY_STRING;

	public int getAppStatusCode() {
		return appStatusCode;
	}
	public void setAppStatusCode(int appStatusCode) {
		this.appStatusCode = appStatusCode;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	public void setApiCall(String apiCall) {
		this.apiCall = apiCall;
	}
	public String getApiCall() {
		return apiCall;
	}
}
