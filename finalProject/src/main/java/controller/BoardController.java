package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.Notice;
import model.Qna;
import model.Review;
import model.SelfPlanNumber;
import service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/qna_insert", method = RequestMethod.GET)
	public String qnaInsertGet(Qna qna, Model model) {
		System.out.println("GET INSERT");
		return "qnaBoard/qna_insert";
	}

	@RequestMapping(value = "/qna_insert", method = RequestMethod.POST)
	public String qnaInsertPost(Qna qna, Model model) {
		System.out.println("POST INSERT");
		Integer result = null;
		result = boardService.insertQna(qna);
		List<Qna> list = boardService.selectQnaList(qna);
		if (result > 0) {
			model.addAttribute("qna", qna);
			model.addAttribute("list", list);
			System.out.println(qna.getQnaNum());
			System.out.println("리스트사이즈"+list.size());
			System.out.println("글번호:" + qna.getQnaNum());
			System.out.println("글쓴이:" + qna.getMemberNum());
			System.out.println("관리자:" + qna.getStaffNumber());
			return "redirect:qna_list";
		} else {
			return "qnaBoard/qna_insert";
		}

	}

	@RequestMapping(value = "/qna_list", method = RequestMethod.POST)
	public String qnaListPost(Qna qna, Model model) {
		System.out.println("POST LIST");
		List<Qna> list = boardService.selectQnaList(qna);
		if (list != null) {
			model.addAttribute("list", list);
			System.out.println(list.size());
			return "qnaBoard/qna_list";
		} else {
			return "qnaBoard/qna_list";
		}
	}

	@RequestMapping(value = "/qna_list", method = RequestMethod.GET)
	public String qnaListGet(Qna qna, Model model) {
		System.out.println("GET LIST");
		List<Qna> list = boardService.selectQnaList(qna);
		if (list != null) {
			model.addAttribute("list", list);
			System.out.println(list.size());
			return "qnaBoard/qna_list";
		} else {
			return "qnaBoard/qna_list";
		}
	}

	@RequestMapping(value = "/qna_detail", method = RequestMethod.GET)
	public String qnaDetailGet(@RequestParam(value = "qnaSubject", defaultValue = "false") String qnaSubject, Qna qna,
			Model model) {
		model.addAttribute("qna", qna);
		System.out.println("GET DETAIL");
		System.out.println("get벨류test" + qna.getQnaSubject());
		Qna list = boardService.selectQnaOne(qna);
		model.addAttribute("qna", list);
		return "qnaBoard/qna_detail";
	}

//	@RequestMapping(value = "/qna_detail", method = RequestMethod.POST)
//	public String qnaDetailPost(@RequestParam(value = "qnaSubject", defaultValue = "false") String qnaSubject, Qna qna,
//			Model model) {
//		System.out.println("POST DETAIL");
//		System.out.println("detail벨류test" + qna.getQnaSubject());
//		Qna list = boardService.selectQnaOne(qna);
//		model.addAttribute("qna", list);
//		return "redirect:qna_list";
//	}

	@RequestMapping(value = "/qna_delete", method = RequestMethod.GET)
	public String qnaDeleteGet(Model model) {
		System.out.println("GET DELETE");
		return "qnaBoard/qna_delete";
	}

	@RequestMapping(value = "/qna_delete", method = RequestMethod.POST)
	public String qnaDeletePost(Qna qna, Model model) {
		System.out.println("POST DELETE");
		Integer result = boardService.deleteQna(qna.getQnaSubject());
		if (result > 0) {
			model.addAttribute("result", result);
			return "qnaBoard/qna_delete";
		} else {
			return "qnaBoard/qna_list";
		}
	}

	@RequestMapping(value = "/qna_modify", method = RequestMethod.GET)
	public String qnaModifyGet(Model model) {
		System.out.println("GET MODIFY");
		return "qnaBoard/qna_modify";
	}

	@RequestMapping(value = "/qna_modify", method = RequestMethod.POST)
	public String qnaModifyPost(Qna qna, Model model) {
		System.out.println("POST MODIFY");
		Integer result = boardService.updateQna(qna);
		if (result > 0) {
			model.addAttribute("result", result);
			return "qnaBoard/qna_modify";
		} else {
			return "qnaBoard/qna_list";
		}
	}

	@RequestMapping(value = "/review_list", method = RequestMethod.GET)
	public String reviewListGet(Model model) {
		System.out.println("GET REVIEW");
		return "reviewBoard/review_list";
	}

	@RequestMapping(value = "/selfPlan_list", method = RequestMethod.GET)
	public String selfPlanListGet(Model model) {
		System.out.println("GET SELFPLAN");
		return "selfPlanBoard/selfPlan_list";
	}

	@RequestMapping(value = "/notice_list", method = RequestMethod.GET)
	public String noticeListGet(Model model) {
		System.out.println("GET NOTICE");
		return "noticeBoard/notice_list";
	}

}
