package will.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    double result = 0;

    @RequestMapping("/calculator")
    public ModelAndView calculator() {

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("result", result);
        return modelAndView;
    }

    @RequestMapping("/result")
    public ModelAndView result(@RequestParam double fistnum, @RequestParam double secondnum, @RequestParam String cal) {
        ModelAndView modelAndView = new ModelAndView("index");
        String calname = "";
        switch (cal) {
            case "Addition(+)":
                result = fistnum + secondnum;
                calname = "Addition";
                break;
            case "Subtraction(-)":
                result = fistnum - secondnum;
                calname = "Subtraction";
                break;
            case "Multiplication(X)":
                result = fistnum * secondnum;
                calname = "Multiplication";
                break;
            case "Division(/)":
                if (secondnum != 0) {
                    result = fistnum / secondnum;
                    calname = "Division";
                }
                break;
        }
        modelAndView.addObject("cal", calname);
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
