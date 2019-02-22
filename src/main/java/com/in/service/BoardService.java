package com.in.service;

import java.util.List;

import com.in.domain.BoardVO;
import com.in.domain.Criteria;
import com.in.domain.SearchCriteria;

public interface BoardService {
	//컨트롤러에서 요청될 service 메소드 작성
	//Service : 유지보수와 로직 프로세스를 유연하게 처리하기 위한 중간단계
	// controller -> serice(interface) -> ServiceImpl -> dao
	
	public void regist(BoardVO board) throws Exception;
	public BoardVO read(Integer bno) throws Exception;
	public void modify(BoardVO board) throws Exception;
	public void remove(Integer bno) throws Exception;
	public List<BoardVO> listAll() throws Exception;
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;// 페이징 계산용
	public int listCountCriteria(Criteria cri) throws Exception;// DB의 데이터 카운팅을 위한 메소드
	public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception;
	public int listSearchCount(SearchCriteria cri) throws Exception;
	
	
}
