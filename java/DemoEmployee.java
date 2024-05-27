public class DemoEmployee
{
    private String ename;
    private String emailId;
    private String resaddr;
    private int mobileno;

    public void setEname(String ename) 
    {
        this.ename = ename;
    }

    public void setEmailId(String emailId) 
    {
        this.emailId = emailId;
    }

    public void setResaddr(String resaddr) 
    {
        this.resaddr = resaddr;
    }

    public void setMobileno(int mobileno) 
    {
        this.mobileno = mobileno;
    }
    
    public String toString() 
    {
        return "Employee Name: " + ename + ", Email: " + emailId + ", Address: " + resaddr + ", Mobile No: " + mobileno;
    }
    
    public static void main(String[] args)
    {
        DemoEmployee EmpDe = new DemoEmployee();

        EmpDe.setEname("Darshak");
        EmpDe.setEmailId("darshakribadiya333@gmail.com");
        EmpDe.setResaddr("Ahemdabad");
        EmpDe.setMobileno(994786795);

        System.out.println(EmpDe);

        DemoEmployee ed1 = new DemoEmployee();

        ed1.setEname("Subham");
        ed1.setResaddr("Vadodara");

        System.out.println(ed1);
    }
}