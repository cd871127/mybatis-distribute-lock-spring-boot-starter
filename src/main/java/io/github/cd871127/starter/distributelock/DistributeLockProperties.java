package io.github.cd871127.starter.distributelock;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "io.github.cd871127.starter.distribute-lock")
@Component
public class DistributeLockProperties {

    private Long expire;

    public Long getExpire() {
        return expire;
    }

    public void setExpire(Long expire) {
        this.expire = expire;
    }
}
