package org.learnteachcode.seoul.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mashhur on 3/22/17.
 */

@RestController
public class MoviesApiController {

    @RequestMapping("/api")
    @ResponseBody
    String home() {
        return "Welcome to MovieGram!";
    }
}
