import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToObject
{
	public static void main(String args[])
	{
		try
		{
			File file=new File("question.xml");
			JAXBContext jaxbContext=JAXBContext.newInstance(Question.class);
			Unmarshaller jaxbUnmarshaller=jaxbContext.createUnmarshaller();
			Question ques=(Question)jaxbUnmarshaller.unmarshal(file);
			
			System.out.println(ques.getId()+".  "+ques.getQuestionname());
			System.out.println("Answers : ");
			List<Answer> list=ques.getAnswers();
			for(Answer ans:list)
			{
				System.out.println(ans.getId()+". "+ans.getAnswername());
				
			}
		}
		catch(JAXBException e)
		{
			e.printStackTrace();
		}
	}
}

