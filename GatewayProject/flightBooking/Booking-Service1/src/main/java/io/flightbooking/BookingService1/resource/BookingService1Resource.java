package io.flightbooking.BookingService1.resource;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Book")
public class BookingService1Resource {
        @RequestMapping("/hello")
        public Object hello() {
            return "Hello World For Book";
        }
    }



