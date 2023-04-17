package com.example.gymcollaboration.controller;//package com.example.gymcollaboration.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class RegistrationController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/register")
//    public String showRegistrationForm(Model model) {
//        model.addAttribute("user", new User());
//        return "register";
//    }
//
//    @PostMapping("/register")
//    public String registerUserAccount(@ModelAttribute("user") @Valid User user,
//                                      BindingResult result) {
//
//        User existingUser = userService.findByEmail(user.getEmail());
//        if (existingUser != null) {
//            result.rejectValue("email", null, "There is already an account registered with that email");
//        }
//
//        if (result.hasErrors()) {
//            return "register";
//        } else {
//            userService.save(user);
//            return "redirect:/login";
//        }
//    }
//}
//
