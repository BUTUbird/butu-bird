package org.butu.service;

import org.butu.RemoteLogService;
import org.butu.constant.SecurityConstants;
import org.butu.domain.SysOperLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author BUTUbird
 * @ClassName AsyncLogService
 * @Description TODO 异步调用日志服务
 * @Date 2022/9/29 21:59
 * @Version 1.0
 */
@Service
public class AsyncLogService
{
    @Autowired
    private RemoteLogService remoteLogService;

    /**
     * 保存系统日志记录
     */
    @Async
    public void saveSysLog(SysOperLog sysOperLog)
    {
        remoteLogService.saveLog(sysOperLog, SecurityConstants.INNER);
    }
}

