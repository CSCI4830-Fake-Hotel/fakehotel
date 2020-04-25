<%@ page language="java" import="java.sql.*"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="event.Event" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Hotel Events</title>
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

        .button {
            letter-spacing: 0.13em;
            font-size: 0.8rem;
            font-weight: bold;
            display: inline-block;
            padding: 0.75em;
            border-radius: 4px;
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
            font-size: 2em;
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

        .home {
            color: white;
            font-weight: bold;
            font-size: 12px;
            text-decoration: none;
        }

        .modal {
            display: none; /* Hidden by default */
            position: fixed; /* Stay in place */
            z-index: 1; /* Sit on top */
            padding-top: 100px; /* Location of the box */
            left: 0;
            top: 0;
            width: 100%; /* Full width */
            height: 100%; /* Full height */
            overflow: auto; /* Enable scroll if needed */
            background-color: rgb(0,0,0); /* Fallback color */
            background-color: rgba(0,0,0, 0.6); /* Black w/ opacity */
        }

        .modal-content {
            background-color: #fefefe;
            margin: auto;
            padding: 20px;
            border: 1px solid #888;
            width: 80%;
        }

            /* The Close Button */
        .closeConf {
            color: #aaaaaa;
            float: right;
            font-size: 28px;
            font-weight: bold;
        }

        .closeConf:hover,
        .closeConf:focus {
            color: #000;
            text-decoration: none;
            cursor: pointer;
        }
        .closeBlrm {
            color: #aaaaaa;
            float: right;
            font-size: 28px;
            font-weight: bold;
        }

        .closeBlrm:hover,
        .closeBlrm:focus {
            color: #000;
            text-decoration: none;
            cursor: pointer;
        }

        .linkbutton {
         background-color: #888;
         border: none;
         color: white;
         padding: 20px 34px;
         text-align: center;
         text-decoration: none;
         display: inline-block;
         font-size: 15px;
         margin: 4px 2px;
         border-radius: 4px;
         cursor: pointer;
         }
    
    </style>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<form action="HotelServlet" method="POST" id="events_form">
        <div id="confModal" class="modal">
            <div class="model-content">
                <span class="closeConf">&times;</span>
                    <div>
                        <img id="conference" src="fancy_conference_room.jpg" style="height:500px; width: 500px;margin-left: 32.75em;">
                        <p style="font-size: medium;color: white;" align="center">General layout of our conference rooms. </p>
                    </div>
            </div>
        </div>
        <div id="ballroomModal" class="modal">
            <div class="model-content">
                <span class="closeBlrm">&times;</span>
                <div>
                    <img id="ballroomA" src="conference_room_a.jpg" style="height:500px; width: 500px;margin-left: 15em;">
                    <img id="ballroomB" src="conference_room_b.jpg" style="height:500px; width: 500px;margin-left: 1em;">
                    <p style="font-size: medium;color: white;" align="center">On the left is a picture of the Grand Ballroom A; on the right, a picture of the Grand Ballroom B.</p>
                </div>
            </div>
        </div>
    <div id="background">
        <img src="https://images.dailyhive.com/20190923083339/shutterstock_1508803526.jpg">
    	<header>
        	<i class="fa fa-building-o" aria-hidden="true" style="font-size:30px;"></i>
        	<a href="hotel-mockup.html" id="home" class="home"><h1>Fake Hotel</h1></a>
        	<div class="flexExpand"></div>
        	<button type="submit" class="button" onClick="setPageSignIn()">Sign In</button>
        	<input type="hidden" name="signInPage" id="sign_in_page"/>
        	<button type="submit" class="button" onClick="setPage()">View Current Events</button>
        	<input type="hidden" name="eventPage" id="events_page"/>
    	</header>
    </div>
    <main>
        <div align="center">
            <a href="#" class="linkbutton" id="conferenceButton">View Conference Room Layout</a>
            <a href="#" class="linkbutton" id="ballroomButton">View Ballroom Layouts</a>
        </div>
        <% List<Event> events = (ArrayList<Event>)request.getAttribute("events");
        	for(Event event: events) {
        %>
        <div class="date today">
            <div class="dateInfo">
                <div class="name"><%=event.getDateName()%></div>
                <div class="day"><%=event.getDateDay()%></div>
            </div>
            <div class="eventHolder">
                <div class="event public">
                    <div class="eventInfoHolder">
                        <div class="eventInfo">
                            <h1 class="eventTitle"><%=event.getEventTitle()%></h1>
                            <h2 class="eventDescription"><%=event.getEventDescription()%></h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%}%>
    </main>
    <footer>
        &copy; 2020 FakeHotel, a subsidiary of OtherFakeHotel. All rights reserved.
    </footer>
    <script>
        var confModal = document.getElementById("confModal");
        var ballroomModal = document.getElementById("ballroomModal");

        // Get the button that opens the modal
        var confBtn = document.getElementById("conferenceButton");
        var blrmBtn = document.getElementById("ballroomButton");

        // Get the <span> element that closes the modal
        var spanConf = document.getElementsByClassName("closeConf")[0];
        var spanBlrm = document.getElementsByClassName("closeBlrm")[0];

        // When the user clicks the button, open the modal 
        confBtn.onclick = function() {
            confModal.style.display = "block";
        }
        blrmBtn.onclick = function() {
            ballroomModal.style.display = "block";
        }

        // When the user clicks on <span> (x), close the modal
        spanConf.onclick = function() {
            confModal.style.display = "none";
        }
        spanBlrm.onclick = function() {
            ballroomModal.style.display = "none";
        }
        
        function setPage() {
        	var set_page = document.getElementById('events_page');
        	set_page.value = "events_page";
        	var form = document.getElementById('events_form');
        	form.submit();
        }
        
        function setPageSignIn() {
        	var set_page = document.getElementById('sign_in_page');
        	set_page.value = "sign_in";
        	var form = document.getElementById('events_form');
        	form.submit();
        }
        </script>
    </form>
</body>
</html>