<%@page import="com.project.jdbc.TestJDBC" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Hibernate - Final-Project-Books-Info-App</title>
<link rel="stylesheet" type="text/css" href="css/index.css"/> 
<script src="js/index.js"></script>
</head>
<body>


	<section id="testJDBC">
		<h2>Test JDBC Connection</h2><hr/>
		<jsp:include page="index-testJDBC.html"></jsp:include>
		<jsp:include page="index-testJDBC.jsp"></jsp:include>

	</section>
	
	<section id="login_form">
		<form  method="POST" target="_blank" action="index-response.jsp">
			<h2>User Login Section</h2><hr/>    
			User Name
			<input type="text" id="id_user_name" name="user_name" minlength="4" maxlength="12" size="16" required/>&nbsp;&nbsp;&nbsp;&nbsp;		
			Password
			<input type="password" id="id_password" name="user_password" minlength="4" maxlength="12" size="16" required/><br/>		
			<input type="submit" value="Login" class="submit_button"/><br/>
		</form><br/>
	</section>

	<section id="search_form">
		<form method="GET" action="form-review-response.jsp">
			<h2>Search Books</h2><hr/>
			Keyword
			<input type="text" id="id_search_keyword" name="search_keyword" size="24"/>
			From
			<select id="id_creteria" name="creteria" size="1">
		 		<option value="">Choose From Below</option>
		        <option value="book_title">Title</option>
		        <option value="book_author">Author(Currently Not Supported ... )</option>
		        <option value="book_id">ID(Currently Not Supported ... )</option>
		        <option value="book_year">Publish Year(Currently Not Supported ... )</option>
		    </select><br/>
		    		                
			<!-- multiple choices of dropdown -->
			<!--  [select id="id_choices" name="choices[]" multiple size="5"]-->
			<!-- use "multiple" @ select for multiple choices -->
			<!-- Meanwhile, use array for name: "favBrowser[]" -->

			<input type="submit" value="Search" class="submit_button" />
			
	    </form><br/>
	</section>

	<section id="admin_form">
		<form>
			<h2>Administrate Books</h2><hr/>
			Adding<br/>
			Modifying<br/>
			Deleting<br/><br/>
		</form>
	</section>

	<section id="addtional_form">
		<form method="GET" action="form-review-response.jsp">
			<h2>Future Fuctions (Coming Soon ... )</h2><hr/>
		
		                <br/><em>Form - Input: password</em><br/>
		                <label for="psd_user_password">Password</label>
		                <input type="password" id="psd_user_password" name="passWord" minlength="4" maxlength="12" size="8" required/><br/>
		                <!-- minlength/maxlength to set limit digits, size is only for how it display -->
		
		                <br/><em>Form - Input: checkbox  (checkboxes use different names V.S. radios use same same)</em><br/>
		                <strong>Courses Completed</strong><br/>
		                <input type="checkbox" name="checkBoxXML" id="chb_xml"checked/>
		                <label for="chb_xml">XML&nbsp&nbsp&nbsp</label>
		
		
		                <input type="checkbox" name="checkBoxHTML" id="chb_html"/>
		                <label for="chb_html">HTML&nbsp&nbsp&nbsp</label>
		
		                <input type="checkbox" name="checkBoxCSS" id="chb_CSS"/>
		                <label for="chb_CSS">CSS&nbsp&nbsp&nbsp</label>  <br/>
		
		                <br/><em>Form - Input: radio  (checkboxes use different names V.S. radios use same same)</em><br/>
		                <strong>Marriage Status</strong><br/>
		                <input type="radio" name="radioMarriage" id="radio_marriage_single"checked/>
		                <label for="radio_marriage_single">Single&nbsp&nbsp&nbsp</label>
		
		                <input type="radio" name="radioMarriage" id="radio_marriage_married"/>
		                <label for="radio_marriage_married">Married&nbsp&nbsp&nbsp</label>
		
		                <input type="radio" name="radioMarriage" id="radio_marriage_divorced"/>
		                <label for="radio_marriage_divorced">Divorced&nbsp&nbsp&nbsp</label>
		
		                <input type="radio" name="radioMarriage" id="radio_marriage_sd"/>
		                <label for="radio_marriage_sd">Spouse Deceased&nbsp&nbsp&nbsp</label> <br/>
		
		                <br/><em>Form - Input: file</em><br/>
		                <label for="file_upload">Upload Your CV Here:</label>
		                <input type="file" name="cvUpload" id="file_upload" accept=".pdf" /><br/>
		                <!-- accept values: ".pdf", ".jpg", "audio/*", "video/*" -->
		
		                <br/><em>Form - Input: hidden</em><br/>
		                <label for="hidden_content">Hidden (won't display, but available @ source inspection</label>
		                <input type="hidden" name="hiddenContent" id="hidden_content" value="I have a secret"/><br/>
		
		                <br/><em>Form - Input: button/submit/reset (value)</em><br/>
		                <input type="button" value="Button(Input)"/>
		                <input type="submit" value="Submit(Input)"/>
		                <input type="reset" value="Reset(Input)"/><br/>
		
		
		
		                <br/><em>Form - Button: buttons/submit/reset (html)</em><br/>
		                <button type="button">Button(Button)</button>
		                <button type="submit">Submit(Button)</button>
		                <button type="reset">Reset(Button)</button><br/>
		
		                <br/><em>Form - Input (html5 types - to be tested)</em><br/>
		                <mark>color,date,datetime_local,email,month,number,range, search, tel, time, url, week</mark><br/>
		
		                color <input type="color" /><br/>
		                date <input type="date" /><br/>
		                datetime-local <input type="datetime-local" /><br/>
		                email <input type="email" /><br/>
		                month <input type="month" /><br/>
		                number <input type="number" /><br/>
		                range <input type="range" /><br/>
		                search <input type="search" /><br/>
		                tel <input type="tel" /><br/>
		                time <input type="time" /><br/>
		                url <input type="url" /><br/>
		                week <input type="week" /><br/>
		


		
		                <br/><em>Form - textarea</em><br/>
		                <label for="ta_message">Leave Your Meassage Below</label><br/>
		                <textarea name="textAreaMessage" id="ta_message" cols="38" rows="5"></textarea>
		</form>
		<br/>
	</section>

</body>
</html>