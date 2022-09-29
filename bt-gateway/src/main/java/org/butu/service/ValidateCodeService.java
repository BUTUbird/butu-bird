package org.butu.service;

import org.butu.exception.CaptchaException;
import org.butu.web.domain.AjaxResult;

import java.io.IOException;

/**
 * @author BUTUbird
 * @ClassName ValidateCodeService
 * @Description TODO 验证码处理
 * @Date 2022/9/30 0:56
 * @Version 1.0
 */
public interface ValidateCodeService
{
    /**
     * 生成验证码
     */
    public AjaxResult createCaptcha() throws IOException, CaptchaException;

    /**
     * 校验验证码
     */
    public void checkCaptcha(String key, String value) throws CaptchaException;
}

