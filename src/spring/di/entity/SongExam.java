package spring.di.entity;

public class SongExam implements Exam {

	private int kor;
	private int eng;
	private int math;
	private int science;
	
	@Override
	public int total() {
		// TODO Auto-generated method stub
		return kor+eng+math+science;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return total() / 4.0f ;
	}

}
