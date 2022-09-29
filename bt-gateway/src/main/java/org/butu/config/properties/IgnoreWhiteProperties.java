package org.butu.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BUTUbird
 * @ClassName IgnoreWhiteProperties
 * @Description TODO 放行白名单配置
 * @Date 2022/9/29 23:53
 * @Version 1.0
 */
@Configuration
@RefreshScope
@ConfigurationProperties(prefix = "security.ignore")
public class IgnoreWhiteProperties
{
    /**
     * 放行白名单配置，网关不校验此处的白名单
     */
    private List<String> whites = new ArrayList<>();

    public List<String> getWhites()
    {
        return whites;
    }

    public void setWhites(List<String> whites)
    {
        this.whites = whites;
    }
}

