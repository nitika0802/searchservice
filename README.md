# searchservice

Project Description:
Display list of Books from Google Book API and list of albums from iTunes API, based on search term. The result list size for book/album 
can be configured in config.properties file. The rest endpoint can be directly used to query the result list based on search term. 
Also, project provides a UI for search operation. The elapsed time to query books and albums is also displayed on the UI.

Rest endpoint URL:
http://localhost:8080/searchservice/webservice/v1?searchTerm=
Examples:
http://localhost:8080/searchservice/webservice/v1?searchTerm=cloud
{"list":[{"title":"Cloud Computing","authorOrArtists":["Kris Jamsa"],"bookOrAlbum":"Book"},{"title":"Cloud Computing","authorOrArtists":["Rajkumar Buyya","James Broberg","Andrzej M. Goscinski"],"bookOrAlbum":"Book"},{"title":"Cloud Computing","authorOrArtists":["Michael Miller"],"bookOrAlbum":"Book"},{"title":"The Cloud Book","authorOrArtists":["Tomie dePaola"],"bookOrAlbum":"Book"},{"title":"Cloud Computing","authorOrArtists":["John W. Rittinghouse","James F. Ransome"],"bookOrAlbum":"Book"},{"title":"Over Clouds","authorOrArtists":["Cloud"],"bookOrAlbum":"Album"},{"title":"Cloud","authorOrArtists":["Elias"],"bookOrAlbum":"Album"},{"title":"cloud (feat. vocaloid \"Kagamine Rin\")","authorOrArtists":["E.L.V.N"],"bookOrAlbum":"Album"},{"title":"Winter Nights","authorOrArtists":["Cloud"],"bookOrAlbum":"Album"},{"title":"Cloud","authorOrArtists":["Sia"],"bookOrAlbum":"Album"}],"elapsedTimeBook":511,"elapsedTimeAlbum":20}

http://localhost:8080/searchservice/webservice/v1?searchTerm=cloud%20computing
{"list":[{"title":"Cloud Computing","authorOrArtists":["Kris Jamsa"],"bookOrAlbum":"Book"},{"title":"Cloud Computing","authorOrArtists":["Rajkumar Buyya","James Broberg","Andrzej M. Goscinski"],"bookOrAlbum":"Book"},{"title":"Cloud Computing","authorOrArtists":["Nikos Antonopoulos","Lee Gillam"],"bookOrAlbum":"Book"},{"title":"Cloud Computing","authorOrArtists":["Zaigham Mahmood"],"bookOrAlbum":"Book"},{"title":"Cloud Computing","authorOrArtists":["Venkata Josyula","Malcolm Orr","Greg Page"],"bookOrAlbum":"Book"},{"title":"","authorOrArtists":["Marcia R.T. Pistorious"],"bookOrAlbum":"Album"},{"title":"The Cloudcast - Cloud Computing","authorOrArtists":["Aaron Delp \u0026 Brian Gracely"],"bookOrAlbum":"Album"},{"title":"Cloud Computing","authorOrArtists":["Jefferson Santos de AraÃºjo"],"bookOrAlbum":"Album"},{"title":"Cloud Computing","authorOrArtists":["Alex Nkenchor Uwajeh"],"bookOrAlbum":"Album"},{"title":"Cloud Computing","authorOrArtists":["FIAP - Jefferson Santos de Araujo"],"bookOrAlbum":"Album"}],"elapsedTimeBook":598,"elapsedTimeAlbum":122}

Front-end URL:
http://localhost:8080/searchservice/index.jsp

Technologies and Tools Used:
Java, Spring MVC, AJAX, JavaScript, JSP, CSS, Junit, Intellij, Git, Maven, Apache Tomcat
These technologies were used as this is the current tech stack I work on. Also, I felt that these were suited well, based on the project requirement.
The project has been designed using Interfaces and well distinguished classes, which make it scalable in near future. URL versioning is achieved. User can keep multiple environment specific versions of properties file, to set maximum fetch size.

Running the application--
•	Setup Apache Tomcat server on local machine
•	Make sure that your server listens to port 8080. Check the server.xml configuration file under conf folder of apache installation 
directory
•	Place the searchservice.war file in webapps folder of apache installation directory (war file can be found under target folder 
of the project
•	Go to bin folder under apache installation directory and start tomcat server by double clicking startup.bat
•	Once the server is up and running, and the application is deployed, proceed to testing the url and rest endpoints.
