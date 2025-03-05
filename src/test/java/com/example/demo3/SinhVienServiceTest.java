package com.example.demo3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
    private SinhVienService sinhVienService;

    @BeforeEach
    void setUp() {
        sinhVienService = new SinhVienService();
    }

    @Test
    void addStudentWithValidSinhVien() {
        SinhVien sinhVien = new SinhVien("TH01925", "Hung", 19, 9.8f,"IT");
        sinhVienService.addSinhVien(sinhVien);

        assertEquals(1, sinhVienService.getSinhVien().size());
    }

    @Test
    void addStudentWithNullSinhVien() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            sinhVienService.addSinhVien(null);
        });
        assertEquals("Sinh vien is null", exception.getMessage());
    }

    @Test
    void addStudentInvalidTenSV(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            sinhVienService.addSinhVien(new SinhVien("TH01925", "", 19, 9.8f,"IT"));
        });
        assertEquals("Ten khong duoc de trong", exception.getMessage());
    }

    @Test
    void updateStudentWithValidSinhVien() {
        SinhVien sinhVien = new SinhVien("TH01925", "Hung", 19, 9.8f,"IT");
        sinhVienService.addSinhVien(sinhVien);

        sinhVien.setTen("Q");
        sinhVienService.updateSinhVien(sinhVien);

        assertEquals("Q", sinhVienService.getSinhVienById("TH01925").getTen());
    }


}