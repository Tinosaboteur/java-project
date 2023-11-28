package demospringmvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import demospringmvc.service.HomeService;



@Controller
public class HomeController {
	@Autowired
	HomeService HomeService;

	
	//admin
	@RequestMapping(value = "/admin/trang-chu")
	public ModelAndView homead() {
		ModelAndView mv = new ModelAndView("admin/trang-chu");
		return mv;
	}
	@RequestMapping(value = "/giaodich")
	public ModelAndView giaodich() {
		ModelAndView mv = new ModelAndView("admin/giaodich");
		mv.addObject("giaodich", HomeService.GetDatagiaodich());
		mv.addObject("khachhang", HomeService.GetDatakhachhang());
		return mv;
	}	
	@RequestMapping(value = "/nhanvien")
	public ModelAndView nhanvien() {
		ModelAndView mv = new ModelAndView("admin/nhanvien");
		mv.addObject("nhanvien", HomeService.GetDatanhanvien());
		return mv;
	}	
	
	@RequestMapping(value = "/chitietgoitap" )
	public ModelAndView chitietgoitap() {
		ModelAndView mv = new ModelAndView("admin/chitietgoitap");
		mv.addObject("chitietgoitap", HomeService.GetDatachitietgoitap());
		mv.addObject("khachhang", HomeService.GetDatakhachhang());
		mv.addObject("goitap", HomeService.GetDatagoitap());
		return mv;
	}	
	
	@RequestMapping(value = "/khachhang")
	public ModelAndView khachhang() {
		ModelAndView mv = new ModelAndView("admin/khachhang");
		mv.addObject("khachhang", HomeService.GetDatakhachhang());
		return mv;
	}	
	@RequestMapping(value = "/admin/thietbi")
	public ModelAndView thietbiad() {
	    ModelAndView mv = new ModelAndView("admin/thietbi");
	    mv.addObject("thietbi", HomeService.GetDatathietbi());
	    return mv;
	}
	@RequestMapping(value = "/dangkyloptap")
	public ModelAndView dangkiloptap() {
		ModelAndView mv = new ModelAndView("admin/dangkyloptap");
		mv.addObject("dangkiloptap", HomeService.GetDatadangkiloptap());
		mv.addObject("khachhang", HomeService.GetDatakhachhang());
		mv.addObject("lichtap", HomeService.GetDatalichtap());
		return mv;
	}	
	
	
	//user
	
	@RequestMapping(value = "/user/trang-chu")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("user/trang-chu");
		return mv;
	}
	@RequestMapping(value = "/goitap")
	public ModelAndView goitap() {
		ModelAndView mv = new ModelAndView("user/goitap");
		mv.addObject("goitap", HomeService.GetDatagoitap());
		return mv;
	}
	
	@RequestMapping(value = "/user/thietbi")
		public ModelAndView thietbi() {
			ModelAndView mv = new ModelAndView("user/thietbi");
			mv.addObject("thietbi", HomeService.GetDatathietbi());
			return mv;
	}
	
	
	@RequestMapping(value = "/lichtap")
	public ModelAndView lichtap() {
		ModelAndView mv = new ModelAndView("user/lichtap");
		mv.addObject("lichtap", HomeService.GetDatalichtap());
		mv.addObject("nhanvien", HomeService.GetDatanhanvien());

		return mv;
}
	
	
	//login
	
	@RequestMapping(value = {"/","/dangky"})
	public String dangky() {
		return "login/dangky";
	}
	
	@RequestMapping(value = "/dangnhap")
	public String dangnhap() {
		return "login/dangnhap";
	}

}
