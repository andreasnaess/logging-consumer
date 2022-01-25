package no.dreamstate.loggingconsumer.consumer

import no.dreamstate.loggingconsumer.Person
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.function.Consumer

@Configuration
class Consumers {

    @Bean
    fun log(): Consumer<Person> {
        return Consumer { person -> println("Received: $person") }
    }
}