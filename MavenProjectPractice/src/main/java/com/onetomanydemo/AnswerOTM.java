package com.onetomanydemo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AnswerOTM
{
	@Id
	@Column(name="answer_id")
	private int answerId;

	private String answer;

	@ManyToOne
	private QuestionOTM question;


	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public AnswerOTM(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}
	public QuestionOTM getQuestion() {
		return question;
	}
	public void setQuestion(QuestionOTM question) {
		this.question = question;
	}
	public AnswerOTM() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answer=" + answer + "]";
	}


}
