package com.infinium.um.login.entity;

import org.slf4j.MDC;

public class BaseRespone {

	/**
	 * 联调定位错误
	 */

	public static String TRACE_ID = "X-B3-TraceId";
	private String tid = MDC.get(TRACE_ID);
	
	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}
}
