import java.util.*

/**
 * 项目名称 WebviewApplication
 * 创建人 xiaojinli
 * 创建时间 7/4/21 12:48 AM
 *
 **/
class MyServiceLoader {

    companion object{
        @JvmStatic
        fun <S> load(service: Class<S>?): S? {
            return try {
                ServiceLoader.load(service).iterator().next()
            } catch (e: Exception) {
                null
            }
        }
    }

}