package com.in.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.in.domain.ReplyVO;
import com.in.persistence.ReplyDAO;

@Repository
public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyDAO dao;

	@Override
	public List<ReplyVO> readReply(Integer bno) throws Exception {
		return dao.readReply(bno);
	}

	@Override
	public void writeReply(ReplyVO vo) throws Exception {
		dao.writeReply(vo);
	}

	@Override
	public ReplyVO readReplySelect(int rno) throws Exception {
		return dao.readReplySelect(rno);
	}

	@Override
	public void replyUpdate(ReplyVO vo) throws Exception {
		dao.replyUpdate(vo);
	}

	@Override
	public void replyDelete(Integer rno) throws Exception {
		dao.replyDelete(rno);
	}

	@Override
	public int replyCnt(Integer bno) throws Exception {
		return dao.replyCnt(bno);
	}


	

}
