package n7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = "/hello", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Message getResponse(){
       String message = "Hello, ITS Partner";
       return new Message(message);
    }
}
