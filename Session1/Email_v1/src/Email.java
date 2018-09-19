
public class Email
{
   private String user;
   private String host;
   private String domain;

   public Email(String user, String host, String domain)
   {
      this.user = user;
      this.host = host;
      this.domain = domain;

   }

   public String getuser()
   {
      return user;
   }

   public String gethost()
   {
      return host;

   }

   public String getdomain()
   {
      return domain;
   }

   public String toString()
   {
      return user+ "@"+ host+ "."+ domain;
   }
}
