package tddbc9th

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import org.junit.jupiter.api.Assertions.assertTrue

object SomeSpec : Spek({
    describe("A class") {
        it("returns true") {
            assertTrue(true)
        }
    }
})