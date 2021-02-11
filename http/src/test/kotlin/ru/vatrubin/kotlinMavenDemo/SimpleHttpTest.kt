package ru.vatrubin.kotlinMavenDemo

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest(classes = [IntegrationTestConfig::class], webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner::class)
class SimpleHttpTest : IntegrationTestAbstract() {

    @Test
    fun `some http test`() {
        Assert.assertEquals(SOME_CONSTANT, SOME_CONSTANT)
    }
}