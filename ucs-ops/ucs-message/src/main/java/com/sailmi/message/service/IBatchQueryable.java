package com.sailmi.message.service;

public interface IBatchQueryable extends IChannelSMSService {

	/**
	 * 批量查询更新发送状态
	 */
	void batchQueryAndUpdateSendStatus();

}
