package hht.dragon.provider

import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * 描述.
 *
 * @author: huang
 * @Date: 18-7-1
 */
fun main(args: Array<String>) {
    val context = ClassPathXmlApplicationContext("dubbo-provider.xml")
    context.start()
    System.`in`.read()
}