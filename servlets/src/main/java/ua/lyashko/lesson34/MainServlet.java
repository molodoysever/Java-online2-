package ua.lyashko.lesson34;

import lombok.SneakyThrows;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainServlet extends HttpServlet {

    private String user1;
    private String user2;
    private String user3;
    private String user4;

    @Serial
    private static final long serialVersionUID = -8948379822734246956L;

    @SneakyThrows
    @Override
    public void init ( ServletConfig config ) {
        super.init ( config );
        this.user1 = config.getInitParameter ( "user1" );
        this.user2 = config.getInitParameter ( "user2" );
        this.user3 = config.getInitParameter ( "user3" );
        this.user4 = config.getInitParameter ( "user4" );
    }

    @Override
    protected void doGet ( HttpServletRequest req , HttpServletResponse resp ) throws IOException {
        PrintWriter responseBody = resp.getWriter ( );
        String defUser = req.getRemoteAddr () + " User-Agent: " + req.getHeader ("User-Agent" );
        List<String> userIp = new ArrayList<> ( );
        userIp.add ( user1 );
        userIp.add ( user2 );
        userIp.add ( user3 );
        userIp.add ( user4 );
        userIp.add ( defUser );

        resp.setContentType ( "text/html" );
        responseBody.println ( "<html>" );
        responseBody.println ( "<head> <title> last 5 user IP </title> </head>" );
        for (int i = 0; i < userIp.size ( ); i++) {
            if (Objects.equals ( userIp.get ( i ) , defUser )) {
                responseBody.println ( "<b> user " + ( i + 1 ) + " ip = " + userIp.get ( i ) + "</b>" );
            } else {
                userIp.set ( i , userIp.get ( i ) + " User-Agent: " + req.getHeader ( "User-Agent" ) );
                responseBody.println ( "<p>user " + ( i + 1 ) + " ip = " + userIp.get ( i ) + "</p>" );
            }
        }
        responseBody.println ( "<html>" );
    }

    @Override
    public void destroy () {
        System.out.println ( getServletName ( ) + " destroyed" );
    }
}
