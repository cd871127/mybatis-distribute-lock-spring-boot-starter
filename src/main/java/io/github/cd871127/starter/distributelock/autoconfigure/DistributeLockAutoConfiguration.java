package io.github.cd871127.starter.distributelock.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ConditionalOnProperty(value = "io.github.cd871127.starter.distribute-lock")
@Configuration
@ComponentScan("io.github.cd871127.starter.distributelock")
@EnableConfigurationProperties
public class DistributeLockAutoConfiguration {


}
