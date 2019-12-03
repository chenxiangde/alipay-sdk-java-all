package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询设备当前位置接口
 *
 * @author auto create
 * @since 1.0, 2019-09-20 12:11:09
 */
public class AlipayCommerceIotDeviceLocationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5245539336868463754L;

	/**
	 * 设备唯一标识，设备id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

}
