package annotations

import io.qameta.allure.LabelAnnotation
import java.lang.annotation.Inherited

@Inherited
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
@LabelAnnotation(name = "ALLURE_MANUAL", value = "true")
annotation class AllureManual
