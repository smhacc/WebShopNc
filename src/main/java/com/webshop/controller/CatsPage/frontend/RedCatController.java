package com.webshop.controller.CatsPage.frontend;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RedCatController {

    @RequestMapping(value = "/list-redcats", method = RequestMethod.GET)
    public String showRedCatsPage(ModelMap model) {
        model.put("name", getLoggedinUserName());
        return "list-redcats";
    }

    private String getLoggedinUserName() {
        Object principal = SecurityContextHolder.getContext()
            .getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            return ((UserDetails) principal).getUsername();
        }

        return principal.toString();
    }


    }

