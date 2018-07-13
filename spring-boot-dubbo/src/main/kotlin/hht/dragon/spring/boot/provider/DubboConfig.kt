package hht.dragon.spring.boot.provider

import com.alibaba.dubbo.config.ApplicationConfig
import com.alibaba.dubbo.config.RegistryConfig
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * 描述.
 *
 * @author: huang
 * @Date: 18-7-14
 */
@Configuration
open class DubboConfig {

    @Bean
    open fun applicationConfig() : ApplicationConfig {
        val applicationConfig = ApplicationConfig()
        applicationConfig.name = "spring-boot-provider"
        return applicationConfig
    }

    @Bean
    open fun registryConfig() : RegistryConfig {
        val registryConfig = RegistryConfig()
        registryConfig.address = "zookeeper://127.0.0.1:2181"
        return registryConfig
    }

}