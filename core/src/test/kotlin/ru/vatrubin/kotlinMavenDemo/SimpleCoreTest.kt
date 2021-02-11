package ru.vatrubin.kotlinMavenDemo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import kotlin.test.assertEquals

@SpringBootTest(classes = [IntegrationTestConfig::class])
@RunWith(SpringRunner::class)
class SimpleCoreTest: IntegrationTestAbstract() {

    @Test
    fun `some test`() {
        assertEquals(SOME_CONSTANT, SOME_CONSTANT)
    }
}