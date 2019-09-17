
<!doctype html>
<html>
	<head>
		<title>Search</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    	<script src="search.js"></script>
		<link type="text/css" rel="stylesheet" href="style.css"/>
	</head>

	<body>

		<div>
			<div>
	<input id="inputSearch" type="text" placeholder="Search Text"></input>
	<button class="button" style="vertical-align:middle" onclick="searchClick();"><span>Search </span></button>

	<div id="metrics" class="hidden">
		<hr>
	Row count :  <span id="count"></span>
	 || Elapsed time for Books API endpoint : <span id="elapsedTimeBooks"></span> ms
	 || Elapsed time for Album API endpoint : <span id="elapsedTimeAlbum"></span> ms
	</div>
	<div id="msg" class="hidden">No Data Found.</div>
	</div>
		<hr>
	<div class="searchTable">
	</div>
		</div>
	</body>
</html>
