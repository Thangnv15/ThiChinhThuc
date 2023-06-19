package fpthn.bangncph25477.sd17306.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "KhachHang")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaKhachHang")
    private Long maKh;
    @Column(name = "TenKhachHang")
    private String tenKh;
    @Column(name = "SoDienThoai")
    private String sdt;
    @Column(name = "GioiTinh")
    private Integer gioiTinh;
    @ManyToOne
    @JoinColumn(name = "HangKhachHang")
    private HangKhachHang hangKhachHang;


}
