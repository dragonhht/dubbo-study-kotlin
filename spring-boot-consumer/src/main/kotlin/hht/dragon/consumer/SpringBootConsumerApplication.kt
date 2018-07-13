package hht.dragon.consumer

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * 描述.
 *
 * @author: huang
 * @Date: 18-7-14
 */
@SpringBootApplication
@DubboComponentScan(basePackages = ["hht.dragon.consumer.service"])
open class SpringBootConsumerApplication

fun main(args: Array<String>) {
    runApplication<SpringBootConsumerApplication>(*args)
}