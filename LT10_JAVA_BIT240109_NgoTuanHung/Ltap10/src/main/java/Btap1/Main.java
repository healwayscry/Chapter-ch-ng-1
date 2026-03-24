/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btap1;
import java.util.HashMap;

/**
 *
 * @author Hungg
 */
public class Main {
    public static void main(String[] args) {
        // 1. Tạo HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. Thêm 3 nhân viên
        map.put(101, "Anna");
        map.put(102, "Peter");
        map.put(103, "Mary");

        // 3. Lấy tên nhân viên ID 102
        String name = map.get(102);
        System.out.println("Nhan vien ID 102: " + name);

        // 4. Kiểm tra ID 105
        if (!map.containsKey(105)) {
            map.put(105, "Unknown");
        }

        // In ra toàn bộ danh sách
        System.out.println("Danh sach nhan vien:");
        for (Integer id : map.keySet()) {
            System.out.println(id + " - " + map.get(id));
        }
    }
}