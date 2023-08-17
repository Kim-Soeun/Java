package answer;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Board {

ArrayList<HashMap<String, Object>> boardTable = new ArrayList<>();
SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");

public static void main(String[] args) {
	/*
	 * ArrayList�� HashMap�� ����� �Խ��� ���̺��� �����,
	 * ��ȸ, ���, ����, ������ ������ �Խ����� ������ּ���.
	 * 
	 * ��ȣ, ����, ����, �ۼ���, �ۼ���
	 * 
	 * ��Ͽ����� ��ȸ, ���, ����
	 * ��ȭ�鿡���� ����, ����, ���
	 * 
	 */
	new Board().start();
	// Board board = new Board();
	// board.start();
}

private void start() {
	while(true){
		System.out.println("=================================");
		System.out.println("��ȣ\t����\t�ۼ���\t�ۼ���");
		System.out.println("---------------------------------");
		for(int i = boardTable.size() - 1; i >= 0 ; i--){
		// ������ �׸񿡼� ù ��° �׸���� �������� �ݺ�, ���� �ֱ� �Խ��� �׸��� ���� ǥ�õ�
			HashMap<String, Object> board = boardTable.get(i);
			System.out.println(board.get("BOARD_NO")
					+ "\t" + board.get("TITLE")
					+ "\t" + board.get("USER_NAME")
					+ "\t" + format.format(board.get("REG_DATE")));
		}
		System.out.println("=================================");
		
		System.out.print("1.��ȸ  2.���  0.����>");
		int input = ScanUtil.nextInt();
		
		switch (input) {
		case 1:
			read();
			break;
		case 2:
			insert();
			break;
		case 0:
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
			System.exit(0);
			break;
		}
	}
}

// ��ȸ
private void read() {
	System.out.print("��ȸ�� �Խù� ��ȣ>");
	int boardNo = ScanUtil.nextInt();
	
	HashMap<String, Object> board = null;
	for(int i = 0; i < boardTable.size(); i++){
		if(boardNo == (int)boardTable.get(i).get("BOARD_NO")){
			board = boardTable.get(i);
		}
	}
	
	
	
	System.out.println("=======================");
	System.out.println("��ȣ\t: " + board.get("BOARD_NO"));
	System.out.println("-----------------------");
	System.out.println("�ۼ���\t: " + board.get("USER_NAME"));
	System.out.println("-----------------------");
	System.out.println("�ۼ���\t: " + format.format(board.get("REG_DATE")));
	System.out.println("-----------------------");
	System.out.println("����\t: " + board.get("TITLE"));
	System.out.println("-----------------------");
	System.out.println("����\t: " + board.get("CONTENT"));
	System.out.println("=======================");
	
	System.out.print("1.����  2.����  0.���>");
	int input = ScanUtil.nextInt();
	
	switch (input) {
	case 1:
		update(board);
		break;
	case 2:
		delete(board);
		break;
	case 0:
		
		break;
	}
}

// ����
private void delete(HashMap<String, Object> board) {
	System.out.print("���� ���� �Ͻðڽ��ϱ�?(Y/N)>");
	String input = ScanUtil.nextLine();
	
	switch (input) {
	case "Y":
		for(int i = 0; i < boardTable.size(); i++){
			if(board.get("BOARD_NO") == boardTable.get(i).get("BOARD_NO")){
				boardTable.remove(i);
				System.out.println("�Խñ��� �����Ǿ����ϴ�.");
				break;
			}
		}
		break;
	}
}

// ����
private void update(HashMap<String, Object> board) {
	System.out.print("����>");
	board.put("TITLE", ScanUtil.nextLine());
	System.out.print("����>");
	board.put("CONTENT", ScanUtil.nextLine());
	
	System.out.println("�Խñ��� �����Ǿ����ϴ�.");
}

// ���
private void insert() {
	HashMap<String, Object> board = new HashMap<>();
	
	int max = 0;
	for(int i = 0; i < boardTable.size(); i++){
		if(max < (int)boardTable.get(i).get("BOARD_NO")){
			max = (int)boardTable.get(i).get("BOARD_NO");
		}
	}
	
	board.put("BOARD_NO", max + 1);
	System.out.print("����>");
	board.put("TITLE", ScanUtil.nextLine());
	System.out.print("����>");
	board.put("CONTENT", ScanUtil.nextLine());
	System.out.print("�ۼ���>");
	board.put("USER_NAME", ScanUtil.nextLine());
	board.put("REG_DATE", new Date());
	
	boardTable.add(board);
	
	System.out.println("�ۼ��Ͻ� �Խñ��� ��ϵǾ����ϴ�.");
}

}
