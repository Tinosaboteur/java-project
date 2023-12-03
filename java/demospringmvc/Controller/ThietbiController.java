package demospringmvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import demospringmvc.Entity.thietbi;
import demospringmvc.service.IHomeService;

@Controller
public class ThietbiController {
    @Autowired
    private IHomeService homeService;

    @RequestMapping(value = "/thietbi/add", method = RequestMethod.POST)
    public ModelAndView addThietbi(@ModelAttribute("thietbi") thietbi tb) {
        homeService.addThietbi(tb);
        return new ModelAndView("redirect:/admin/thietbi");
    }

    @RequestMapping(value = "/thietbi/update", method = RequestMethod.POST)
    public ModelAndView updateThietbi(@ModelAttribute("thietbi") thietbi tb) {
        homeService.updateThietbi(tb);
        return new ModelAndView("redirect:/admin/thietbi");
    }

    @RequestMapping(value = "/thietbi/delete", method = RequestMethod.POST)
    public ModelAndView deleteThietbi(@RequestParam("equipmentID") int equipmentID) {
        homeService.deleteThietbi(equipmentID);
        return new ModelAndView("redirect:/admin/thietbi");
    }

    @RequestMapping(value = "/thietbi/find", method = RequestMethod.GET)
    public ModelAndView findThietbi(@RequestParam("equipmentID") int equipmentID) {
        thietbi tb = homeService.findThietbi(equipmentID);
        ModelAndView mav = new ModelAndView("admin/thietbi/detail");
        mav.addObject("thietbi", tb);
        return mav;
    }
}
