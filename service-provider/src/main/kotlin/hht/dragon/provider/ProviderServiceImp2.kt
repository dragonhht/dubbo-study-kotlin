package hht.dragon.provider

import hht.dragon.common.api.HelloService

/**
 * .
 *
 * @author: huang
 * @Date: 2019-5-19
 */
class ProviderServiceImp2: HelloService {

    override fun sayWord(name: String): String {
        return name
    }

    override fun Hello() {
        println("Hello World version 2.0")
    }
}