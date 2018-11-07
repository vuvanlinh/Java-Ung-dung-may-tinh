package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("calculator")
    public String calculator(Model model, @RequestParam(required = false) double fistnum, @RequestParam(required = false) double secondnum, @RequestParam String calculate) {
        double result = 0;
        switch (calculate) {
            case "Addition":
                result = fistnum + secondnum;
                break;
            case "Subtraction":
                result = fistnum - secondnum;
                break;
            case "Multiplication":
                result = fistnum * secondnum;
                break;
            case "Division":
                if (secondnum != 0) {
                    result = fistnum / secondnum;
                }
                break;
        }
        model.addAttribute("result", result);
        return "index";
    }
}
