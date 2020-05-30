# CICD Initials

* pre reqs: docker swarm

## create network docker
<i>docker network create --driver overlay cicd</i>

## build image and deploy jenkins stack cicd
<i>docker build -t jenkins:0.0.1 -f Dockerfile .</i><br>
<i>docker stack deploy -c jenkins.yml cicd</i>

## deploy sonar stack cicd
<i>docker stack deploy -c sonar.yml cicd</i>