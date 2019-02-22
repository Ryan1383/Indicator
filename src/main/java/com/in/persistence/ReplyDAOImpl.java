package com.in.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.in.domain.ReplyVO;


@Repository
public class ReplyDAOImpl implements ReplyDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.in.mapper.ReplyMapper";

	@Override
	public List<ReplyVO> readReply(Integer bno) throws Exception {
		return session.selectList(namespace+".readReply",bno);
	}

	@Override
	public void writeReply(ReplyVO vo) throws Exception {
		session.insert(namespace+".writeReply",vo);
	}

	@Override
	public void replyUpdate(ReplyVO vo) throws Exception {
		session.update(namespace+".updateReply",vo);
		
	}

	@Override
	public void replyDelete(Integer rno) throws Exception {
		session.delete(namespace+".deleteReply",rno);
	}

	@Override
	public ReplyVO readReplySelect(int rno) throws Exception {
		return session.selectOne(namespace+".readReplySelect", rno);
	}

	@Override
	public int replyCnt(Integer bno) throws Exception {
		return session.selectOne(namespace+".replyCnt",bno);
	}
	
	
	
	//댓글 조회 리스트

}
