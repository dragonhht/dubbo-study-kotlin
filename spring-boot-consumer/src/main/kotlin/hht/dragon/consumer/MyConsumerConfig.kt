package hht.dragon.consumer

import com.alibaba.dubbo.config.ApplicationConfig
import com.alibaba.dubbo.config.ConsumerConfig
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
open class MyConsumerConfig {

    @Bean
    open fun applicationCofig() : ApplicationConfig {
        val applicationConfig = ApplicationConfig()
        applicationConfig.name = "consumer-name"
        return applicationConfig
    }

    @Bean
    open fun consumerConfig() : ConsumerConfig {
        val consumerConfig = ConsumerConfig()
        consumerConfig.timeout = 3000
        return consumerConfig
    }

    @Bean
    open fun registryConfig() : RegistryConfig {
        val registryConfig = RegistryConfig()
        registryConfig.address = "zookeeper://127.0.0.1:2181"
        return registryConfig
    }

}