package com.onetomanydemo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class QuestionOTM
{
	@Id
	@Column(name="question_id")
	private int questionId;

	private String question;

	@OneToMany
	private List<AnswerOTM> answers;

	private AnswerOTM answer;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}


	public List<AnswerOTM> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerOTM> answers) {
		this.answers = answers;
	}

	public AnswerOTM getAnswer() {
		return answer;
	}

	public void setAnswer(AnswerOTM answer) {
		this.answer = answer;
	}

	public QuestionOTM() {
		super();
		// TODO Auto-generated constructor stub
	}


	QuestionOTM(int questionId, String question, List<AnswerOTM> answers, AnswerOTM answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}


}
