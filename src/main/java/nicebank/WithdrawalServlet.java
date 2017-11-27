package nicebank;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by juan.hernandez on 11/27/17.
 */
public class WithdrawalServlet extends HttpServlet {

    private CashSlot cashSlot;
    private Account account;

    public WithdrawalServlet(CashSlot cashSlot, Account account) {
        this.cashSlot = cashSlot;
        this.account = account;
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Teller teller = new AutomatedTeller(cashSlot);
        int amount = Integer.parseInt(request.getParameter("amount"));
        teller.witdrawFromTeller(account, new Money(amount, 0));

        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println(
                "<html><head><title>ATM</title></head>" +
                        "<body>Please take your $" + amount + "</body></html>");

    }
}
