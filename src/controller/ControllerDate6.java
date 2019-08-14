package controller;

import model.Book;
import model.Music;
import model.Video;
import service.LibraryService;
import service.impl.LibraryServiceImpl;

import java.util.List;
import java.util.Scanner;

public class ControllerDate6 {
    Scanner scanner = new Scanner(System.in);

    public void libraryBook() {
        LibraryService<Book> libraryService = new LibraryServiceImpl();
        System.out.println("Library Book: ");
        System.out.println("1: Add Book.");
        System.out.println("2: Remove Book.");
        System.out.println("3: View Book.");
        System.out.println("-----------------------------------------------------------------");
        int temp;
        do {
            System.out.println("Mời bạn nhập work: ");
            temp = scanner.nextInt();
            switch (temp) {
                case 1: {
                    Book book = new Book();
                    scanner.nextLine();
                    System.out.println("Mời bạn nhập sách mà bạn muốn thêm vào?");
                    System.out.println("Mời bạn nhập tên sách: ");
                    book.setName(scanner.nextLine());
                    System.out.println(("Mời bạn nhập mô tả của sách: "));
                    book.setDescription(scanner.nextLine());
                    libraryService.add(book);
                    break;
                }
                case 2: {
                    System.out.println("Mời bạn nhập vị trí của sách mà bạn muốn xóa: ");
                    int index = scanner.nextInt();
                    libraryService.remove(index);
                    break;
                }
                case 3: {
                    libraryService.display();
                    break;
                }
                default:
                    System.exit(0);
            }
        } while (temp != 0);
    }

    public void libraryMusic() {
        LibraryService<Music> libraryService = new LibraryServiceImpl();
        System.out.println("Library Music: ");
        System.out.println("1: Add Music.");
        System.out.println("2: Remove Music.");
        System.out.println("3: View Music.");
        System.out.println("-----------------------------------------------------------------");
        int temp;
        do {
            System.out.println("Mời bạn nhập work: ");
            temp = scanner.nextInt();
            switch (temp) {
                case 1: {
                    Music music = new Music();
                    scanner.nextLine();
                    System.out.println("Mời bạn nhập music mà bạn muốn thêm vào?");
                    System.out.println("Mời bạn nhập tên music: ");
                    music.setName(scanner.nextLine());
                    System.out.println(("Mời bạn nhập tác giả của bài hát: "));
                    music.setAuthor(scanner.nextLine());
                    libraryService.add(music);
                    break;
                }
                case 2: {
                    System.out.println("Mời bạn nhập vị trí của music mà bạn muốn xóa : ");
                    int index = scanner.nextInt();
                    libraryService.remove(index);
                    break;
                }
                case 3: {
                    libraryService.display();
                    break;
                }
                default:
                    System.exit(0);
            }
        } while (temp != 0);
    }
    public void libraryVideo() {
        LibraryService<Video> libraryService = new LibraryServiceImpl();
        System.out.println("Library Video: ");
        System.out.println("1: Add Video.");
        System.out.println("2: Remove Video.");
        System.out.println("3: View Video.");
        System.out.println("-----------------------------------------------------------------");
        int temp;
        do {
            System.out.println("Mời bạn nhập work: ");
            temp = scanner.nextInt();
            switch (temp) {
                case 1: {
                    Video video = new Video();
                    scanner.nextLine();
                    System.out.println("Mời bạn nhập video mà bạn muốn thêm vào?");
                    System.out.println("Mời bạn nhập tên video: ");
                    video.setName(scanner.nextLine());
                    System.out.println(("Mời bạn nhập nội dung chính của video: "));
                    video.setContent(scanner.nextLine());
                    libraryService.add(video);
                    break;
                }
                case 2: {
                    System.out.println("Mời bạn nhập vị trí của video mà bạn muốn xóa : ");
                    int index = scanner.nextInt();
                    libraryService.remove(index);
                    break;
                }
                case 3: {
                    libraryService.display();
                    break;
                }
                default:
                    System.exit(0);
            }
        } while (temp != 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControllerDate6 controllerDate6 = new ControllerDate6();
        System.out.println("Library: ");
        System.out.println("1: Music.");
        System.out.println("2: Video.");
        System.out.println("3: Book.");
        System.out.println("-----------------------------------------------------------------");
        int temp;
        do {
            System.out.println("Mời bạn nhập library: ");
            temp = scanner.nextInt();
            switch (temp) {
                case 1: {
                    controllerDate6.libraryMusic();
                    break;
                }
                case 2: {
                   controllerDate6.libraryVideo();
                    break;
                }
                case 3: {
                    controllerDate6.libraryBook();
                    break;
                }
                default:
                    System.exit(0);
            }
        } while (temp != 0);
    }
}
