package fpthn.bangncph25477.sd17306.controller;

import fpthn.bangncph25477.sd17306.entities.PhieuGiamGia;
import fpthn.bangncph25477.sd17306.reponsitory.KhachHangRepo;
import fpthn.bangncph25477.sd17306.reponsitory.PhieuGiamGiaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("phieu-giam-gia")
public class PhieuGiamGiaController {
    @Autowired
    KhachHangRepo khRepo;
    @Autowired
    PhieuGiamGiaRepo pggRepo;
    @GetMapping("hien-thi")
    public String hienThi(Model model,PhieuGiamGia phieuGiamGia){
        model.addAttribute("pg",phieuGiamGia);
        model.addAttribute("listPhieu",pggRepo.findAll());
        model.addAttribute("listKH",khRepo.findAll());
        return "index";

    }
   @GetMapping("delete/{maPhieu}")
    public String xoa(@PathVariable("maPhieu")PhieuGiamGia pgg){
        this.pggRepo.delete(pgg);
        return "redirect:/phieu-giam-gia/hien-thi";
   }
}
