package com.webshop.controller.CatsPage.frontend;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//@Controller
//public class BlueCatController {
//
//    @RequestMapping(value = "/list-bluecats", method = RequestMethod.GET)
//    public String showWelcomePage(ModelMap model) {
//        model.put("list-bluecats", getLoggedinUserName());
//        return "list-bluecats";
//    }
//
//    private String getLoggedinUserName() {
//        Object principal = SecurityContextHolder.getContext()
//            .getAuthentication().getPrincipal();
//
//        if (principal instanceof UserDetails) {
//            return ((UserDetails) principal).getUsername();
//        }
//
//        return principal.toString();
//    }
//
//
//}
