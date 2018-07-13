package hht.dragon.consumer.service

import com.alibaba.dubbo.config.annotation.Reference
import hht.dragon.common.api.HelloService
import org.springframework.stereotype.Service

/**
 * 描述.
 *
 * @author: huang
 * @Date: 18-7-14
 */
@Service
class ConsumerService {

    @Reference
    lateinit var helloService: HelloService

    fun sayHello() {
        helloService.Hello()
        val say = helloService.sayWord("消费端调用")
        println(say)
    }

}