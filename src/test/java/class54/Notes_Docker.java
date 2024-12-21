package class54;

public class Notes_Docker {
	/*
	Docker - containerization
	basic commands
	--------------
	docker version
	docker -v
	docker info
	docker --help
	docker login
	
	images commands
	-------
	docker images
	docker pull ubuntu
	docker rmi <image id>
	
	container commands
	----------------
	docker ps
	docker run ubuntu <container id>
	docker start ubuntu<container id>
	docker stop ubuntu <container id>
	docker rm <container id/name>
	
	system commands
	------------------
	docker stats
	docker system df ---> docker system related info
	docker system prune -f --> to all the containers
	
	
	Running Docker Containers by using below commands.
	

	------------------------------------------------------
	docker network create grid
	
	docker run -d -p 4442-4444:4442-4444 --net grid --name selenium-hub selenium/hub
	
	docker run -d --net grid -e SE_EVENT_BUS_HOST=selenium-hub -e SE_EVENT_BUS_PUBLISH_PORT=4442 -e SE_EVENT_BUS_SUBSCRIBE_PORT=4443 selenium/node-chrome
	
	docker run -d --net grid -e SE_EVENT_BUS_HOST=selenium-hub -e SE_EVENT_BUS_PUBLISH_PORT=4442 -e SE_EVENT_BUS_SUBSCRIBE_PORT=4443 selenium/node-firefox

	# to run the yamml file
	# docker-compose up 
	# we we prepare the yaml file run the file using above cmd 
	 
	 */

}
