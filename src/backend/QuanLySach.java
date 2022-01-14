package backend;

import entity.Book;
import entity.Document;
import entity.Magazine;
import entity.Newpapers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    private List<Document> documentList;
    private Scanner scanner;

    public QuanLySach() {
        this.documentList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void printMenu(){
        System.out.println("\n1 - Thêm mới tài liệu");
        System.out.println("2 - Xóa tài liệu theo mã");
        System.out.println("3 - Hiển thị thông tin tài liệu");
        System.out.println("4 - Tìm kiếm tài liệu theo loại");
        System.out.println("5 - Thoát khỏi chương trình");
    }

    public void chooseMenu(){
        while(true){
            printMenu();
            System.out.println("Mời bạn nhập lựa chọn 1 - 5");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    // gọi hàm thêm mới
                    addDocument();
                    break;
                case 2:
                    deleteDocument();
                    break;
                case 3:
                    printDocument(5);
                    break;
                case 4:
                    findDocument();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Chọn sai, vui lòng chọn lại từ 1 - 5");
            }
        }
    }

    public void addDocument(){
        System.out.println("Bạn muốn thêm tài liệu loại nào ?");
        System.out.println("1 - Sách  |  2 - Tạp chí  |  3 - Báo");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                //gọi hàm thêm sách
                addBook();
                break;
            case 2:
                //gọi hàm thêm tạp chí
                addMagazine();
                break;
            case 3:
                //gọi hàm thêm báo
                addNewpapers();
                break;
            default:
                System.out.println("Vui lòng chọn 1 - 3 !!!");
        }
    }


    public void addBook(){
        System.out.println("Mời nhập thông tin Mã tài liệu");
        scanner.nextLine();
        String documentCode = scanner.nextLine();
        System.out.println("Mời nhập thông tin Tên nhà xuất bản");
        String publisherName = scanner.nextLine();
        System.out.println("Mời nhập thông tin Số bản phát hành");
        String publishString = scanner.nextLine();
        System.out.println("Mời nhập thông tin Tác giả");
        String author = scanner.nextLine();
        System.out.println("Mời nhập thông tin Số trang");
        int pages = scanner.nextInt();
        Book book = new Book(documentCode, publisherName, publishString, author, pages);
        this.documentList.add(book);
        System.out.println("Thêm mới Book thành công !");
    }

    public void addMagazine(){
        System.out.println("Mời nhập thông tin Mã tài liệu");
        scanner.nextLine();
        String documentCode = scanner.nextLine();
        System.out.println("Mời nhập thông tin Tên nhà xuất bản");
        String publisherName = scanner.nextLine();
        System.out.println("Mời nhập thông tin Số bản phát hành");
        String publishString = scanner.nextLine();

        System.out.println("Mời nhập thông tin Số phát hành");
        String publishNumber = scanner.nextLine();
        System.out.println("Mời nhập thông tin Tháng phát hành");
        String puhlishMonth = scanner.nextLine();

        Magazine magazine = new Magazine(documentCode, publisherName, publishString, publishNumber, puhlishMonth);
        this.documentList.add(magazine);
        System.out.println("Thêm mới Magazine thành công !");
    }

    public void addNewpapers(){
        System.out.println("Mời nhập thông tin Mã tài liệu");
        scanner.nextLine();
        String documentCode = scanner.nextLine();
        System.out.println("Mời nhập thông tin Tên nhà xuất bản");
        String publisherName = scanner.nextLine();
        System.out.println("Mời nhập thông tin Số bản phát hành");
        String publishString = scanner.nextLine();

        System.out.println("Mời nhập thông tin Ngày phát hành");
        String publishDate = scanner.nextLine();

        Newpapers newpapers = new Newpapers(documentCode, publisherName, publishString, publishDate);
        this.documentList.add(newpapers);
        System.out.println("Thêm mới Newpapers thành công !");
    }

    public void deleteDocument(){
        System.out.println("Mời nhập mã tài liệu muốn xóa");
        scanner.nextLine();
        String input = scanner.nextLine();
        if(this.documentList.removeIf(s -> s.getDocumentCode().equals(input))){
            System.out.println("Xóa thành công");
        } else  {
            System.out.println("Không tìm thấy mã tài liệu !!!");
        };
    }

    public void printDocument(int n){
        if(n == 1){
            // chỉ in ra book
            for(Document d : documentList){
                if(d instanceof Book) {
                    Book book = (Book) d;
                    System.out.println(book);
                }
            }
        } else if(n == 2) {
            // chỉ in ra tạp chí
            for(Document d : documentList){
                if(d instanceof Magazine) {
                    Magazine magazine = (Magazine) d;
                    System.out.println(magazine);
                }
            }
        } else if(n == 3){
            // chỉ in ra báo
            for(Document d : documentList){
                if(d instanceof Newpapers) {
                    Newpapers newpapers = (Newpapers) d;
                    System.out.println(newpapers);
                }
            }
        } else {
            for(Document d : documentList){
                System.out.println(d.toString());
            }
        }
    }

    public void findDocument(){
        System.out.println("Nhập lựa chọn tìm kiếm: ");
        System.out.println("1 - Sách  |  2 - Tạp chí  |  3 - Báo");
        int choose = scanner.nextInt();
        if(choose > 3) {
            System.out.println("Nhập sai !!!");
        } else {
            printDocument(choose);
        }
    }
}