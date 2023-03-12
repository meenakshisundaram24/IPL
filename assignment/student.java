import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class student extends HttpServlet
{
    private String message;
    String regi;
    public void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException {
    try
    {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        class stud
		{
			int reg;
			String name;
			int rank;
			
			stud(int reg,String name,int rank)
			{
				this.reg=reg;
				this.name=name;
				this.rank=rank;
			}
			public void display()
			{
				out.println("<p>Register number : "+reg+"<br>Name : " +name+"<br>Rank :"+rank+"</p>");
			}
		}
        stud[] arr=new stud[3];
		arr[0] = new stud(4035,"hari",1);
		arr[1] = new stud(4002,"Arun",3);
        regi=request.getParameter("reg");
        int register=Integer.parseInt(regi);
        for(int i=0;i<2;i++)
        {
            if((arr[i].reg)==register)
            {
                arr[i].display();
            }
        }
    
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
}
