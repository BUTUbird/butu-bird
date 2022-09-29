package org.butu.exception;

/**
 * @author BUTUbird
 * @ClassName CaptchaException
 * @Description TODO 验证码错误异常类
 * @Date 2022/9/30 1:01
 * @Version 1.0
 */
public class CaptchaException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    public CaptchaException(String msg)
    {
        super(msg);
    }
}
