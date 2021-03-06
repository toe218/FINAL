package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Qna;
import repository.BoardSessionRepository;

@Service
public class BoardService {

	@Autowired
	public BoardSessionRepository boardRepository;

	public Integer insertQna(Qna qna) {
		System.out.println("service   " + qna.getQnaNum());
		System.out.println("service   " + qna.getMemberNum());
		return boardRepository.insertQna(qna);
	}

	public List<Qna> selectQnaList(Qna qna) {
		System.out.println("service   " + qna.getQnaNum());
		return boardRepository.selectQnaByConditionList(qna);
	}

	public Qna selectQnaOne(Qna qna) {
		System.out.println("service   " + qna.getQnaSubject());
		return boardRepository.selectQnaByConditionOne(qna);
	}

	public Integer updateQna(Qna qna) {
		System.out.println("service   " + qna.getQnaNum());
		return boardRepository.updateQna(qna);
	}

	public Integer deleteQna(String qnaSubject) {
		System.out.println("service   " + qnaSubject);
		return boardRepository.deleteQna(qnaSubject);
	}
}
