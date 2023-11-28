package demospringmvc.service;

import java.util.List;



import demospringmvc.Entity.goitap;
import demospringmvc.Entity.thietbi;
import demospringmvc.Entity.lichtap;
import demospringmvc.Entity.nhanvien;
import demospringmvc.Entity.chitietgoitap;
import demospringmvc.Entity.dangkiloptap;
import demospringmvc.Entity.giaodich;
import demospringmvc.Entity.khachhang;



public interface IHomeService {

	public List<goitap> GetDatagoitap();
	public List<thietbi> GetDatathietbi();
	public List<lichtap> GetDatalichtap();
	public List<nhanvien> GetDatanhanvien();
	public List<chitietgoitap> GetDatachitietgoitap();
	public List<dangkiloptap> GetDatadangkiloptap();
	public List<giaodich> GetDatagiaodich();
	public List<khachhang> GetDatakhachhang();


}
