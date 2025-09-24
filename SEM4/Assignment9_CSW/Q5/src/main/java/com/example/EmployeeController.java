package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
public class EmployeeController {
    private List<Employee> employeeList = new ArrayList<>();
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("employees", employeeList);
        return "index";
    }
    @PostMapping("/addEmployee")
    public String addEmployee(@ModelAttribute Employee employee, Model model) {
        employeeList.add(employee);
        model.addAttribute("employee", new Employee());
        model.addAttribute("employees", employeeList);
        return "index";
    }
}
