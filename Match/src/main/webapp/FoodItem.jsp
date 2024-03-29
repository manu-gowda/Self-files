<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<title>X-Workz</title>

</head>
<body>
	<div>
		<nav class="navbar navbar-green bg-dark">
			<div class="container-fluid">
				<img
					src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
					class="img-fluid"  hight="80px" width="80px">

				<form class="d-flex">
					<input class="form-control me-3" type="search" placeholder="Search"
						aria-label="Search"> <a class="btn btn-outline-primary"
						>FoodItem</a>
				</form>
			</div>
		</nav>
	</div>
<div class="container-xxl">
	<form action="send" method="get">
		<div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Food
					Name</label> <input type="text" class="form-control"
					id="exampleFormControlInput1" placeholder="Enter your Food Name" name="name">
			</div>

		</div>
		<div>
			<select class="form-select" aria-label="Default select example" name="type">
				<option selected  >Select Food Type</option>
				<option value="Veg">Veg</option>
				<option value="Non-Veg">Non-Veg</option>
				<option value="Both">Both</option>
			</select>
		</div>
		<div>
			<label for="customRange2" class="form-label">Quantity</label> <input
				type="range" class="form-range" min="0" max="5" id="customRange2" name="range">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Price
			</label> <input type="text"  class="form-control"
				id="exampleFormControlInput1" placeholder="Enter your Food price" name="price">
		</div>
		<div>
			<input type="submit" class="btn btn-dark" value="Send" name="send" />

		</div>

	</form>
	</div>
</body>
</html>