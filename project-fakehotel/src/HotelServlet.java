

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import event.Event;
import room.Room;

/**
 * Servlet implementation class HotelServlet
 */
@WebServlet("/HotelServlet")
public class HotelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HotelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Sign In:" + request.getParameter("signInPage"));
		System.out.println("Event Page: " + request.getParameter("eventPage"));
		System.out.println("Main Page: " + request.getParameter("mainPage"));
		if (request == null) {
			System.out.println("What happened?");
		}
		if(request.getParameter("mainPage") != null && request.getParameter("mainPage").contentEquals("show_rooms")) {
			System.out.println("go to show rooms");
			/*
			 * Partially hard-coded room which is used to test if the page is retrieving information from the front page correctly. 
			 */
			String price = request.getParameter("price");
			String check_in = request.getParameter("checkIn");
			String check_out = request.getParameter("checkOut");
			System.out.println("Price: " + price + " Check In Date: " + check_in + " Check Out Date: " + check_out);
			//response.getWriter().append("Price: " + price + " Check In Date: " + check_in + " Check Out Date: " + check_out);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("rooms.jsp");
			List<Room> rooms = new ArrayList<Room>();
			Room room = new Room();
			room.setPrice(price);
			room.setFloor("3");
			room.setGuests(2);
			rooms.add(room);
			request.setAttribute("rooms", rooms);
			requestDispatcher.forward(request, response);
		} else if (request.getParameter("eventPage") != null && request.getParameter("eventPage").contentEquals("events_page")) {
			/*
			 * Hard coded events used to test if the events page is retrieving everything correctly- it will draw actual
			 * events dynamically from the database at run time.
			 */
			System.out.println("go to event page");
			List<Event> events = new ArrayList<Event>();
			Event event1 = new Event();
			event1.setDateDay("1");
			event1.setDateName("April");
			event1.setEventDescription("Grand Ballroom B");
			event1.setEventTitle("25th Annual Changes in Financial Analyzation Methods Conference");
			Event event2 = new Event();
			event2.setDateDay("23");
			event2.setDateName("April");
			event2.setEventDescription("AVP Conference Room");
			event2.setEventTitle("JPM Stakeholder's Meeting");
			events.add(event1);
			events.add(event2);
			request.setAttribute("events", events);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("hotel_events.jsp");
			requestDispatcher.forward(request, response);
		} else if (request.getParameter("signInPage") != null && request.getParameter("signInPage").contentEquals("sign_in")) {
			/*
			 * Switch to "Sign In" page.
			 */
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("hotel_sign_in.html");
			requestDispatcher.forward(request, response);
		} else if (request.getParameter("mainPage") != null && request.getParameter("mainPage").contentEquals("main_page")) {
			/*
			 * Transfer back to main page, but with log in information- this info should be stored in the database. 
			 */
			System.out.println("USERNAME: " + request.getParameter("username"));
			System.out.println("PASSWORD: " + request.getParameter("password"));
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("hotel-mockup.html");
			requestDispatcher.forward(request, response);
		} else {
			System.out.println("Whatever else:");
			System.out.println(request.getParameter("mainPage") + request.getParameter("eventPage"));
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
