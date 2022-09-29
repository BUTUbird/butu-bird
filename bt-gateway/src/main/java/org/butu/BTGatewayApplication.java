package org.butu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author BUTUbird
 * @ClassName BTGatewayApplication
 * @Description TODO
 * @Date 2022/9/29 2:28
 * @Version 1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BTGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(BTGatewayApplication.class, args);
    }
}
