<%@ page language="java" import="java.sql.*"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="room.Room" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Hotel Rooms</title>
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans&display=swap" rel="stylesheet">
    
    <style type="text/css">
        .flexExpand {
            flex: 1;
        }

        h1 {
            font-family: 'Noto Sans', sans-serif;
        }

        #round1 {
            border-radius: 18px;
            width: 130px;
            height: 18px;
        }

        #round2 {
            border-radius: 4px;
            height: 20px;
        }

        #check {
            border-radius: 4px;
            height: 25px;
            width: 100px;
            margin: 8px 0;
            margin-left: 1.5rem;
            font-family: "Noto Sans", sans-serif;

        }

        input[type=text] {
            width: 90%;
            padding: 0.5em;
            margin: 8px 0;
        }

        input[type=submit] {
            width: 90%;
            background-color: #AE91E5;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-family: "Noto Sans", sans-serif;
            margin-left: 3em;
        }

        .dropdown {
            height: 42px;
            width: 100px;
            margin: 8px 0;
            margin-left: 4rem;
            border-radius: 4px;
            font-family: "Noto Sans", sans-serif;
        }

        .button1 {
            letter-spacing: 0.13em;
            font-size: 0.8rem;
            font-weight: bold;
            display: inline-block;
            padding: 0.75em;
            border-radius: 4px;
            color: white;
            text-decoration: none;
            text-transform: uppercase;
            background-color: #AE91E5;
        }

        .container {
            display: flex;
            justify-content: center;
        }

        .center {
            width: 800px;
            height: 260px;
            background:rgba(0, 0, 0, 0.5);
            color: white;
            font-family: 'Noto Sans', sans-serif;
            border-radius: 5px;
        }

        #background img {
            width: 100%;
            height: 100%;
            position: absolute;
            top: 45px;
            left: 0;
            z-index: -1;
        }

        .button:hover {
            background-color: rgba(0, 0, 0, 0.15);
        }

        .button.outlined {
            border: 1px solid rgba(0, 0, 0, 0.5);
        }

        .button.primary {
            background-color: #DAF7A6;
            color: black;
        }

        .button.disabled {
            color: rgba(0, 0, 0, 0.35)
        }

        body {
            margin: 0;
            font-family: 'Noto Sans', sans-serif;
            min-height: 100vh;
            font-size: small;
        }

        header {
            background-color: #AE91E5;
            color: white;
            padding: 0.5em 0.5rem;
            height: 45px;
            display: flex;
            align-items: center;
            border-bottom: 1px solid rgba(0, 0, 0, 0.5);
        }

        header h1 {
            margin: 0;
            margin-left: 0.25em;
        }

        header .button {
            color: white;
        }

        main {
            padding: 0.5em 0.5rem;
            height: 100%;
        }

        footer {
            position: absolute;
            padding: 0.3rem;
            text-align: center;
            opacity: 0.80;
            color: white;
            font-size: medium;
            bottom: 0;
            width: 100%;
            height: 0.1rem;
        }
        
        .dateHolder {
            max-width: 60em;
            margin: 0 auto;
        }

        .date {
            display: flex;
            align-items: flex-start;
            margin-bottom: 2em;
        }

        .date:last-child {
            margin-bottom: 0;
        }

        .date.past .dateInfo {
            opacity: 0.05;
        }

        .date.today .dateInfo {
            background-color: rgba(0, 0, 0, 0.15);
        }

        .dateInfo {
            flex: 0 0 3em;
            position: -webkit-sticky;
            position: sticky;
            top: 0.5rem;
            font-size: 1.25em;
            font-weight: bold;
            text-align: center;
            color: white;
            /* padding: 0.5em 0.25em; */
            /* line-height: 1; */
        }

        .dateInfo .day {
            font-size: 1em;
        }
        
        .eventHolder {
            flex: 1;
            margin-left: 0.5em;
        }
        
        .event {
            background-color: white;
            margin-bottom: 1em;
            border-left: 0.5em solid #888;
        }

        .event.private {
            border-color: #C8A9D0;
        }

        .event.public {
            border-color: #703380;
        }

        .event:last-child {
            margin-bottom: 0;
        }

        .eventInfoHolder {
            display: flex;
        }

        .eventInfo {
            flex: 1;
            padding: 1em;
        }

        .eventInfo h1 {
            font-size: 1.5em;
            margin: 0.25em 0;
            font-weight: bold;
        }

        .eventInfo h2 {
            font-size: 1.25em;
            margin: 0.25em 0;
            font-weight: normal;
            color: #888;
        }

        .eventIcon {
            padding: 1em;
            color: rgba(0, 0, 0, 0.15);
        }

        .eventActionHolder {
            text-align: right;
            border-top: 1px solid rgba(0, 0, 0, 0.08);
            padding: 0.5em;
        }


        @-webkit-keyframes fadeIn {
            from {opacity: 0;} 
            to {opacity: 0.8;}
        }

        @keyframes fadeIn {
            from {opacity: 0;}
            to {opacity:0.8 ;}
        }

        .home {
            color: white;
            font-weight: bold;
            font-size: 12px;
            text-decoration: none;
        }
    
    </style>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<form id="rooms_form">
		<div id="background">
        	<img src="https://images.dailyhive.com/20190923083339/shutterstock_1508803526.jpg">
    	<header>
        	<i class="fa fa-building-o" aria-hidden="true" style="font-size:30px;"></i>
        	<a href="hotel-mockup.html" id="home" class="home"><h1>Fake Hotel</h1></a>
        	<div class="flexExpand"></div>
        	<button type="submit" class="button1" onClick="setPageSignIn()">Sign In</button>
        	<input type="hidden" name="signInPage" id="sign_in_page"/>
        	<button type="submit" class="button1" onClick="setPageEvents()">View Current Events</button>
        	<input type="hidden" name="eventPage" id="events_page"/>
    	</header>
    	</div>
    	<main>
    	<%
    		List<Room> rooms = (ArrayList<Room>)request.getAttribute("rooms");
    		for(Room room: rooms) {
    	%>
		<div class="date today">
			<div class="dateInfo">
				<div class="day">$<%=room.getPrice()%></div>
			</div>
    		<div class="eventHolder">
    			<div class="event public">
    				<div class="eventInfoHolder">
    					<div class="eventInfo">
    						<h1 class="eventTitle">
    							Room Number: <%=room.getNumber()%> &nbsp; Floor: <%=room.getFloor()%> &nbsp; Number of Beds: <%=room.getBeds()%> 
    							&nbsp; Check Out: <%=room.getCheckOut()%> &nbsp; <button class="button1" onClick="test(<%=room.getNumber()%>, <%=room.getCheckIn()%>, <%=room.getCheckOut()%>)">Book Room</button>
    						</h1>
    					</div>
    				</div>
    			</div>
    		</div>
    	</div>		
    	<%}%>
    	<input type="hidden" name="roomNum" id="room_num"/>
    	<input type="hidden" name="checkInRoom" id="check_in_room"/>
    	<input type="hidden" name="checkOutRoom" id="check_out_room"/>
    	<input type="hidden" name="mainPage" id="main_page"/>
    	</main>
    	<footer>
        	&copy; 2020 FakeHotel, a subsidiary of OtherFakeHotel. All rights reserved.
    	</footer>
	</form>
	<script>
	function test(x, y, z) {
		var room_num = document.getElementById('room_num');
		room_num.value = x;
		var room_check_in = document.getElementById('check_in_room');
		room_check_in.value = y;
		var room_check_out = document.getElementById('check_out_room');
		room_check_out.value = z;
		var set_page = document.getElementById('main_page');
		set_page.value = "book_room";
		submit();
	}
	
	function setPageEvents() {
		var set_page = document.getElementById('events_page');
		set_page.value = "events_page";
		submit();
	}
	
	function setPageSignIn() {
		var set_page = document.getElementById('sign_in_page');
		set_page.value = "sign_in";
		submit();
	}
	
	function submit() {
		var form = document.getElementById('rooms_form');
		form.submit();
	}
	</script>
</body>
</html>