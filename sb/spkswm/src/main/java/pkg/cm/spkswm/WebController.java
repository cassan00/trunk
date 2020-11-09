package pkg.cm.spkswm;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class WebController {

	@GetMapping("/login")
	public void login() {
		System.out.println("----login---");
	}

	@GetMapping("/loginSelf")
	public ModelAndView loginSelf() {

		ModelAndView mv = new ModelAndView();
		System.out.println("----loginSelf---");
		mv.setViewName("/login");
		return mv;
	}

}
