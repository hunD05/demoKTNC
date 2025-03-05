package com.example.demo3;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> listSV = new ArrayList<SinhVien>();

    public void addSinhVien(SinhVien sv){
        if(sv == null){
            throw new IllegalArgumentException("sv is null");
        }
        listSV.add(sv);
    }

    public void updateSinhVien(SinhVien sv){
        if(sv == null){
            throw new IllegalArgumentException("sv is null");
        }

        for(int i=0;i<listSV.size();i++){
            if(listSV.get(i).getMaSv().equals(sv.getMaSv())){
                listSV.set(i,sv);
                return;
            }else{
                throw new IllegalArgumentException("Ma sinh vien "+ sv.getMaSv() + " khong ton tai");
            }
        }
    }

    public List<SinhVien> getSinhVien(){
        return new ArrayList<>(listSV);
    }

    public SinhVien getSinhVienById(String maSV){
        for(SinhVien sv : listSV){
            if(sv.getMaSv().equals(maSV)){
                return sv;
            }
        }
        return null;
    }
}
