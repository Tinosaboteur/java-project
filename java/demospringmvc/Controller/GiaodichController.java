package demospringmvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import demospringmvc.Entity.giaodich;
import demospringmvc.service.IHomeService;

@Controller
public class GiaodichController {
	@Autowired
    private IHomeService homeService;

    @RequestMapping(value = "/giaodich/add", method = RequestMethod.POST)
    public ModelAndView addGiaodich(@ModelAttribute("giaodich") giaodich gd) {
        homeService.addGiaodich(gd);
        return new ModelAndView("redirect:/giaodich");
    }

    @RequestMapping(value = "/giaodich/find", method = RequestMethod.GET)
    public ModelAndView findGiaodich(@RequestParam("transactionID") int transactionID) {
    	giaodich gd = homeService.findGiaodich(transactionID);
        ModelAndView mav = new ModelAndView("admin/giaodich/detail");
        mav.addObject("khachhang", homeService.GetDatakhachhang());
        mav.addObject("giaodich", gd);
        return mav;
    }
}
