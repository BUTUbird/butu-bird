package org.butu.filter;

import com.alibaba.fastjson2.filter.SimplePropertyPreFilter;

/**
 * @author BUTUbird
 * @ClassName PropertyPreExcludeFilter
 * @Description TODO 排除JSON敏感属性
 * @Date 2022/9/29 20:52
 * @Version 1.0
 */
public class PropertyPreExcludeFilter extends SimplePropertyPreFilter
{
    public PropertyPreExcludeFilter()
    {
    }

    public PropertyPreExcludeFilter addExcludes(String... filters)
    {
        for (int i = 0; i < filters.length; i++)
        {
            this.getExcludes().add(filters[i]);
        }
        return this;
    }
}
