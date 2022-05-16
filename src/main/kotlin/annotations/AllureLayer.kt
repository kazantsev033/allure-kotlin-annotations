package annotations

import io.qameta.allure.LabelAnnotation
import java.lang.annotation.Inherited

@Inherited
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
@LabelAnnotation(name = "layer")
annotation class AllureLayer(val value:String)