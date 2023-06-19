package fpthn.bangncph25477.sd17306.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "HangKhachHang")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HangKhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MaHang")
    private Integer maHang;
    @Column(name="tenHang")
    private String tenHang;
}
