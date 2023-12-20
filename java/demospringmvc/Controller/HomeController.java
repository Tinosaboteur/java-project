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
	//giaodich
	@RequestMapping(value = "/giaodich")
	public ModelAndView giaodich() {
		ModelAndView mv = new ModelAndView("admin/giaodich");
		mv.addObject("goitap", HomeService.GetDatagoitap());
		mv.addObject("khachhang", HomeService.GetDatakhachhang());
		mv.addObject("chitietgoitap", HomeService.GetDatachitietgoitap());
		return mv;
	}	
	@RequestMapping(value = "/admin/giaodich/detail")
	public ModelAndView detailgd() {
	    ModelAndView mv = new ModelAndView("admin/giaodich/detail");
	    mv.addObject("chitietgoitap", HomeService.GetDatachitietgoitap());
		mv.addObject("khachhang", HomeService.GetDatakhachhang());
		mv.addObject("goitap", HomeService.GetDatagoitap());
	    return mv;
	}
	//nhanvien
	@RequestMapping(value = "/nhanvien")
	public ModelAndView nhanvien() {
		ModelAndView mv = new ModelAndView("admin/nhanvien");
		mv.addObject("nhanvien", HomeService.GetDatanhanvien());
		return mv;
	}
	@RequestMapping(value = "/admin/nhanvien/add")
	public ModelAndView addnv() {
	    ModelAndView mv = new ModelAndView("admin/nhanvien/add");
	    return mv;
	}@RequestMapping(value = "/admin/nhanvien/delete")
	public ModelAndView deletenv() {
	    ModelAndView mv = new ModelAndView("admin/nhanvien/delete");
	    mv.addObject("nhanvien", HomeService.GetDatanhanvien());
	    return mv;
	}
	@RequestMapping(value = "/admin/nhanvien/update")
	public ModelAndView updatenv() {
	    ModelAndView mv = new ModelAndView("admin/nhanvien/update");
	    mv.addObject("nhanvien", HomeService.GetDatanhanvien());
	    return mv;
	}@RequestMapping(value = "/admin/nhanvien/detail")
	public ModelAndView detailnv() {
	    ModelAndView mv = new ModelAndView("admin/nhanvien/detail");
	    mv.addObject("nhanvien", HomeService.GetDatanhanvien());
	    return mv;
	}
	//chitietgoitap
	@RequestMapping(value = "/chitietgoitap" )
	public ModelAndView chitietgoitap() {
		ModelAndView mv = new ModelAndView("admin/chitietgoitap");
		mv.addObject("chitietgoitap", HomeService.GetDatachitietgoitap());
		mv.addObject("khachhang", HomeService.GetDatakhachhang());
		mv.addObject("goitap", HomeService.GetDatagoitap());
		return mv;
	}	
	@RequestMapping(value = "/admin/chitietgoitap/add")
	public ModelAndView addctgt() {
	    ModelAndView mv = new ModelAndView("admin/chitietgoitap/add");
	    mv.addObject("khachhang", HomeService.GetDatakhachhang());
		mv.addObject("goitap", HomeService.GetDatagoitap());
	    return mv;
	}@RequestMapping(value = "/admin/chitietgoitap/delete")
	public ModelAndView deletectgt() {
	    ModelAndView mv = new ModelAndView("admin/chitietgoitap/delete");
	    mv.addObject("chitietgoitap", HomeService.GetDatachitietgoitap());
		mv.addObject("khachhang", HomeService.GetDatakhachhang());
		mv.addObject("goitap", HomeService.GetDatagoitap());
	    return mv;
	}
	@RequestMapping(value = "/admin/chitietgoitap/update")
	public ModelAndView updatectgt() {
	    ModelAndView mv = new ModelAndView("admin/chitietgoitap/update");
	    mv.addObject("chitietgoitap", HomeService.GetDatachitietgoitap());
		mv.addObject("khachhang", HomeService.GetDatakhachhang());
		mv.addObject("goitap", HomeService.GetDatagoitap());
	    return mv;
	}@RequestMapping(value = "/admin/chitietgoitap/detail")
	public ModelAndView detailctgt() {
	    ModelAndView mv = new ModelAndView("admin/chitietgoitap/detail");
	    mv.addObject("chitietgoitap", HomeService.GetDatachitietgoitap());
		mv.addObject("khachhang", HomeService.GetDatakhachhang());
		mv.addObject("goitap", HomeService.GetDatagoitap());
	    return mv;
	}
	//khachhang
	@RequestMapping(value = "/khachhang")
	public ModelAndView khachhang() {
		ModelAndView mv = new ModelAndView("admin/khachhang");
		mv.addObject("khachhang", HomeService.GetDatakhachhang());
		return mv;
	}	
	@RequestMapping(value = "/admin/khachhang/add")
	public ModelAndView addkh() {
	    ModelAndView mv = new ModelAndView("admin/khachhang/add");
	    return mv;
	}
	@RequestMapping(value = "/admin/khachhang/update")
	public ModelAndView updatekh() {
	    ModelAndView mv = new ModelAndView("admin/khachhang/update");
	    mv.addObject("khachhang", HomeService.GetDatakhachhang());
	    return mv;
	}@RequestMapping(value = "/admin/khachhang/detail")
	public ModelAndView detailkh() {
	    ModelAndView mv = new ModelAndView("admin/khachhang/detail");
	    mv.addObject("khachhang", HomeService.GetDatakhachhang());
	    return mv;
	}
	//thietbi
	@RequestMapping(value = "/admin/thietbi")
	public ModelAndView thietbiad() {
	    ModelAndView mv = new ModelAndView("admin/thietbi");
	    mv.addObject("thietbi", HomeService.GetDatathietbi());
	    return mv;
	}
	@RequestMapping(value = "/admin/thietbi/add")
	public ModelAndView addtb() {
	    ModelAndView mv = new ModelAndView("admin/thietbi/add");
	    return mv;
	}@RequestMapping(value = "/admin/thietbi/delete")
	public ModelAndView deletetb() {
	    ModelAndView mv = new ModelAndView("admin/thietbi/delete");
	    mv.addObject("thietbi", HomeService.GetDatathietbi());
	    return mv;
	}
	@RequestMapping(value = "/admin/thietbi/update")
	public ModelAndView updatetb() {
	    ModelAndView mv = new ModelAndView("admin/thietbi/update");
	    mv.addObject("thietbi", HomeService.GetDatathietbi());
	    return mv;
	}@RequestMapping(value = "/admin/thietbi/detail")
	public ModelAndView detailtb() {
	    ModelAndView mv = new ModelAndView("admin/thietbi/detail");
	    mv.addObject("thietbi", HomeService.GetDatathietbi());
	    return mv;
	}
	//dangkyloptap
	@RequestMapping(value = "/dangkyloptap")
	public ModelAndView dangkiloptap() {
		ModelAndView mv = new ModelAndView("admin/dangkyloptap");
		mv.addObject("dangkiloptap", HomeService.GetDatadangkiloptap());
		mv.addObject("khachhang", HomeService.GetDatakhachhang());
		mv.addObject("lichtap", HomeService.GetDatalichtap());
		return mv;
	}	
	@RequestMapping(value = "/admin/dangkyloptap/add")
	public ModelAndView adddklt() {
	    ModelAndView mv = new ModelAndView("admin/dangkyloptap/add");
	    mv.addObject("khachhang", HomeService.GetDatakhachhang());
		mv.addObject("lichtap", HomeService.GetDatalichtap());
	    return mv;
	}@RequestMapping(value = "/admin/dangkyloptap/delete")
	public ModelAndView deletedklt() {
	    ModelAndView mv = new ModelAndView("admin/dangkyloptap/delete");
	    return mv;
	}
	@RequestMapping(value = "/admin/dangkyloptap/update")
	public ModelAndView updatedklt() {
	    ModelAndView mv = new ModelAndView("admin/dangkyloptap/update");
	    mv.addObject("dangkiloptap", HomeService.GetDatadangkiloptap());
		mv.addObject("khachhang", HomeService.GetDatakhachhang());
		mv.addObject("lichtap", HomeService.GetDatalichtap());
	    return mv;
	}@RequestMapping(value = "/admin/dangkyloptap/detail")
	public ModelAndView detaildklt() {
	    ModelAndView mv = new ModelAndView("admin/dangkyloptap/detail");
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
