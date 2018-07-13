package hht.dragon.consumer

import hht.dragon.consumer.service.ConsumerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * 描述.
 *
 * @author: huang
 * @Date: 18-7-14
 */
@RestController
class ConsumerController {

    @Autowired
    lateinit var consumerService: ConsumerService

    @GetMapping("/test")
    fun test() {
        consumerService.sayHello()
    }

}