import annotations.AllureLayer
import annotations.AllureManual
import org.junit.jupiter.api.Test

@AllureLayer("Unit")
class TestExample {

    @Test
    @AllureManual
    fun manualTest() {

    }
}