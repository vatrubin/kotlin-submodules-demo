package ru.vatrubin.kotlinMavenDemo

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

abstract class IntegrationTestAbstract {
    companion object {
        //prepare db
        const val SOME_CONSTANT = "test"
    }
}

@Configuration
@ComponentScan("ru.vatrubin.**")
@EnableAutoConfiguration
open class IntegrationTestConfig