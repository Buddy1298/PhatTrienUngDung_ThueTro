# Ứng dụng quản lý thuê trọ bằng JavaSwing
- Chương trình **java** viết trên IDE **eclise** và dữ liệu truy xuất từ **SQLServer**
- Thành viên:
	Châu Hoàng Duy - 16044211 (NT)
	Ngô Thái Sang - 16050951
	Hồ Huỳnh Ngọc Triều - 16069771

## Cài đặt
- Đầu tiên, khởi chạy file `QuanLyNhaTro.SQL` trên **SQLServer** nhằm khởi tạo các quan hệ và dữ liệu
- Import Project vào eclipse và BẮT BUỘC thay đổi trên `src/com.coding.manageapp.database/Database.java`:
- Phương thức connect : `jdbc:sqlserver://localhost:1433;databaseName=QuanLyNhaTro;user=sa;password=sapassword`
- Cấu hình thư viện / **configure build path** thêm file `sqljdbc4.jar` để có thư viện kết nối database

## Triển khai chương trình
- Run `Main.java` để chạy ☺


