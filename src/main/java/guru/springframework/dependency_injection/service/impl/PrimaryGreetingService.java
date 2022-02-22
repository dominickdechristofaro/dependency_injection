package guru.springframework.dependency_injection.service.impl;

import guru.springframework.dependency_injection.service.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY bean";
    }
}
