package com.iag1.familyPrep.controller;

import com.iag1.familyPrep.model.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dqromney on 10/5/15.
 */
@Controller
public class EventController {
// Research: Post Redirect Get Pattern
    @RequestMapping(value="/event", method= RequestMethod.GET)
    public String displayEventPage(Model pModel) {
        Event event = new Event();
        event.setName("Java User Group");
        pModel.addAttribute("event", event);
        return "event";
    }
}
