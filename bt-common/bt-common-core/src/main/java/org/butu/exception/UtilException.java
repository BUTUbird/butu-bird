package org.butu.exception;

/**
 * @author BUTUbird
 * @ClassName UtilException
 * @Description TODO 工具类异常
 * @Date 2022/9/30 1:07
 * @Version 1.0
 */
public class UtilException extends RuntimeException
{
    private static final long serialVersionUID = 8247610319171014183L;

    public UtilException(Throwable e)
    {
        super(e.getMessage(), e);
    }

    public UtilException(String message)
    {
        super(message);
    }

    public UtilException(String message, Throwable throwable)
    {
        super(message, throwable);
    }
}
