

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
            System.out.println("��ȣ\t����\t�ۼ���\t�ۼ���");
            System.out.println("---------------------------------");

            for (int i = boardTable.size() - 1; i >= 0; i--) {
                HashMap<String, Object> board = boardTable.get(i);
                System.out.println(board.get("BOARD_NO")
                        + "\t" + board.get("TITLE")
                        + "\t" + board.get("USER_NAME")
                        + "\t" + format.format(board.get("REG_DATE")));
            }

            System.out.println("=================================");
            System.out.print("1.��ȸ  2.���  0.����>");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    read();
                    break;
                case 2:
                    insert();
                    break;
                case 0:
                    System.out.println("���α׷��� ����Ǿ����ϴ�.");
                    return;
                default:
                    System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
            }
        }
    }

    private void read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("��ȸ�� �Խù� ��ȣ�� �Է��ϼ���: ");
        int boardNo = scanner.nextInt();

        // �Խù� ��ȸ ��� ����
        // �� �κ��� ���� ���ϴ� ������� �����ϸ� �˴ϴ�.
        System.out.println("�Խù� " + boardNo + "�� ������ ��ȸ�մϴ�.");
    }

    private void insert() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������ �Է��ϼ���: ");
        String title = scanner.nextLine();

        System.out.print("�ۼ��� �̸��� �Է��ϼ���: ");
        String userName = scanner.nextLine();

        Date regDate = new Date();

        HashMap<String, Object> newBoard = new HashMap<>();
        newBoard.put("BOARD_NO", boardTable.size() + 1);
        newBoard.put("TITLE", title);
        newBoard.put("USER_NAME", userName);
        newBoard.put("REG_DATE", regDate);

        boardTable.add(newBoard);
        System.out.println("���ο� �Խù��� ��ϵǾ����ϴ�.");
    }

    public static void main(String[] args) {
        BulletinBoard bulletinBoard = new BulletinBoard();
        bulletinBoard.start();
    }
}

