package com.in.persistence;


import java.util.List;

import com.in.domain.ReplyVO;

public interface ReplyDAO {

	
	//댓글 조회
	public List<ReplyVO> readReply(Integer bno) throws Exception;
	//작성
	public void writeReply(ReplyVO vo) throws Exception;
	//댓글 수정
	public void replyUpdate(ReplyVO vo) throws Exception;
	//삭제
	public void replyDelete(Integer rno) throws Exception;
	//댓글 수정이랑 삭제 할 때 하나만 조회하기 위한 메소드
	public ReplyVO  readReplySelect(int rno) throws Exception;
	
	public int replyCnt(Integer bno) throws Exception;
}
