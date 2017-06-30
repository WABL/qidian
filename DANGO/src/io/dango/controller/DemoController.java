package io.dango.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MainasuK on 2017-6-30.
 */
@RestController
public class DemoController {

    @RequestMapping(path = "/demo", method = RequestMethod.GET)
    public List<String>demo() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        return list;
    }
}
