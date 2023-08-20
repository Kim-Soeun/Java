

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class BulletinBoard {
    private ArrayList<HashMap<String, Object>> boardTable;
    private SimpleDateFormat format;

    public BulletinBoard() {
        boardTable = new ArrayList<>();
        format = new SimpleDateFormat("yyyy-MM-dd");
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=================================");
            System.out.println("번호\t제목\t작성자\t작성일");
            System.out.println("---------------------------------");

            for (int i = boardTable.size() - 1; i >= 0; i--) {
                HashMap<String, Object> board = boardTable.get(i);
                System.out.println(board.get("BOARD_NO")
                        + "\t" + board.get("TITLE")
                        + "\t" + board.get("USER_NAME")
                        + "\t" + format.format(board.get("REG_DATE")));
            }

            System.out.println("=================================");
            System.out.print("1.조회  2.등록  0.종료>");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    read();
                    break;
                case 2:
                    insert();
                    break;
                case 0:
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    private void read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("조회할 게시물 번호를 입력하세요: ");
        int boardNo = scanner.nextInt();

        // 게시물 조회 기능 구현
        // 이 부분은 각자 원하는 방식으로 구현하면 됩니다.
        System.out.println("게시물 " + boardNo + "의 내용을 조회합니다.");
    }

    private void insert() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("제목을 입력하세요: ");
        String title = scanner.nextLine();

        System.out.print("작성자 이름을 입력하세요: ");
        String userName = scanner.nextLine();

        Date regDate = new Date();

        HashMap<String, Object> newBoard = new HashMap<>();
        newBoard.put("BOARD_NO", boardTable.size() + 1);
        newBoard.put("TITLE", title);
        newBoard.put("USER_NAME", userName);
        newBoard.put("REG_DATE", regDate);

        boardTable.add(newBoard);
        System.out.println("새로운 게시물이 등록되었습니다.");
    }

    public static void main(String[] args) {
        BulletinBoard bulletinBoard = new BulletinBoard();
        bulletinBoard.start();
    }
}

