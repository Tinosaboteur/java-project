package demospringmvc.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demospringmvc.Dao.goitapDao;
import demospringmvc.Dao.nhanvienDao;
import demospringmvc.Dao.thietbiDao;
import demospringmvc.Dao.lichtapDao;
import demospringmvc.Dao.chitietgoitapDao;
import demospringmvc.Dao.dangkiloptapDao;
import demospringmvc.Dao.giaodichDao;
import demospringmvc.Dao.khachhangDao;


import demospringmvc.Entity.thietbi;
import demospringmvc.Entity.goitap;
import demospringmvc.Entity.lichtap;
import demospringmvc.Entity.nhanvien;
import demospringmvc.Entity.chitietgoitap;
import demospringmvc.Entity.dangkiloptap;
import demospringmvc.Entity.giaodich;
import demospringmvc.Entity.khachhang;



@Service
public class HomeService  implements IHomeService{
	@Autowired
	 private goitapDao goitapDao;
	@Autowired
	private thietbiDao thietbiDao; 
	@Autowired
	private lichtapDao lichtapDao;
	@Autowired
	private nhanvienDao nhanvienDao;
	@Autowired
	private chitietgoitapDao chitietgoitapDao;
	@Autowired
	private dangkiloptapDao dangkiloptapDao;
	@Autowired
	private giaodichDao giaodichDao;
	@Autowired
	private khachhangDao khachhangDao;

	//goitap
	public List<goitap> GetDatagoitap() {
		return goitapDao.GetDatagoitap();
	}
	//thietbi
	public List<thietbi> GetDatathietbi() {
		return thietbiDao.GetDatathietbi();
	}
	//lichtap
	public List<lichtap> GetDatalichtap() {
		return lichtapDao.GetDatalichtap();
	}
	//nhanvien
	public List<nhanvien> GetDatanhanvien() {
		return nhanvienDao.GetDatanhanvien();
	}
	//dangkiloptap
	public List<dangkiloptap> GetDatadangkiloptap() {
		return dangkiloptapDao.GetDatadangkiloptap();
	}
	//giaodich
	public List<giaodich> GetDatagiaodich() {
		return giaodichDao.GetDatagiaodich();
	}
	//khachhang
	public List<khachhang> GetDatakhachhang() {
		return khachhangDao.GetDatakhachhang();
	}
	//chitietgoitap
	public List<chitietgoitap> GetDatachitietgoitap() {
		return chitietgoitapDao.GetDatachitietgoitap();
	}
}
