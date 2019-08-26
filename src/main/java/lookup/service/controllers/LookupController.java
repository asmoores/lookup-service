package lookup.service.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class LookupController {

    @RequestMapping(method = GET, path = "/lookup/greeting")
    public String getDocument() {
        return "not implemented yet";
    }

}
