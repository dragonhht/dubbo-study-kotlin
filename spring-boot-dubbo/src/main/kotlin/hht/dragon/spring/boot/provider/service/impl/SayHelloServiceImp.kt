package hht.dragon.spring.boot.provider.service.impl

import com.alibaba.dubbo.config.annotation.Service
import hht.dragon.common.api.HelloService

/**
 * 描述.
 *
 * @author: huang
 * @Date: 18-7-13
 */
@Service
class SayHelloServiceImp : HelloService {
    override fun Hello() {
        println("你好!!!")
    }

    override fun sayWord(name: String): String {
        return "$name: 你好"
    }

}