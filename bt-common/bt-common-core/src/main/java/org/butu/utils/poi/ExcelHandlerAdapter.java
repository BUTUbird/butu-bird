package org.butu.utils.poi;

/**
 * @author BUTUbird
 * @ClassName ExcelHandlerAdapter
 * @Description TODO Excel数据格式处理适配器
 * @Date 2022/9/29 21:20
 * @Version 1.0
 */
public interface ExcelHandlerAdapter
{
    /**
     * 格式化
     *
     * @param value 单元格数据值
     * @param args excel注解args参数组
     *
     * @return 处理后的值
     */
    Object format(Object value, String[] args);
}
