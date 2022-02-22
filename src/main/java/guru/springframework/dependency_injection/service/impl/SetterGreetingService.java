package guru.springframework.dependency_injection.service.impl;

import guru.springframework.dependency_injection.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
