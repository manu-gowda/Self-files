<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

<title>x-workz</title>

</head>
<body>
<nav class="navbar navbar-green bg-dark">
			<div class="container-fluid">
				<img
					src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
					class="img-fluid"  hight="80px" width="80px">

				<form class="d-flex">
					<input class="form-control me-3" type="search" placeholder="Search"
						aria-label="Search"> 

				</form>
			</div>
		</nav>
		
		<form action="email" method="get">
		<pre>
	<label>Email is :${Email}</label>		
	<input type="submit" value="email" />		
			</pre>
	</form>
	<form action="mob" method="get">
		<pre>
	<label>Mob is :${mob}</label>		
	<input type="submit" value="mob" />
	</pre>
	</form>
	<form action="aadhar" method="get">
		<pre>
	<label>Aadhar is :${Aadhar}</label>	
	<input type="submit" value="Aadhar" />
	</pre>
	</form>
	<form action="age" method="get">
		<pre>
	<label>Age is :${Age}</label>		
	<input type="submit" value="Age" />
	</pre>
	</form>


	<form action="date" method="get">
		<pre>
	<label>Date is :${Dob}</label>		
	<input type="submit" value="date" />
	</pre>
	</form>

	<form action="sal" method="get">
		<pre>
	<label>Salary is :${sal}</label>		
	<input type="submit" value="date" />
	</pre>
	</form>
	<form action="best" method="get">
		<ul>
			<label>BestFriend </label>
			<input type="submit" value="Bestfriend" />
			<c:forEach items="${frds}" var="name">
				<li>${name}</li>

			</c:forEach>
		</ul>
	</form>

	<form action="place" method="get">

		<ol>
			<label>Most Visited Places </label>
			<input type="submit" value="Place" />
			<c:forEach items="${place}" var="placename">
				<li>${placename}</li>
			</c:forEach>
		</ol>
	</form>

	<form action="set" method="get">

		<ol>
			<label>Skill Set </label>
			<input type="submit" value="SkillSet" />
			<c:forEach items="${skill}" var="set">
				<li>${set}</li>
			</c:forEach>
		</ol>
	</form>

	<form action="education" method="get">
		<input type="submit" value="education" />
		<h6>primarySchool :${edudto.primarySchool}</h6>
		<h6>highSchool :${edudto.highSchool}</h6>
		<h6>diploma :${edudto.diploma}</h6>
		<h6>deegre :${edudto.deegre}</h6>
		<h6>primary :${edudto.primary}</h6>
		<h6>high :${edudto.high}</h6>
		<h6>deegr :${edudto.deegr}</h6>
		<h6>completed :${edudto.completed}</h6>
	
	</form>
	<form action="chat">
		<input type="submit" value="chat" />
		<h6>name :${gobi.name}</h6>
		<h6>fromState :${gobi.fromState}</h6>
		<h6>cook :${gobi.cook}</h6>
		<h6>hotel :${gobi.hotel}</h6>
		<h6>area :${gobi.area}</h6>
		<h6>mainIngredient :${gobi.mainIngredient}</h6>
		<h6>typeOfChutney :${gobi.typeOfChutney}</h6>
		<h6>price :${gobi.price}</h6>
		<h6>taste :${gobi.taste}</h6>
		<h6>worthy :${gobi.worthy}</h6>
		<h6>ratings :${gobi.ratings}</h6>
		<h6>wantAgain :${gobi.wantAgain}</h6>
	</form>

	<form action="mobile">
		<input type="submit" value="mob">
		<h6>name :${mob.name}</h6>
		<h6>ownerName :${mob.ownerName}</h6>
		<h6>companyName :${mob.companyName}</h6>
		<h6>price :${mob.price}</h6>
		<h6>rom :${mob.rom}</h6>
	</form>

	<form action="beverage">
		<input type="submit" value="Beverage" />
		<h6>name :${bedto.name}</h6>
		<h6>company :${bedto.company}</h6>
		<h6>flavour :${bedto.flavour}</h6>
		<h6>shop :${bedto.shop}</h6>
		<h6>price :${bedto.price}</h6>
		<h6>quantity:${bedto.quantity}</h6>
		<h6>good:${bedto.good}</h6>
		<h6>useful:${bedto.useful}</h6>
		

	</form>
	<form action="family">
		<input type="submit" value="Family" />
		<h6>surname :${fadto.surname}</h6>
		<h6>name :${fadto.name}</h6>
		<h6>father :${fadto.father}</h6>
		<h6>mother :${fadto.mother}</h6>
		<h6>sister :${fadto.sister}</h6>
		<h6>brother :${fadto.brother}</h6>
		<h6>grandFather :${fadto.grandFather}</h6>
		<h6>grandMother${fadto.grandMother}</h6>
		<h6>grandFatherAge${fadto.grandFatherAge}</h6>
		<h6>grandMotherAge${fadto.grandMotherAge}</h6>

	</form>


		


</body>
</html>