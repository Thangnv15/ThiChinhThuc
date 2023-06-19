package fpthn.bangncph25477.sd17306.controller;


import fpthn.bangncph25477.sd17306.entities.HangKhachHang;
import fpthn.bangncph25477.sd17306.entities.KhachHang;
import fpthn.bangncph25477.sd17306.reponsitory.HangKhachHangReponsitory;
import fpthn.bangncph25477.sd17306.reponsitory.KhachHangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("khach-hang")
public class KhachHangController {
    @Autowired
    KhachHangRepo khrepo;
    @Autowired
    HangKhachHangReponsitory hkhrepo;
    @ModelAttribute("gioiTinh")
    public Map<Integer,String> getGioiTinh(){
        Map<Integer,String> dsGioiTinh = new HashMap<>();
        dsGioiTinh.put(0,"nam");
        dsGioiTinh.put(1,"nữ");
        return dsGioiTinh;
    }
    @ModelAttribute("dsHangKH")
    public List<HangKhachHang> getDshang(){
        return hkhrepo.findAll();
    }
    @GetMapping("hien-thi")
    public String hienThi(Model model, @ModelAttribute("kh") KhachHang kh){
        model.addAttribute("listKh",khrepo.findAll());

        return "/khach_hang/index";
    }
    @GetMapping("delete/{maKh}")
    public String xoa(@PathVariable("maKh")KhachHang khachHang){
        this.khrepo.delete(khachHang);
        return "redirect:/khach-hang/hien-thi";
    }
    @PostMapping("add")
    public String add(Model model,@ModelAttribute("kh") KhachHang kh){
        khrepo.save(kh);
        return "redirect:/khach-hang/hien-thi";
    }
    @PostMapping("update/{maKh}")
    public String update(Model model,@PathVariable("maKh") Long maKh,@ModelAttribute("kh") KhachHang kh){
        KhachHang khachHang = khrepo.findById(maKh).orElse(null);
        khachHang.setGioiTinh(kh.getGioiTinh());
        khachHang.setTenKh(kh.getTenKh());
        khachHang.setHangKhachHang(kh.getHangKhachHang());
        khachHang.setSdt(kh.getSdt());
        khrepo.save(khachHang);
        return "redirect:/khach-hang/hien-thi";
    }
    @RequestMapping("detail/{maKh}")
    public String detail(Model model,@PathVariable("maKh") Long maKh, @ModelAttribute("kh") KhachHang kh){
        model.addAttribute("maKh",maKh);

        return "/khach_hang/index";
    }

}
