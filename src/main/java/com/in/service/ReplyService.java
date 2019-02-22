package com.in.service;


import java.util.List;

import com.in.domain.ReplyVO;

public interface ReplyService {
	
	public List<ReplyVO> readReply(Integer bno) throws Exception;
	public void writeReply(ReplyVO vo) throws Exception;
	
	public ReplyVO readReplySelect(int rno) throws Exception;
	public void replyUpdate(ReplyVO vo) throws Exception;
	public void replyDelete(Integer rno) throws Exception;
	public int replyCnt(Integer bno) throws Exception;

	
}
