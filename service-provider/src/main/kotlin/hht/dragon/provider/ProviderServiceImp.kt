package hht.dragon.provider

import hht.dragon.common.api.HelloService

/**
 * 服务提供端服务实现类.
 *
 * @author: huang
 * @Date: 18-7-1
 */
class ProviderServiceImp : HelloService {
    override fun sayWord(name: String): String {
        return name
    }

    override fun Hello() {
        println("Hello World version 1.0")
    }
}