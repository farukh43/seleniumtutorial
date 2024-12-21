package class55;

public class Notes_CICD {
	/*
	 Day-55
	-------
	pom.xml
	--------
	dependencies --- download required dependency jar for project
	plugins  ---> to compile and run the project
	
	1) maven compiler plugin
	2) maven surefire plugin
	
	Install maven OS level
	----------------------
	https://maven.apache.org/download.cgi
	
	C:\Program Files\apache-maven-3.9.6\bin
** configure the maven path in environment variable

	open command prompt --> mvn -version
	
	Project Location
	-----------------
	C:\Automation\OpencartV3040
	
	cd C:\Automation\OpencartV3040
	mvn test
	
	pre-requistes
	-------------------
	1) Git installation
	2) Create an account with github
	
	https://github.com/dashboard
	
	Create a githubRepository
	-------------------------------
	https://github.com/farukh43/OpencartV3040.git
	
	Git and Github workflow
	---------------------------
	1) create a new local repository (one time)
	git init
	
	2)provided user info to git repor (one Time)
	
	git config --global user.name farukh43
	git config --global user.email farukh43@gmail.com
	
	3)Adding files/folders to staging/indexing
		git add -A --> add all the file and folders to staging
		git add filename
		git add *.jave
		git add foldername
		
	4)Commit the code into local(git) repository
		git commit -m "commit message"
	
	5) connect local repository with remote rep (one Time)
	 	git remote add origin https://github.com/farukh43/OpencartV3040.git

	6) push the code into remote repository.
	 git push origin master
	 
	 Note - Generate your token insted of password
	
	ROUND 2
	-----------
	1) git add -A 
	2) git commit -m "commit message"
	3) git push origin master
	
	pull the files from remote repository
	-------------------------------------
	git pull "https://github.com/farukh43/OpencartV3040"
	
	
	clone remote repository to local system
	------------------------
	git clone "URL"
	
	
	 */

}
