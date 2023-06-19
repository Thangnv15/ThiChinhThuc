package fpthn.bangncph25477.sd17306.request.PhieuGiamGia;

import fpthn.bangncph25477.sd17306.entities.KhachHang;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class phieugiamgia {

    private String maPhieu;

    private String tenPhieu;

    private Date ngayBatDau;

    private Date ngayKetThuc;

    private float giaTriGiam;

    private float giaTriGiamToiDa;

    private Boolean hinhThucGiam;

    private int trangThai;

    private Long nguoiSoHuu;

}
