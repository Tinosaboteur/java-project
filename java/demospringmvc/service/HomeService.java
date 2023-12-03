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
import demospringmvc.Dao.userDao;

import demospringmvc.Entity.thietbi;
import demospringmvc.Entity.goitap;
import demospringmvc.Entity.lichtap;
import demospringmvc.Entity.nhanvien;
import demospringmvc.Entity.chitietgoitap;
import demospringmvc.Entity.dangkiloptap;
import demospringmvc.Entity.giaodich;
import demospringmvc.Entity.khachhang;
import demospringmvc.Entity.user;

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
	@Autowired
	private userDao userDao;
	
	//goitap
	public List<goitap> GetDatagoitap() {
		return goitapDao.GetDatagoitap();
	}
	//user
		public List<user> GetDatauser() {
			return userDao.GetDatauser();
		}
		public user signIn(String username, String password) {
	        return userDao.signIn(username, password);
	    }

	    public user signUp(String username, String password, String role) {
	        return userDao.signUp(username, password, role);
	    }		
	//thietbi
	public List<thietbi> GetDatathietbi() {
		return thietbiDao.GetDatathietbi();
	}
	public thietbi addThietbi(thietbi tb) {
        return thietbiDao.addThietbi(tb);
    }

    public thietbi updateThietbi(thietbi tb) {
        return thietbiDao.updateThietbi(tb);
    }

    public void deleteThietbi(int id) {
        thietbiDao.deleteThietbi(id);
    }

    public thietbi findThietbi(int id) {
        return thietbiDao.findThietbi(id);
    }
	//lichtap
	public List<lichtap> GetDatalichtap() {
		return lichtapDao.GetDatalichtap();
	}
	//nhanvien
	public List<nhanvien> GetDatanhanvien() {
		return nhanvienDao.GetDatanhanvien();
	}
	public nhanvien addNhanvien(nhanvien nv) {
        return nhanvienDao.addNhanvien(nv);
    }

    public nhanvien updateNhanvien(nhanvien nv) {
        return nhanvienDao.updateNhanvien(nv);
    }

    public void deleteNhanvien(int id) {
        nhanvienDao.deleteNhanvien(id);
    }

    public nhanvien findNhanvien(int id) {
        return nhanvienDao.findNhanvien(id);
    }
	//dangkiloptap
	public List<dangkiloptap> GetDatadangkiloptap() {
		return dangkiloptapDao.GetDatadangkiloptap();
	}
	public dangkiloptap addDangkiloptap(dangkiloptap dklt) {
        return dangkiloptapDao.addDangkiloptap(dklt);
    }

    public dangkiloptap updateDangkiloptap(dangkiloptap dklt) {
        return dangkiloptapDao.updateDangkiloptap(dklt);
    }

    public void deleteDangkiloptap(int id) {
    	dangkiloptapDao.deleteDangkiloptap(id);
    }

    public dangkiloptap findDangkiloptap(int id) {
        return dangkiloptapDao.findDangkiloptap(id);
    }
	//giaodich
	public List<giaodich> GetDatagiaodich() {
		return giaodichDao.GetDatagiaodich();
	}
	public giaodich addGiaodich(giaodich gd) {
        return giaodichDao.addGiaodich(gd);
    }

    public giaodich findGiaodich(int id) {
        return giaodichDao.findGiaodich(id);
    }
	//khachhang
	public List<khachhang> GetDatakhachhang() {
		return khachhangDao.GetDatakhachhang();
	}
	public khachhang addKhachhang(khachhang kh) {
        return khachhangDao.addKhachhang(kh);
    }

    public khachhang updateKhachhang(khachhang kh) {
        return khachhangDao.updateKhachhang(kh);
    }

    public khachhang findKhachhang(int id) {
        return khachhangDao.findKhachhang(id);
    }
	//chitietgoitap
	public List<chitietgoitap> GetDatachitietgoitap() {
		return chitietgoitapDao.GetDatachitietgoitap();
	}
	public chitietgoitap addChitietgoitap(chitietgoitap ctgt) {
        return chitietgoitapDao.addChitietgoitap(ctgt);
    }

    public chitietgoitap updateChitietgoitap(chitietgoitap ctgt) {
        return chitietgoitapDao.updateChitietgoitap(ctgt);
    }

    public chitietgoitap findChitietgoitap(int id) {
        return chitietgoitapDao.findChitietgoitap(id);
    }
}
