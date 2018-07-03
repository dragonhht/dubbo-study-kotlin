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

    var scaner = Scanner(System.`in`)

    while (scaner.hasNext()) {
        val service : HelloService = context.getBean("helloService") as HelloService

        //service.Hello()
        val str = service.sayWord("测试语句")
        println("输出：$str")
    }
}
