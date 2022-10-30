package ex_4_1;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;


class Student { 
	   public int id;
	   @JsonIgnore
	   public String systemId;
	   public int rollNo;
	   public String name;

	   Student(int id, int rollNo, String systemId, String name){
	      this.id = id;
	      this.systemId = systemId;
	      this.rollNo = rollNo;
	      this.name = name;
	   }
	}


public class JsIgnore {
	public static void main(String args[]){
	      ObjectMapper mapper = new ObjectMapper();
	      try{
	         Student student = new Student(1,11,"1ab","Mark");       
	         String jsonString = mapper
	            .writerWithDefaultPrettyPrinter()
	            .writeValueAsString(student);
	         System.out.println(jsonString);
	      }
	      catch (IOException e) { 
	         e.printStackTrace();
	      }     
	   }
	

}
