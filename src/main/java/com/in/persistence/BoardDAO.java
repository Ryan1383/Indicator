package com.in.persistence;

import java.util.List;

import com.in.domain.BoardVO;
import com.in.domain.Criteria;
import com.in.domain.SearchCriteria;

public interface BoardDAO {
	//작성
	public void create(BoardVO vo) throws Exception;
	//조회
	public BoardVO read(Integer bno) throws Exception;
	//수정
	public void update(BoardVO vo) throws Exception;
	//조회수
	void updateViewCnt(Integer bno) throws Exception;
	//삭제
	public void delete(Integer bno) throws Exception;
	//조회
	public List<BoardVO> listAll() throws Exception;
	//페이지 관련
	public List<BoardVO> listPage(int page) throws Exception;
	public List<BoardVO> listCreiteria(Criteria cri) throws Exception;
	public int countPaging(Criteria cri) throws Exception;
	// 서치
	public List<BoardVO> listSearch(SearchCriteria cri) throws Exception;
	public int listSearchCount(SearchCriteria cri) throws Exception;
	
}
