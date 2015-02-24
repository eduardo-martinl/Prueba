package es.uniovi.asw.parsers.json;

import java.util.ArrayList;
import java.util.List;

public class Question {

	private String id;
	private String category;
	private String text;
	private String correctAnswer;
	private List<String> wrongAnswers;


	public Question(){
		this.wrongAnswers = new ArrayList<String>();
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public List<String> getWrongAnswers(){
		return wrongAnswers;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", category=" + category + ", text="
				+ text + ", correctAnswer=" + correctAnswer + ", wrongAnswers="
				+ wrongAnswers + "]";
	}

	
	
}
