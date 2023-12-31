/*
	 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
	 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
	 * 
	 * 번호, 제목, 내용, 작성자, 작성일
	 * 
	 * 목록에서는 조회, 등록, 종료
	 * 상세화면에서는 수정, 삭제, 목록
	 * 
	 */


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Board {

ArrayList<HashMap<String, Object>> boardTable = new ArrayList<>();
// 정보 입력 위한 ArrayList & HashMap 설정
SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
// 등록시 날짜 자동 설정

public static void main(String[] args) {
	
	new Board().start();
	// Board board = new Board();
	// board.start();
}

private void start() {
	while(true){
		System.out.println("=================================");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("---------------------------------");
		for(int i = boardTable.size() - 1; i >= 0 ; i--){
		// 마지막 항목에서 첫 번째 항목까지 역순으로 반복, 가장 최근 게시판 항목이 먼저 표시됨
			
			HashMap<String, Object> board = boardTable.get(i);
			System.out.println(board.get("BOARD_NO")
					+ "\t" + board.get("TITLE")
					+ "\t" + board.get("USER_NAME")
					+ "\t" + format.format(board.get("REG_DATE")));
		}
		System.out.println("=================================");
		
		System.out.print("1.조회  2.등록  0.종료>");
		int input = ScanUtil.nextInt();
		
		switch (input) {
		case 1:
			read();
			break;
		case 2:
			insert();
			break;
		case 0:
			System.out.println("프로그램이 종료되었습니다.");
			System.exit(0);
			break;
		}
	}
}

// 조회
private void read() {
	System.out.print("조회할 게시물 번호>");
	int boardNo = ScanUtil.nextInt();
	
	HashMap<String, Object> board = null;
	for(int i = 0; i < boardTable.size(); i++){
		if(boardNo == (int)boardTable.get(i).get("BOARD_NO")){
			board = boardTable.get(i);
		}
	}
	
	
	
	System.out.println("=======================");
	System.out.println("번호\t: " + board.get("BOARD_NO"));
	System.out.println("-----------------------");
	System.out.println("작성자\t: " + board.get("USER_NAME"));
	System.out.println("-----------------------");
	System.out.println("작성일\t: " + format.format(board.get("REG_DATE")));
	System.out.println("-----------------------");
	System.out.println("제목\t: " + board.get("TITLE"));
	System.out.println("-----------------------");
	System.out.println("내용\t: " + board.get("CONTENT"));
	System.out.println("=======================");
	
	System.out.print("1.수정  2.삭제  0.목록>");
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

// 삭제
private void delete(HashMap<String, Object> board) {
	System.out.print("정말 삭제 하시겠습니까?(Y/N)>");
	String input = ScanUtil.nextLine();
	
	switch (input) {
	case "Y":
		for(int i = 0; i < boardTable.size(); i++){
			if(board.get("BOARD_NO") == boardTable.get(i).get("BOARD_NO")){
				boardTable.remove(i);
				System.out.println("게시글이 삭제되었습니다.");
				break;
			}
		}
		break;
	}
}

// 수정
private void update(HashMap<String, Object> board) {
	System.out.print("제목>");
	board.put("TITLE", ScanUtil.nextLine());
	System.out.print("내용>");
	board.put("CONTENT", ScanUtil.nextLine());
	
	System.out.println("게시글이 수정되었습니다.");
}

// 등록
private void insert() {
	HashMap<String, Object> board = new HashMap<>();
	
	// 번호 설정
	int max = 0;
	for(int i = 0; i < boardTable.size(); i++){
		if(max < (int)boardTable.get(i).get("BOARD_NO")){
			max = (int)boardTable.get(i).get("BOARD_NO");
		}
	}
	// 게시글 등록
	board.put("BOARD_NO", max + 1);
	System.out.print("제목>");
	board.put("TITLE", ScanUtil.nextLine());
	System.out.print("내용>");
	board.put("CONTENT", ScanUtil.nextLine());
	System.out.print("작성자>");
	board.put("USER_NAME", ScanUtil.nextLine());
	board.put("REG_DATE", new Date());
	
	boardTable.add(board);
	
	System.out.println("작성하신 게시글이 등록되었습니다.");
}

}
