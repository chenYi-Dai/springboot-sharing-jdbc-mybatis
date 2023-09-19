package com.infinium.um.login.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.infinium.um.login.util.ErrorCodes;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 通用返回对象长亮网关标准
 * @author dfenghuang
 *
 */
public class ResponeModel extends BaseRespone{

	
	private CommRes comm_res=new CommRes();
	private CommSys sys = new CommSys();
	private Object output;
	
	public static ResponeModel ok() {
		return new ResponeModel();
	}
	
	public static ResponeModel ok(Object output) {
		ResponeModel responeModel = new ResponeModel();
		responeModel.setOutput(output);
		return responeModel;
	}
	
	public static ResponeModel error(ErrorCodes errorCodes) {
		ResponeModel responeModel = new ResponeModel();
		responeModel.getSys().setErorcd(errorCodes.code());
		responeModel.getSys().setErortx(errorCodes.msg());
		return responeModel;
	}
	public static ResponeModel error(String code,String msg) {
		ResponeModel responeModel = new ResponeModel();
		responeModel.getSys().setErorcd(code);
		responeModel.getSys().setErortx(msg);
		return responeModel;
	}
	public static ResponeModel error(ErrorCodes errorCodes,String msg) {
		ResponeModel responeModel = new ResponeModel();
		responeModel.getSys().setErorcd(errorCodes.code());
		responeModel.getSys().setErortx(errorCodes.msg());
		responeModel.getSys().setErortx(StringUtils.isNotEmpty(msg)?msg:errorCodes.msg());
		return responeModel;
	}
	public CommRes getComm_res() {
		return comm_res;
	}
	public void setComm_res(CommRes comm_res) {
		this.comm_res = comm_res;
	}
	public CommSys getSys() {
		return sys;
	}
	public void setSys(CommSys sys) {
		this.sys = sys;
	}
	public Object getOutput() {
		return output;
	}
	public void setOutput(Object output) {
		this.output = output;
	}
	public static class CommRes {
		private String initiator_seq;
		private String initiator_date;

		private String trxn_date;
		private String busi_seq;
		private String version;
		private String multiple_page_flag;
		//非翻页请求，不可赋值；首次查询时由核心生成，后续翻页时必须上送该项。
		private String query_token;
		//query_timestamp 高阳核心新增字段，详解见：RequestCcbsModel.getCcbsHeader.inputArea.MutpPagQury.mutpPagQuryTmtp
		private String query_timestamp;
		private Integer total_count;
		private Integer page_size;

		public String getInitiator_seq() {
			return initiator_seq;
		}
		public void setInitiator_seq(String initiator_seq) {
			this.initiator_seq = initiator_seq;
		}
		public String getInitiator_date() {
			return initiator_date;
		}
		public void setInitiator_date(String initiator_date) {
			this.initiator_date = initiator_date;
		}

		public String getBusi_seq() {
			return busi_seq;
		}

		public void setBusi_seq(String busi_seq) {
			this.busi_seq = busi_seq;
		}

		public String getTrxn_date() {
			return trxn_date;
		}

		public void setTrxn_date(String trxn_date) {
			this.trxn_date = trxn_date;
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getMultiple_page_flag() {
			return multiple_page_flag;
		}

		public void setMultiple_page_flag(String multiple_page_flag) {
			this.multiple_page_flag = multiple_page_flag;
		}

		public String getQuery_token() {
			return query_token;
		}

		public void setQuery_token(String query_token) {
			this.query_token = query_token;
		}

		public String getQuery_timestamp() {
			return query_timestamp;
		}

		public void setQuery_timestamp(String query_timestamp) {
			this.query_timestamp = query_timestamp;
		}

		public Integer getTotal_count() {
			return total_count;
		}

		public void setTotal_count(Integer total_count) {
			this.total_count = total_count;
		}

		public Integer getPage_size() {
			return page_size;
		}

		public void setPage_size(Integer page_size) {
			this.page_size = page_size;
		}


	}
	
	public static class CommSys {
		
		private String erorcd = ErrorCodes.SUCCESS.code();
		private String erortx = ErrorCodes.SUCCESS.msg();

		//透传高阳mesgDataList字段
		private List mesgDataList;

		public List getMesgDataList() {
			return mesgDataList;
		}
		public void setMesgDataList(List mesgDataList) {
			this.mesgDataList = mesgDataList;
		}

		private String status = null;
		public String getErorcd() {
			return erorcd;
		}
		public void setErorcd(String erorcd) {
			this.erorcd = erorcd;
		}
		public String getErortx() {
			return erortx;
		}
		public void setErortx(String erortx) {
			this.erortx = erortx;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}

	}
	/**
	 * 将output设置成为map
	 * 
	 * @param key
	 * @param value
	 */
	public void addProperty(String key, Object value) {
		if (null == output || (!(output instanceof Map))) {
			Map<String, Object> propertyMap = new HashMap<>();
			propertyMap.put(key, value);
			this.setOutput(propertyMap);
		} else {
			@SuppressWarnings("unchecked")
			Map<String, Object> map = (Map<String, Object>)output;
			map.put(key, value);
		}
	}

	@JsonIgnore
	public boolean isSuccess() {
		return ErrorCodes.SUCCESS.code().equals(sys.getErorcd()) || "0000".equals(sys.getErorcd());
	}
}
