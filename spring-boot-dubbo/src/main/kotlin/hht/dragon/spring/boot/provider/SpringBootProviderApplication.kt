package hht.dragon.spring.boot.provider

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * 描述.
 *
 * @author: huang
 * @Date: 18-7-13
 */
@SpringBootApplication
@DubboComponentScan(basePackages = ["hht.dragon.spring.boot.provider.service.impl"])
open class SpringBootProviderApplication

fun main(args: Array<String>) {
    runApplication<SpringBootProviderApplication>(*args)
}