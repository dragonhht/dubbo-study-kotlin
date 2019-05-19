package hht.dragon.consumer

import hht.dragon.common.api.HelloService
import org.springframework.context.support.ClassPathXmlApplicationContext
import java.util.*

/**
 * 消费端.
 *
 * @author: huang
 * @Date: 18-7-1
 */
fun main(args: Array<String>) {
    val context = ClassPathXmlApplicationContext("dubbo-consumer.xml")
    context.start()

    val service : HelloService = context.getBean("helloService") as HelloService
    service.Hello()
}
