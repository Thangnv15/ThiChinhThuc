package fpthn.bangncph25477.sd17306.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity(name = "PhieuGiamGia")
@Table(name = "PhieuGiamGia")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PhieuGiamGia {
    @Id
    @Column(name = "MaPhieu")
    private String maPhieu;
    @Column(name = "TenPhieu")
    private String tenPhieu;
    @Column(name = "NgayBatDau")
    private Date ngayBatDau;
    @Column(name = "NgayKetThuc")
    private Date ngayKetThuc;
    @Column(name = "GiaTriGiam")
    private Double giaTriGiam;
    @Column(name = "GiaTriGiamToiDa")
    private Double giaTriGiamToiDa;
    @Column(name = "TrangThai")
    private Integer trangThai;
    @ManyToOne
    @JoinColumn(name = "NguoiSoHuu")
    private KhachHang khachHang;


}
