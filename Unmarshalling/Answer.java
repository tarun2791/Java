import javax.xml.bind.annotation.XmlElement;
public class Answer
{
	private int id;
	private String answername;
	public Answer()
	{
	
	}
	public Answer(int id, String answername)
	{
		super();
		this.id=id;
		this.answername=answername;
	}
	public int getId()
	{
		return id;
	}	
	public void setId(int id)
	{
		this.id=id;
	}
	@XmlElement(name="answer-name")
	public String getAnswername()
	{
		return answername;
	}	
	public void setAnswername(String answername)
	{
		this.answername=answername;
	}
}