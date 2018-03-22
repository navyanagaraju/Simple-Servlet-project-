<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	    <title>Message Poster</title>
	    <style type="text/css">
	    	.paddingBtm {
	    		padding-bottom: 12px;
	    	}
	    </style>
	</head>
	<body>
	    <center>
	        <h2>Post your Message</h2>
	        <form id="MessagePosterFormId" name="MessagePosterForm" method="post" action="messagePosterServlet">
	            <div id="ModuleNameDiv" class="paddingBtm">
	            	<span id="name">Module Name: </span><input type="text" name="name" />
	            </div>
	            <div id="MessageDiv" class="paddingBtm">
	            	<span id="message">Post Message </span><textarea name="message" cols="200" rows="10"></textarea>
	            </div>
	            <div id="SubmitBtn">
	            	<input id="btn" type="submit" value="Submit" />
	            </div>
	        </form>
	    </center>
	</body>
</html>